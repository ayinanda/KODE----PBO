package Jobsheet1;
public class TelevisiMain12 {
    public static void main(String[] args) {
        Televisi12 tv1 = new Televisi12(); 
        tv1.merk = "Samsung";
        tv1.ukuranLayar = 42;

        tv1.nyalakanTV();
        tv1.gantiSaluran(5);
        tv1.matikanTV();
        tv1.gantiSaluran(10);
    }
}
