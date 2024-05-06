package com.example.mycart.service;

import com.example.mycart.entity.CartItem;

import java.util.List;

public interface MycartService {

    public List<CartItem> findAll();


    public CartItem saveCartItem(CartItem cartItem);

//    public List<CartItem> fetchCartItems();
//
//    public CartItem fetchCartItemById(int cartItemId);
}
