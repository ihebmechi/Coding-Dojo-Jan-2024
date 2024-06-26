package com.savetravel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.savetravel.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{

    // override the findAll method
    List<Expense> findAll();


}
