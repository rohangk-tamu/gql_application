package com.example.mycart.controller;

import com.example.mycart.entity.CartItem;
import com.example.mycart.service.MycartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MycartController {

    @Autowired
    public MycartService mycartService;

    @QueryMapping
    public List<CartItem> findAll() {
        return mycartService.findAll();
    }

    @MutationMapping
    public CartItem createCartItem(@Argument String productName, @Argument int productQuantity, @Argument float productPrice) {
        return mycartService.saveCartItem(new CartItem(productName, productQuantity, productPrice));
    }

//    REST APIs
//    @GetMapping("/hello")
//    public String showHello(){
//        return "Hello World !";
//    }
//
//    @PostMapping("/items")
//    public CartItem saveCartItem(@RequestBody CartItem cartItem){
//        return mycartService.saveCartItem(cartItem);
//    }
//
//    @GetMapping("/all_items")
//    public List<CartItem> fetchCartItems(){
//        return mycartService.fetchCartItems();
//    }
//
//    @GetMapping("/item/{id}")
//    public CartItem fetchCartItemById(@PathVariable("id") int cartItemId){
//        return mycartService.fetchCartItemById(cartItemId);
//    }

}
