package UTS.Soal2;

public class User {
    public boolean log_in(int user_id, int password) {
        System.out.println("User " + user_id + " berhasil login");
        return true; 
    }

    public void recoverPassword() {
        System.out.println("Password baru telah dibuat. ");
    }

    public void log_out() {
        System.out.println("User telah Logout. ");
    }
}
