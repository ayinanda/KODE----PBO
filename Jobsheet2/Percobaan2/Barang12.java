package Jobsheet2.Percobaan2;

public class Barang12 {
    public String kode;
    public String nama;
    public String kategori; // atribut baru untuk tugas
    public double hargaKotor;
    public double diskon;
    public double hargaBersih; // atribut baru untuk tugas


    public double getHargaBersih() {
        return hargaKotor - diskon * hargaKotor;
    }
    public String getKategori() { // method baru untuk tugas
        if (hargaKotor < 10000) {
            kategori = "Murah";
        } else if (hargaKotor >= 10000 && hargaKotor <= 50000) {
            kategori = "Sedang";
        } else {
            kategori = "Mahal";
        }
        return kategori;
    }

    public void displayInfo() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga: " + hargaKotor);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga Bersih: " + getHargaBersih());
        System.out.println("Kategori: " + getKategori());
    }
}
