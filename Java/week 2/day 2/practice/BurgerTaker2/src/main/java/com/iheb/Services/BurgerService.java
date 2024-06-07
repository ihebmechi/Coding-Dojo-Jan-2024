package com.iheb.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iheb.Models.Burger;
import com.iheb.Repositories.BurgerRepository;

@Service
public class BurgerService {

    @Autowired
    private BurgerRepository burgerRepository;

    public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }

    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }

    public Burger findBurger(Long id) {
        return burgerRepository.findById(id).orElse(null);
    }

    public Burger updateBurger(Burger b) {
        return burgerRepository.save(b);
    }

}
