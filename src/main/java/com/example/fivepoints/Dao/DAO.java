package com.example.fivepoints.Dao;

import com.example.fivepoints.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DAO extends CrudRepository<Customer, Integer> {
    @Override
    List<Customer> findAll();
}
