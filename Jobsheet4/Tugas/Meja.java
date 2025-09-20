package Jobsheet4.Tugas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Meja {
    private String idMeja;
    private String nomorMeja;
    private int kapasitas;
    private String lokasi;
    private String tipeMeja;
    private List<Reservation> reservations;

    public Meja(String idMeja, String nomorMeja, int kapasitas, String lokasi, String tipeMeja) {
        this.idMeja = idMeja;
        this.nomorMeja = nomorMeja;
        this.kapasitas = kapasitas;
        this.lokasi = lokasi;
        this.tipeMeja = tipeMeja;
        this.reservations = new ArrayList<>();
    }
    public String getTableInfo() {
        return "Meja " + nomorMeja + 
               " - Kapasitas: " + kapasitas + 
               " orang, Lokasi: " + lokasi + 
               ", Tipe: " + tipeMeja;
    }
    public boolean isAvailableAt(Date tanggal, String timeSlot) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationDate().equals(tanggal)) {
                return false;
            }
        }
        return true; 
    }
    public List<Reservation> getReservations() {
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

