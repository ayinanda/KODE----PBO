public class WhatsappOrder extends Order {
    @Override
    public void Confirm() {
        System.out.println("WhatsappOrder dikonfirmasi via chat pada " + orderDate);
    }

    @Override
    public void TrackStatus() {
        System.out.println("WhatsappOrder dalam pengantaran oleh kurir.");
    }
}
