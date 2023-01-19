package sample;


public class UserReserve {
    private Sport sport;
    private int quantity;
    private double totalAmount;

    public UserReserve() {
        this.sport = new Sport();
        this.quantity = 0;
        this.totalAmount = 0;
    }

    public UserReserve(Sport sport, int quantity) {
        this.sport = sport;
        this.quantity = quantity;
        this.totalAmount = sport.getPrice() * quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
