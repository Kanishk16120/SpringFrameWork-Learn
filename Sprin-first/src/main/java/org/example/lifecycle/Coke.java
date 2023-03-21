package org.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coke  implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }



    public Coke() {
        super();
    }

    @Override
    public String toString() {
        return "Coke{" +
                "price=" + price +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Taking Coke");

    }
    public void setPrice(double price) {
        System.out.println("Setting Coke Price");
        this.price = price;
    }

    public void destroy() throws Exception {
        System.out.println("Destroying Bean");
    }
}
