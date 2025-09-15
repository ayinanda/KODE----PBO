package Jobsheet2.Percobaan2;

public class PersegiPanjangDemo12 {
    public static void main(String[] args) {
        PersegiPanjang12 pp1 = new PersegiPanjang12();
        pp1.panjang = 10;
        pp1.lebar = 5;

        pp1.displayInfo();
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());
    }
    
}
