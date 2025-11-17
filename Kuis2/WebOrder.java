public class WebOrder extends Order {
    @Override
    public void Confirm() {
        System.out.println("WebOrder dikonfirmasi pada " + orderDate);
    }

    @Override
    public void TrackStatus() {
        System.out.println("WebOrder sedang diproses di sistem website.");
    }
}
