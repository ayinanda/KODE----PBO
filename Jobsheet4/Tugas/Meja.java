package Jobsheet4.Tugas;

import java.util.ArrayList;
import java.util.Date;

public class Meja {
    private String idMeja;
    private String nomorMeja;
    private int kapasitas;
    private String lokasi;
    private String tipeMeja;
    private ArrayList<Reservation> reservations;

    public Meja(String idMeja, String nomorMeja, int kapasitas, String lokasi, String tipeMeja) {
        this.idMeja = idMeja;
        this.nomorMeja = nomorMeja;
        this.kapasitas = kapasitas;
        this.lokasi = lokasi;
        this.tipeMeja = tipeMeja;
        this.reservations = new ArrayList<>();
    }
    public String getTableInfo() {
    String status = reservations.isEmpty() ? "Kosong" : "Sudah ada reservasi";
    return "Meja " + nomorMeja + " - Kapasitas: " + kapasitas + " orang, Lokasi: " + lokasi + ", Tipe: " + tipeMeja + " | Status: " + status;
    }
    public boolean isAvailableAt(Date tanggal) {
    for (Reservation reservation : reservations) {
        if (reservation.getReservationDate().equals(tanggal)) {
            return false;
            }
        }
        return true; 
    }
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
    public String getIdMeja() {
        return idMeja;
    }
    public String getNomorMeja() {
        return nomorMeja;
    }
    public int getKapasitas() {
        return kapasitas;
    }
    public String getLokasi() {
        return lokasi;
    }
    public String getTipeMeja() {
        return tipeMeja;
    }
} 

