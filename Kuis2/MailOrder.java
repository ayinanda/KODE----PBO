public class MailOrder extends Order {
    @Override
    public void Confirm() {
        System.out.println("MailOrder dikonfirmasi pada " + orderDate);
    }

    @Override
    public void TrackStatus() {
        System.out.println("MailOrder sedang dikirim melalui layanan pos.");
    }
}