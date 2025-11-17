public class MainOrder {
    public static void main(String[] args) {
        Order a = new MailOrder();
        Order b = new WebOrder();
        Order c = new WhatsappOrder();

        a.Confirm();  a.TrackStatus();
        b.Confirm();  b.TrackStatus();
        c.Confirm();  c.TrackStatus();
    }
}
