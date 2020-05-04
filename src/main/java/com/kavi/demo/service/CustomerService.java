package com.kavi.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kavi.demo.dao.CustomerDao;
import com.kavi.demo.exception.CustomerNotFoundException;
import com.kavi.demo.model.Customer;

@Component
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
//	private int customerIdCount = 1;
//	private List<Customer> customerList = new CopyOnWriteArrayList<>();

	public Customer addCustomer(Customer customer) {
//		customer.setCustomerid(customerIdCount);
//		customerList.add(customer);
//		customerList.add(customer);
//		customerIdCount++;
//		return customer;
		return customerDao.save(customer);
	}

	public List<Customer> getCustomer() {
		return customerDao.findAll();
	}

	public Customer getCustomer(int customerId) {
//		return customerList.stream().filter(c -> c.getCustomerid() == customerId).findFirst().get();
		Optional<Customer> optionalCustomer=customerDao.findById(customerId);
		if(!optionalCustomer.isPresent()) {
			throw new CustomerNotFoundException("Customer record not available...");
		}
		return optionalCustomer.get();

	}

	public Customer updateCustomer(int customerId, Customer customer) {
//		customerList.stream().forEach(c -> {
//			if (c.getCustomerid() == customerId) {
//				c.setCustomerfname(customer.getCustomerfname());
//				c.setCustomerlname(customer.getCustomerlname());
//				c.setCustomermail(customer.getCustomermail());
//			}
//		});
//		return customerList.stream().filter(c -> c.getCustomerid() == customerId).findFirst().get();
		customer.setCustomerid(customerId);
		return customerDao.save(customer);
	}

	public void deleteCustomer(int customerId) {
//		customerList.stream().forEach(c -> {
//			if (c.getCustomerid() == customerId) {
//				customerList.remove(c);
//			}
//		});
		customerDao.deleteById(customerId);
	}
}
