package pro.sky.cart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.cart.model.Cart;

import java.util.HashMap;
import java.util.Map;

@Component
@SessionScope
public class ShoppingCart {
    private Cart cart;
    private final Map<Integer, Cart> chart = new HashMap<>();

    public Map<Integer, Cart> getChart() {
        return chart;
    }
}

