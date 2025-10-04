package Tugas.ClassDiagram;

public class Handphone extends Device {
    private String resolusiKamera;
    private int simCardSlot;
    
    public Handphone() {
        super(); 
        System.out.println("Constructor Handphone tanpa parameter dipanggil");
        this.resolusiKamera = "Unknown";
        this.simCardSlot = 0;
    }
    
    public Handphone(String brand, String model, double harga, String resolusiKamera, int simCardSlot) {
        super(brand, model, harga); 
        System.out.println("Constructor Handphone berparameter dipanggil");
        this.resolusiKamera = resolusiKamera;
        this.simCardSlot = simCardSlot;
    }
    
    public void ambilGambar() {
        System.out.println("Mengambil gambar dengan resolusi: " + this.resolusiKamera);
    }
    
    public void masukkanSim() {
        System.out.println("Memasukkan SIM card ke slot yang tersedia: " + this.simCardSlot + " slot");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Resolusi Kamera     : " + this.resolusiKamera);
        System.out.println("SIM Card Slot       : " + this.simCardSlot + " slot");
        System.out.println("Tipe                : Handphone");
    }
    
    public String getResolusiKamera() {
        return resolusiKamera;
    }
    
    public void setResolusiKamera(String resolusiKamera) {
        this.resolusiKamera = resolusiKamera;
    }
    
    public int getSimCardSlot() {
        return simCardSlot;
    }
    
    public void setSimCardSlot(int simCardSlot) {
        this.simCardSlot = simCardSlot;
    }
}
