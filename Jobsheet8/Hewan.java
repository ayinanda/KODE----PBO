public class Hewan {
    public double berat;
    public String makanan;
    public String habitat;

    public Hewan(double berat, String makanan, String habitat) {
        this.berat = berat;
        this.makanan = makanan;
        this.habitat = habitat;
    }

    public void bergerak() {
        //
    }

    public void bernapas() {
        //
    }

    public void cetakInfo() {
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Makanan: " + makanan);
        System.out.println("Habitat: " + habitat);
    }
}
