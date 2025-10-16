package UTS.Soal2;

public class Main {
    public static void main(String[] args) {
        UserProfile up = new UserProfile(222, "12345", "Ayin", 19, "ayyinda@gmail.com", "ktp.jpg");
        Customer c = new Customer();
        Admin a = new Admin();

        c.log_in(up.get_User_id(), 12345);
        c.apply_verification("ktp.jpg");
        a.verifyUser(c);
        up.show_documents();
        c.log_out(); 
    }
}
