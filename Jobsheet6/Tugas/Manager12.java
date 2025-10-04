package Tugas;

public class Manager12 extends Karyawan12 {
private double tunjangan;

    public Manager12() {
        super(); 
        System.out.println("Constructor Manager tanpa parameter dipanggil");
        this.tunjangan = 0.0;
    }
    
    public Manager12(String nama, String id, double gajiPokok, double tunjangan) {
        super(nama, id, gajiPokok); 
        System.out.println("Constructor Manager berparameter dipanggil");
        this.tunjangan = tunjangan;
    }
    
    public double hitungTotalGaji() {
        return this.gajiPokok + this.tunjangan;
    }
    
    @Override
    public String getInfo() {
        String info = super.getInfo(); 
        info += "Tunjangan: Rp " + this.tunjangan + "\n";
        info += "Total Gaji: Rp " + this.hitungTotalGaji() + "\n";
        info += "Jabatan: Manager\n";
        return info;
    }
    
    public double getTunjangan() {
        return tunjangan;
    }
    
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
}
    
   
