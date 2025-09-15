package Jobsheet1;
public class TelevisiStruktural12 {
     public static boolean nyalakanTV(String merk, boolean status) {
        status = true;
        System.out.println("TV " + merk + " menyala.");
        return status;
    }

    public static boolean matikanTV(String merk, boolean status) {
        status = false;
        System.out.println("TV " + merk + " mati.");
        return status;
    }

    public static void gantiSaluran(String merk, boolean status, int saluran) {
        if (status) {
            System.out.println("TV " + merk + " berpindah ke saluran " + saluran + ".");
        } else {
            System.out.println("TV " + merk + " masih mati, nyalakan dulu.");
        }
    }
    public static void main(String[] args) {
        String merk1 = "Samsung"; int ukuran1 = 42; boolean status1 = false;
        String merk2 = "LG";      int ukuran2 = 32; boolean status2 = false;
        String merk3 = "Sony";    int ukuran3 = 55; boolean status3 = false;
        String merk4 = "Panasonic"; int ukuran4 = 40; boolean status4 = false;
        String merk5 = "Sharp";   int ukuran5 = 24; boolean status5 = false;
        String merk6 = "Toshiba"; int ukuran6 = 50; boolean status6 = false;
        String merk7 = "Polytron"; int ukuran7 = 29; boolean status7 = false;
        String merk8 = "Xiaomi";  int ukuran8 = 43; boolean status8 = false;
        String merk9 = "Changhong"; int ukuran9 = 39; boolean status9 = false;
        String merk10 = "Philips"; int ukuran10 = 48; boolean status10 = false;

        status1 = nyalakanTV(merk1, status1);
        gantiSaluran(merk1, status1, 5);
        status1 = matikanTV(merk1, status1);
        System.out.println();

        status2 = nyalakanTV(merk2, status2);
        gantiSaluran(merk2, status2, 10);
        status2 = matikanTV(merk2, status2);
        System.out.println();

        status3 = nyalakanTV(merk3, status3);
        gantiSaluran(merk3, status3, 7);
        status3 = matikanTV(merk3, status3);
        System.out.println();

        status4 = nyalakanTV(merk4, status4);
        gantiSaluran(merk4, status4, 15);
        status4 = matikanTV(merk4, status4);
        System.out.println();

        status5 = nyalakanTV(merk5, status5);
        gantiSaluran(merk5, status5, 3);
        status5 = matikanTV(merk5, status5);
        System.out.println();

        status6 = nyalakanTV(merk6, status6);
        gantiSaluran(merk6, status6, 20);
        status6 = matikanTV(merk6, status6);
        System.out.println();

        status7 = nyalakanTV(merk7, status7);
        gantiSaluran(merk7, status7, 9);
        status7 = matikanTV(merk7, status7);
        System.out.println();

        status8 = nyalakanTV(merk8, status8);
        gantiSaluran(merk8, status8, 6);
        status8 = matikanTV(merk8, status8);
        System.out.println();

        status9 = nyalakanTV(merk9, status9);
        gantiSaluran(merk9, status9, 11);
        status9 = matikanTV(merk9, status9);
        System.out.println();

        status10 = nyalakanTV(merk10, status10);
        gantiSaluran(merk10, status10, 4);
        status10 = matikanTV(merk10, status10);
    }

}
