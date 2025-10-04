package Tugas.ClassDiagram;

public class Device {
 
    protected String brand;
    protected String model;
    protected double harga;
    
    public Device() {
        System.out.println("Constructor Device tanpa parameter dipanggil");
        this.brand = "Unknown";
        this.model = "Unknown";
        this.harga = 0.0;
    }
    
    public Device(String brand, String model, double harga) {
        System.out.println("Constructor Device berparameter dipanggil");
        this.brand = brand;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayInfo() {
        System.out.println("=== INFORMASI DEVICE ===");
        System.out.println("Brand    : " + this.brand);
        System.out.println("Model    : " + this.model);
        System.out.println("Harga    : Rp " + this.harga);
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
}
    
    