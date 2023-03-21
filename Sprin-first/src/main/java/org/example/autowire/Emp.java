package org.example.autowire;

public class Emp {
    private Address address;

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Emp() {
    }

    public Emp(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
