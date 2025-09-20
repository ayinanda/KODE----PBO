package Jobsheet4.Tugas;
import java.util.Date;

public class Reservation {
    private String idReservasi;
    private Customer customer;
    private Meja meja;
    private Date reservationDate;
    private int jumlahTamu;
    private Date createdDate;
    private double depositAmount;
    private double totalBill;
    private boolean confirmed;

    public Reservation(String idReservasi, Customer customer, Meja meja, Date reservationDate, 
                      int jumlahTamu, double depositAmount) {
        this.idReservasi = idReservasi;
        this.customer = customer;
        this.meja = meja;
        this.reservationDate = reservationDate;
        this.jumlahTamu = jumlahTamu;
        this.createdDate = new Date(); 
        this.depositAmount = depositAmount;
        this.totalBill = 0.0;
        this.confirmed = false;
    }
    public void confirmReservation() {
        this.confirmed = true;
        System.out.println("Reservasi " + idReservasi + " telah dikonfirmasi.");
    }
    public String getReservationInfo() {
        return "ID Reservasi: " + idReservasi +
               "\nCustomer: " + customer.getNama() +
               "\nMeja: " + meja.getNomorMeja() +
               "\nTanggal: " + reservationDate +
               "\nJumlah Tamu: " + jumlahTamu +
               "\nStatus: " + (confirmed ? "Terkonfirmasi" : "Menunggu Konfirmasi") +
               "\nDeposit: Rp" + depositAmount;
    }
    public boolean cancelReservation() {
        if (!confirmed) {
            System.out.println("Reservasi " + idReservasi + " dibatalkan.");
            return true;
        } else {
            System.out.println("Reservasi sudah dikonfirmasi, tidak dapat dibatalkan.");
            return false;
        }
    }
    public void addToBill(double amount) {
        this.totalBill += amount;
    }
    public String getIdReservasi() {
        return idReservasi;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Meja getMeja() {
        return meja;
    }
    public Date getReservationDate() {
        return reservationDate;
    }
    public int getJumlahTamu() {
        return jumlahTamu;
    }
    public double getDepositAmount() {
        return depositAmount;
    }
    public double getTotalBill() {
        return totalBill;
    }
    public boolean isConfirmed() {
        return confirmed;
    }
}