package Jobsheet2.Percobaan2;

public class BarangDemo12 {
    public static void main(String[] args) {
        Barang12 barang1 = new Barang12();
        barang1.kode = "ATK01";
        barang1.nama = "Bolpoin Pilot Hitam";
        barang1.hargaKotor = 3500;
        barang1.diskon = 0.1;

        Barang12 barang2 = new Barang12(); //instansiasi objek baru
        barang2.kode = "ATK02";
        barang2.nama = "Buku Tulis 100 Lembar";
        barang2.hargaKotor = 15000;
        barang2.diskon = 0.2;

        Barang12 barang3 = new Barang12(); // instansiasi objek baru
        barang3.kode = "ATK03";
        barang3.nama = "Tas Ransel";
        barang3.hargaKotor = 75000;
        barang3.diskon = 0.2;

        barang1.displayInfo(); System.out.println();
        barang2.displayInfo(); System.out.println();
        barang3.displayInfo(); 
    }
}
