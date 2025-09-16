package Jobsheet3.Tugas;

public class Anggota12 {
    public String nomorKTP;
    public String nama;    
    public double limitPinjaman;
    public double jumlahPinjaman;

    public Anggota12(String nomorKTP, String nama, double limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double jumlah) {
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(double jumlah) {
        if (jumlah > jumlahPinjaman) {
            System.out.println("Jumlah angsuran melebihi jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
        }
    }
}
