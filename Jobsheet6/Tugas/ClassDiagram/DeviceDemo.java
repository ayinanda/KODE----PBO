package Tugas.ClassDiagram;

public class DeviceDemo {
    public static void main(String[] args) {
        System.out.println("========== HIERARCHICAL INHERITANCE DEMO ==========\n");
        
        System.out.println("1. MEMBUAT OBJEK HANDPHONE:");
        Handphone hp = new Handphone("Samsung", "Galaxy S23", 12500000, "108 MP", 2);
        hp.displayInfo();
        hp.ambilGambar();
        hp.masukkanSim();
        
        System.out.println("\n" + "=".repeat(50) + "\n");

        System.out.println("2. MEMBUAT OBJEK LAPTOP:");
        Laptop laptop = new Laptop("Apple", "MacBook Pro M2", 25000000, "Apple M2 Pro", true);
        laptop.displayInfo();
        laptop.bukaTerminal();
        laptop.aturDNS();
        
        System.out.println("\n" + "=".repeat(50) + "\n");

        System.out.println("3. MODIFIKASI NILAI ATRIBUT:");
        
        System.out.println("--- Modifikasi Handphone ---");
        hp.setHarga(11000000); 
        hp.setResolusiKamera("200 MP"); 
        hp.setSimCardSlot(1); 
        hp.displayInfo();
        
        System.out.println("\n--- Modifikasi Laptop ---");
        laptop.setModel("MacBook Pro M3"); 
        laptop.setProcessor("Apple M3 Max"); 
        laptop.setBackLightKeyboard(false); 
        laptop.displayInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("4. OBJEK DENGAN CONSTRUCTOR TANPA PARAMETER:");
        
        Handphone hp2 = new Handphone();
        hp2.setBrand("Xiaomi");
        hp2.setModel("Redmi Note 12");
        hp2.setHarga(3500000);
        hp2.setResolusiKamera("48 MP");
        hp2.setSimCardSlot(2);
        hp2.displayInfo();
        
        System.out.println("\n--- Method khusus Handphone ---");
        hp2.ambilGambar();
        hp2.masukkanSim();
    }
}