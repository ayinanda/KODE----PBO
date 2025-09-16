package Jobsheet2.Percobaan1;

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Mahasiswa12 m1 = new Mahasiswa12();
        m1.nim = "023432"; 
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();
        System.out.println();

        Mahasiswa12 m2 = new Mahasiswa12();
        m2.nim = "023433";
        m2.nama = "Friska Syllaby";
        m2.alamat = "Medan, Sumatera Utara";
        m2.kelas = "2A";
        m2.displayBiodata();
        System.out.println();
        
        Mahasiswa12 m3 = new Mahasiswa12();
        m3.nim = "023434";
        m3.nama = "Queensha Rylandrna";
        m3.alamat = "Jakarta";
        m3.kelas = "2A";
        m3.displayBiodata();
    }
}
