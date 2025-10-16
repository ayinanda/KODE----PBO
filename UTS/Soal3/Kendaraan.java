package UTS.Soal3;

public class Kendaraan {
    private String noPlat;
    private String merk;
    private int tahun;
    private String jenis;

    public Kendaraan(String noPlat, String merk, int tahun, String jenis) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.tahun = tahun;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }

    public String getJenis() {
        return jenis;
    }

    public double hitungBiayaServis() {
        return 0;
    }

    public double hitungBiayaServis(boolean includeCuci) {
        double biaya = hitungBiayaServis();
        if (includeCuci) {
            biaya += 50000;
        }
        return biaya;
    }

    public void tampilkanData() {
        System.out.println("No Plat: " + noPlat);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Jenis: " + jenis);
    }
}
