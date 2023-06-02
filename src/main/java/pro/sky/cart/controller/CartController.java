package pro.sky.cart.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.cart.model.Cart;

@RestController
public class CartController {

    @PostMapping("/store/order/add")
    public String add(Cart id) {
        return "add";
    }

    @PostMapping("/store/order/get")
    public String get() {
        return "get";
    }
}
