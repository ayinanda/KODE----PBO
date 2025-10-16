package UTS.Soal2;

public class Customer extends User {
    private boolean verification_status = false;

    public boolean get_verification_status() {
        return verification_status;
    }
    public void apply_verification(String doc) {
        System.out.println("Mengajukan verivikasi dokumen: " + doc);
        this.verification_status = true;
    }
}
