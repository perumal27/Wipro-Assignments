package com.example;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import java.util.List;

	public class CustomerApp {
	    public static void main(String[] args) {
	        // Load Spring application context
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	        // Retrieve CustomerService bean
	        CustomerService customerService = (CustomerService) context.getBean("customerService");

	        // Add new customers
	        Customer customer1 = new Customer(1, "surya", "surya@example.com", "1234567890");
	        Customer customer2 = new Customer(2, "perumal", "perumal@example.com", "9876543210");

	        customerService.addCustomer(customer1);
	        customerService.addCustomer(customer2);

	        // Retrieve and print customer details
	        Customer retrievedCustomer = customerService.getCustomerById(1);
	        if (retrievedCustomer != null) {
	            System.out.println("Retrieved Customer: " + retrievedCustomer.getName() + " (" +
	                    retrievedCustomer.getEmail() + ")");
	        } else {
	            System.out.println("Customer not found.");
	        }

	        // List all customers in the system
	        List<Customer> allCustomers = customerService.getAllCustomers();
	        System.out.println("All Customers:");
	        for (Customer customer : allCustomers) {
	            System.out.println(customer.getName() + " - " + customer.getEmail());
	        }
	    }
	}


