package pt.up.fe.ldts.example3;

public abstract class Discount {

    private final double percentage;

    public Discount(double percentage) {
        this.percentage = percentage;
    }
    public double getDiscount(){
        return percentage;
    }

    public abstract double applyDiscount(double price);
}
