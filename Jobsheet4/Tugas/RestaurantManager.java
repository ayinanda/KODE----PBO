package Jobsheet4.Tugas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RestaurantManager {
    private String restaurantName;
    private List<Customer> customers;
    private List<Meja> tables;
    private List<Reservation> reservations;

    public RestaurantManager(String restaurantName) {
        this.restaurantName = restaurantName;
        this.customers = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }
    public Reservation createReservation(Customer customer, Meja meja, Date tanggal, int jumlahTamu) {
        if (meja.isAvailableAt(tanggal, "18:00-20:00")) { 
            double deposit = jumlahTamu * 50000; 
            Reservation newReservation = new Reservation(
                "RES" + (reservations.size() + 1),
                customer,
                meja,
                tanggal,
                jumlahTamu,
                deposit
            );
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
    public List<Meja> checkAvailability(Date tanggal, int jumlahTamu) {
        List<Meja> availableTables = new ArrayList<>();
        for (Meja table : tables) {
            if (table.isAvailableAt(tanggal, "18:00-20:00") && table.getKapasitas() >= jumlahTamu) {
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
            if (res.isConfirmed()) {
                confirmedReservations++;
                totalRevenue += res.getTotalBill();
            }
        }
        
        return "Laporan Harian " + restaurantName +
               "\nTotal Reservasi: " + totalReservations +
               "\nReservasi Terkonfirmasi: " + confirmedReservations +
               "\nPendapatan: Rp" + totalRevenue +
               "\nMeja Tersedia: " + (tables.size() - confirmedReservations) + "/" + tables.size();
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
    public List<Customer> getCustomers() {
        return customers;
    }
    public List<Meja> getTables() {
        return tables;
    }
    public List<Reservation> getReservations() {
        return reservations;
    }
}