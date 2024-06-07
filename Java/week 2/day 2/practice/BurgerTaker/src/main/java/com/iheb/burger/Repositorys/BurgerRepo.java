package com.iheb.burger.Repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iheb.burger.Models.Burger;

import java.util.List;

@Repository
public interface BurgerRepo extends CrudRepository<Burger, Long> {
    List<Burger> findAll();
}
