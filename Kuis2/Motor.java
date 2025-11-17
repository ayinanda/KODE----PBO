public class Motor extends Vehicle {
    Motor(String brand) {
        super(brand);
    }

    @Override
    void Start() {
        System.out.println("Motor " + brand + " dinyalakan...");
    }
}