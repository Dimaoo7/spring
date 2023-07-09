package pro.sky.cart.controller;


import org.springframework.web.bind.annotation.*;
import pro.sky.cart.service.BasketService;


@RestController
@RequestMapping("/store/order")
public class CartController {

    private final BasketService BasketService;

    public CartController(BasketService BasketService) {
        this.BasketService = BasketService;
    }

    @GetMapping("/add")
    public String add(@RequestParam ("name") String name, @RequestParam("price") Double price){
        BasketService.add(name, price);
        return "товар <b> " + name + " " + price + "</b> добавлен";
    }

    @GetMapping("/get")
    public String get(){
        return BasketService.get();
    }
}
