package UTS.Soal3;

public class Motor extends Kendaraan {
   public Motor(String noPlat, String merk, int tahun) {
        super(noPlat, merk, tahun, "Motor");
    }

    public double hitungBiayaServis() {
        return 250000;
    }
    
}
