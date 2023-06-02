package pro.sky.cart.service;

import org.springframework.stereotype.Service;
import pro.sky.cart.model.Cart;


@Service
public class BasketService {


    public String add(Cart id) {
        return "add";
    }

    public String get() {
        return "get";
    }
}
