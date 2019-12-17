package Model;

public class Car {
    private String modell;
    private double price;

    public String getModell() {
        return modell;
    }

    public double getPrice() {
        return price;
    }

    public Car(String modell, double price) {
        this.modell = modell;
        this.price = price;
    }
}
