package org.example.lifecycle;

public class Life {
    private double price;

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Life() {
        super();
    }

    @Override
    public String toString() {
        return "Life{" +
                "price=" + price +
                '}';
    }

    public void init()
    {
        System.out.println("Inside init method");
    }

    public void destroy()
    {
        System.out.println("Inside destroy method");

    }

}
