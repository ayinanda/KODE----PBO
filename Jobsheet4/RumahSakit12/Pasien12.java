package Jobsheet4.RumahSakit12;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien12 {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi12> riwayatKonsultasi;

    public String getNoRekamMedis() {
        return noRekamMedis;
    }
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Pasien12(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi12>();
    }
    public void tambahKonsultasi(LocalDate tanggal, Pegawai12 dokter, Pegawai12 perawat) {
        Konsultasi12 konsultasi = new Konsultasi12();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }
    public String getInfo() {
       String info = "";
       info += "No. Rekam Medis     : " + this.noRekamMedis + "\n";
       info += "Nama                : " + this.nama + "\n";

       if (!riwayatKonsultasi.isEmpty()) {
           info += "Riwayat Konsultasi  : \n";

              for (Konsultasi12 konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
              }
         }
        else {
            info += "Belum ada riwayat konsultasi."; 
        }

       info += "\n";

       return info;
    }
}
