package Jobsheet2.Tugas;

public class PersegiPanjang12 {
    public int panjang, lebar;

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    public void displayInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }
}
