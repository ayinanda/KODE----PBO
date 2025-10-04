
    public class Pegawai12 {
    public String nip;
    public String nama;
    public double gaji;

//  public Pegawai12() {
//      System.out.println("Objek dari class Pegawai dibuat");   
//  }

    public Pegawai12(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo() {
        String info = "";
        info += "NIP    : " + this.nip + "\n";
        info += "Nama   : " + this.nama + "\n";
        info += "Gaji   : " + this.gaji + "\n";

        return info;
    }
}

