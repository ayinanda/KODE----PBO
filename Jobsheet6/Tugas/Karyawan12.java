package Tugas;

public class Karyawan12 {
    protected String nama;
    protected String id;
    protected double gajiPokok;
    
    // Constructor TANPA parameter (overloading 1)
    public Karyawan12() {
        System.out.println("Constructor Karyawan tanpa parameter dipanggil");
        this.nama = "Belum diisi";
        this.id = "0000";
        this.gajiPokok = 0.0;
    }
    
    // Constructor BERPARAMETER (overloading 2)
    public Karyawan12(String nama, String id, double gajiPokok) {
        System.out.println("Constructor Karyawan berparameter dipanggil");
        this.nama = nama;
        this.id = id;
        this.gajiPokok = gajiPokok;
    }
    
    public String getInfo() {
        return "ID: " + this.id + "\n" +
               "Nama: " + this.nama + "\n" +
               "Gaji Pokok: Rp " + this.gajiPokok + "\n";
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}
