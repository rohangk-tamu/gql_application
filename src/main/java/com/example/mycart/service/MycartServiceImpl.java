package com.example.mycart.service;

import com.example.mycart.entity.CartItem;
import com.example.mycart.repository.MycartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MycartServiceImpl implements MycartService{

    @Autowired
    public MycartRepository mycartRepository;

    @Override
    public List<CartItem> findAll() {
        return mycartRepository.findAll();
    }

    public CartItem saveCartItem(CartItem cardItem) {
        return mycartRepository.save(cardItem);
    }
//
//    @Override
//    public List<CartItem> fetchCartItems() {
//        return mycartRepository.findAll();
//    }
//
//    @Override
//    public CartItem fetchCartItemById(int cartItemId) {
//        return mycartRepository.findById(cartItemId).get();
//    }
}
