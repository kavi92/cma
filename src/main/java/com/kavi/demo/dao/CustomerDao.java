package com.kavi.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kavi.demo.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer>{
@Override
List<Customer> findAll();
}
