package pro.sky.cart.model;


import java.util.Objects;

public class Cart {
    private static Integer idCounter = 1;
    private final Integer id;
    private String name;
    private Double price;


    public Cart(String name, Double price) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": id=" + id + " цена - " + price + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Double.compare(cart.price, price) == 0 && name.equals(cart.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

}
