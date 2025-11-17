public class Car extends Vehicle {
    public Car(String brand) { 
        super(brand); 
    }
    @Override
    public void Start() { 
        System.out.println("Mobil " + brand + " hidup"); 
    }
}
