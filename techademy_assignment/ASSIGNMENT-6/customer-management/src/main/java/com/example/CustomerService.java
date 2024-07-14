package com.example;

	import java.util.ArrayList;
	import java.util.List;

	public class CustomerService {
	    private List<Customer> customerList = new ArrayList<>();

	    public void addCustomer(Customer customer) {
	        customerList.add(customer);
	    }

	    public Customer getCustomerById(int id) {
	        for (Customer customer : customerList) {
	            if (customer.getId() == id) {
	                return customer;
	            }
	        }
	        return null;  // Return null if customer with given id is not found
	    }

	    public List<Customer> getAllCustomers() {
	        return new ArrayList<>(customerList);
	    }
	}



