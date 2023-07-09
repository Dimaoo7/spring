package pro.sky.cart.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.cart.ShoppingCart;
import pro.sky.cart.model.Cart;



@Service
@SessionScope
public class BasketService {

    private final ShoppingCart shoppingCart;

    public BasketService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void add(String name, Double price) {
        Cart cart = new Cart(name, price);
        shoppingCart.getChart().put(cart.getId(), cart);
    }


    public String get() {
        return shoppingCart.getChart().toString();
    }

}

