import java.time.LocalDate;

public abstract class Order {
    LocalDate orderDate;

    public Order() {
        this.orderDate = LocalDate.now();
    }

    public abstract void Confirm();
    public abstract void TrackStatus();
}