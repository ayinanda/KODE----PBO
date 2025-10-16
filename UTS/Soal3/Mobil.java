package UTS.Soal3;

public class Mobil extends Kendaraan {
     public Mobil(String noPlat, String merk, int tahun) {
        super(noPlat, merk, tahun, "Mobil");
    }

    public double hitungBiayaServis() {
        return 500000;
    }
}
