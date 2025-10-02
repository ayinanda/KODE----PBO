public class Pegawai12 {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai12() {
        System.out.println("Objek dari class Pegawai dibuat");
    }

    public String getInfo() {
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";
        
        return info;
    }
}
