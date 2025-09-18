package Jobsheet4.RumahSakit12;
import java.time.LocalDate;

public class Konsultasi12 {
    private LocalDate tanggal;
    private Pegawai12 dokter;
    private Pegawai12 perawat; 
    
    public LocalDate getTanggal() {
        return tanggal;
    }
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
    public Pegawai12 getDokter() {
        return dokter;
    }
    public void setDokter(Pegawai12 dokter) {
        this.dokter = dokter;
    }
    public Pegawai12 getPerawat() {
        return perawat;
    }
    public void setPerawat(Pegawai12 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";
        
        return info;
    }
}
