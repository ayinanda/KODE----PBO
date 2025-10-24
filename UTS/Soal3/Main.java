package UTS.Soal3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Data Servis Bengkel Maju Jaya ===");

        Kendaraan mobil = new Mobil("N 1234 AB", "Toyota", 2020);
        mobil.tampilkanData();
        System.out.println("Biaya Servis: Rp" + mobil.hitungBiayaServis());
        System.out.println("Biaya Servis + Cuci: Rp" + mobil.hitungBiayaServis(true));
        System.out.println();

        Kendaraan motor = new Motor("N 5678 XY", "Honda", 2022);
        motor.tampilkanData();
        System.out.println("Biaya Servis: Rp" + motor.hitungBiayaServis());
        System.out.println("Biaya Servis + Cuci: Rp" + motor.hitungBiayaServis(true));
    }
}
