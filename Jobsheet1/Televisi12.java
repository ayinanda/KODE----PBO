package Jobsheet1;

public class Televisi12 { 
    String merk;
    int ukuranLayar;
    boolean status;

    void nyalakanTV() {
        status = true;
        System.out.println("TV " + merk + " menyala.");
    }

    void matikanTV() {
        status = false;
        System.out.println("TV " + merk + " mati.");
    }

    void gantiSaluran(int saluran) {
        if (status) {
            System.out.println("TV " + merk + " berpindah ke saluran " + saluran + ".");
        } else {
            System.out.println("TV " + merk + " dalam keadaan mati. Nyalakan terlebih dahulu.");
        }
    }
}
