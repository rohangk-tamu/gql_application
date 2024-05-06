package com.example.mycart.repository;

import com.example.mycart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MycartRepository extends JpaRepository<CartItem, Integer> {

}