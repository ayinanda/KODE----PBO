package Jobsheet4.Tugas;

import java.util.ArrayList;
import java.util.Date;

public class RestaurantManager {
    private String restaurantName;
    private ArrayList<Customer> customers;
    private ArrayList<Meja> tables;
    private ArrayList<Reservation> reservations;

    public RestaurantManager(String restaurantName) {
        this.restaurantName = restaurantName;
        this.customers = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }
    public Reservation createReservation(Customer customer, Meja meja, Date tanggal, int jumlahTamu) {
        if (meja.isAvailableAt(tanggal)) { 
            double deposit = jumlahTamu * 50000; 
            Reservation newReservation = new Reservation("RES" + (reservations.size() + 1), customer, meja, tanggal, jumlahTamu, deposit);
            reservations.add(newReservation);
            customer.addReservation(newReservation);
            meja.addReservation(newReservation);
            
            System.out.println("Reservasi berhasil dibuat: " + newReservation.getIdReservasi());
            return newReservation;
        } else {
            System.out.println("Meja tidak tersedia pada tanggal tersebut.");
            return null;
        }
    }
    public ArrayList<Meja> checkAvailability(Date tanggal, int jumlahTamu) {
        ArrayList<Meja> availableTables = new ArrayList<>();
        for (Meja table : tables) {
            if (table.isAvailableAt(tanggal) && table.getKapasitas() >= jumlahTamu) {
                availableTables.add(table);
            }
        }
        return availableTables;
    }
    public String generateDailyReport() {
        int totalReservations = reservations.size();
        int confirmedReservations = 0;
        double totalRevenue = 0;
        
        for (Reservation res : reservations) {
            if (res.iskonfirmasi()) {
                confirmedReservations++;
                totalRevenue += res.getTotalBill();
            }
        }
        
        return "Laporan Harian " + restaurantName +"\nTotal Reservasi: " + totalReservations +"\nReservasi Terkonfirmasi: " + confirmedReservations +"\nPendapatan: Rp" + totalRevenue +"\nMeja Tersedia: " + (tables.size() - confirmedReservations) + "/" + tables.size();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void addTable(Meja table) {
        tables.add(table);
    }
    public String getRestaurantName() {
        return restaurantName;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public ArrayList<Meja> getTables() {
        return tables;
    }
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}