package Jobsheet7.Praktikum;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    public int getLembur() {
        return lembur;
    }
    public void setgajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    public double getgajiLembur() {
        return gajiLembur;
    }
    // Overloading
    public double getGaji (int lembur, double gajiLembur) {
        return super.getGaji() + (lembur * gajiLembur);
    }
    // Overriding
    public double getGaji() {
        return super.getGaji() + (lembur * gajiLembur);
    }
    public void lihatInfo() {
        System.out.println("NIP       : " + this.getNip());
        System.out.println("Nama      : " + this.getNama());
        System.out.println("Golongan  : " + this.getGolongan());
        System.out.println("JmlLembur : " + this.getLembur());
        System.out.printf("Gaji Lembur : %.0f\n", this.getgajiLembur());
        System.out.printf("Gaji       : %.0f\n", this.getGaji());
    }
}
