public class DemoPolymorphism {
    public static void main(String[] args) {

        Vehicle[] list = { new Car("Toyota"), new Motor("Honda") };

        for (Vehicle v : list) {
            v.Start();
        }

        for (Vehicle v : list) {
            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("Ini mobil: " + c.brand);
            }
        }

        Test(() -> System.out.println("Tes start:"));
    }

    public static void Test(VehicleAction action) {
        action.run();
    }
}
