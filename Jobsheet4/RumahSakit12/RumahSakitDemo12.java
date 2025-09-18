package Jobsheet4.RumahSakit12;
import java.time.LocalDate;

public class RumahSakitDemo12 {
    public static void main(String[] args) {
        Pegawai12 ani = new Pegawai12("1234", "dr. Ani");
        Pegawai12 bagus = new Pegawai12("4567", "dr. Bagus");

        Pegawai12 desi = new Pegawai12("1234", "Ns. Desi");
        Pegawai12 eka = new Pegawai12("4567", "Ns. Eka");

        Pasien12 pasien1 = new Pasien12("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien12 pasien2 = new Pasien12("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
