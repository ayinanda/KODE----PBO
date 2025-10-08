package Jobsheet7.Tugas;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga12 s = new Segitiga12();

        System.out.println("===== SEGITIGA =====");
        System.out.println("Total Sudut 1: " + s.totalSudut(22));
        System.out.println("Total Sudut 2: " + s.totalSudut(20,30));
        System.out.println("Keliling: " + s.keliling(3, 4, 5));
        System.out.println("Keliling dengan rumus: " + s.keliling(3,4));
    }   
}
