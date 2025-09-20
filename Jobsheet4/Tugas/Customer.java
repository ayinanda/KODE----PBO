package Jobsheet4.Tugas;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String idCustomer;
    private String nama;
    private String phoneNumber;
    private String email;
    private List<Reservation> reservations;

    public Customer(String idCustomer, String nama, String phoneNumber, String email) {
        this.idCustomer = idCustomer;
        this.nama = nama;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.reservations = new ArrayList<>();
    }
    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
    public String getCustomerInfo() {
        return "ID: " + idCustomer + 
               "\nNama: " + nama + 
               "\nTelepon: " + phoneNumber + 
               "\nEmail: " + email + 
               "\nJumlah Reservasi: " + reservations.size();
    }
    public void updateMembershipLevel() {
        System.out.println("Membership level updated for customer: " + nama);
    }
    public String getIdCustomer() {
        return idCustomer;
    }
    public String getNama() {
        return nama;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}

