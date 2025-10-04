package Tugas;

public class TestInheritance12 {
    public static void main(String[] args) {
        System.out.println("=== CONSTRUCTOR TANPA PARAMETER ===");
        Manager12 manager1 = new Manager12();
        System.out.println(manager1.getInfo());
        
        System.out.println("\n=== CONSTRUCTOR BERPARAMETER ===");
        Manager12 manager2 = new Manager12("Budi Santoso", "MGR001", 8000000, 3000000);
        System.out.println(manager2.getInfo());
        
        System.out.println("\n=== TEST SETTER UNTUK OBJECT TANPA PARAMETER ===");
        manager1.setNama("Siti Rahayu");
        manager1.setId("MGR002");
        manager1.setGajiPokok(7500000);
        manager1.setTunjangan(2500000);
        System.out.println(manager1.getInfo());
        
        System.out.println("\n=== TEST METHOD KHUSUS MANAGER ===");
        System.out.println("Total Gaji Manager2: Rp " + manager2.hitungTotalGaji());
    }
}
