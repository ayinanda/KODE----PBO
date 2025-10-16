package UTS.Soal2;

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc;
    
    public UserProfile(int user_id, String password, String name, int age, String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

    public int get_User_id() {
        return user_id;
    }
    public String getPassword() {
        return password;
    }
    public String get_name() {
        return name;
    }
    public int get_age() {
        return age;
    }
    public String get_email() {
        return email_id;
    }
    public void edit_profile(String name, Integer age, String email_id, String password) {
        if (name != null) {
            this.name = name;
        }
        if (age != null) {
            this.age = age;
        }
        if (email_id != null) {
            this.email_id = email_id;
        }
        if (password != null) {
            this.password = password;
        }
        System.out.println("Profil " + name + " berhasil diperbarui.");
    }
    public void show_documents() {
       System.out.println("Dokumen: " + doc);
    }

}
