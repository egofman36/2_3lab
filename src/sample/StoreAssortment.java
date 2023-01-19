package sample;

public class StoreAssortment {
    private Sport[] sport;
    private int[] quantity;

    public StoreAssortment(Sport[] sport, int[] quantity) {
        this.sport = sport;
        this.quantity = quantity;
    }

    public StoreAssortment() {
    }

    public void setQuantityFromIndex(int index, int value) {
        try {
            quantity[index] = value;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Sport[] getSport() {
        return sport;
    }

    public void setSport(Sport[] sport) {
        this.sport = sport;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }
}
