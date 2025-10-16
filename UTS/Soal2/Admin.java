package UTS.Soal2;

public class Admin extends User {
    public void updateVehicleDetails(int vehicle_id) {
        System.out.println("Update data kendaraan ID: " + vehicle_id);
    }

    public void addVehicle() {
        System.out.println("Menambahkan kendaraan baru...");
    }

    public void retrieveComplain() {
        System.out.println("Menampilkan daftar keluhan pengguna...");
    }

    public void verifyUser(Customer c) {
        if (!c.get_verification_status()) {
            System.out.println("Memverifikasi user..");
        } else {
            System.out.println("User sudah terverifikasi.");
        }
    }
}
