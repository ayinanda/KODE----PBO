package Tugas.ClassDiagram;

public class Laptop extends Device {
    private String processor;
    private boolean backLightKeyboard;
    
    public Laptop() {
        super(); 
        System.out.println("Constructor Laptop tanpa parameter dipanggil");
        this.processor = "Unknown";
        this.backLightKeyboard = false;
    }
    

    public Laptop(String brand, String model, double harga, String processor, boolean backLightKeyboard) {
        super(brand, model, harga);
        System.out.println("Constructor Laptop berparameter dipanggil");
        this.processor = processor;
        this.backLightKeyboard = backLightKeyboard;
    }
    
    public void bukaTerminal() {
        System.out.println("Membuka terminal/command prompt...");
        System.out.println("Sistem siap untuk perintah administrator");
    }
    
    public void aturDNS() {
        System.out.println("Mengatur DNS server...");
        System.out.println("DNS berhasil dikonfigurasi untuk " + this.brand + " " + this.model);
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method parent
        System.out.println("Processor           : " + this.processor);
        System.out.println("Backlight Keyboard  : " + (this.backLightKeyboard ? "Ya" : "Tidak"));
        System.out.println("Tipe                : Laptop");
    }

        public String getProcessor() {
        return processor;
    }
    
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
    public boolean isBackLightKeyboard() {
        return backLightKeyboard;
    }
    
    public void setBackLightKeyboard(boolean backLightKeyboard) {
        this.backLightKeyboard = backLightKeyboard;
    }
}
