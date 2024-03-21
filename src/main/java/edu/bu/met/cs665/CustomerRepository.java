/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/21/2024 
 * File Name: CustomerRepository.java 
 * Description: Acts as a collection manager for Customer objects, providing
 * a centralized way to access customer data stored in memory. It demonstrates the Repository
 * pattern by abstracting the details of data access and storage.
 */

package edu.bu.met.cs665;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {
  private Map<Integer, Customer> customerData;

  /**
   * Initializes a new CustomerRepository instance with predefined customer data. This constructor
   * populates the repository with a set of default customers.
   */
  public CustomerRepository() {
    this.customerData = new HashMap<>();
    customerData.put(1, new Customer(1, "John Doe", "john.doe@example.com"));
    customerData.put(2, new Customer(2, "Jane Smith", "jane.smith@example.com"));
    customerData.put(3, new Customer(3, "Tony Stark", "tony.stark@example.com"));
    customerData.put(4, new Customer(4, "Sherlock Holmes", "sherlock.holmes@example.com"));
    customerData.put(5, new Customer(4, "John Wick", "john.wick@example.com"));
  }

  public Customer getCustomer(int customerId) {
    return customerData.get(customerId);
  }
}
