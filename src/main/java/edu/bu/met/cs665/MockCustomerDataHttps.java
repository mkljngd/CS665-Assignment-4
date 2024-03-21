/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/21/2024 
 * File Name: MockCustomerDataHttps.java 
 * Description: A mock implementation of the CustomerDataHttps interface for testing purposes, 
 * utilizing CustomerRepository to simulate HTTPS-based data retrieval and operations.
 */

package edu.bu.met.cs665;

public class MockCustomerDataHttps implements CustomerDataHttps {
  private CustomerRepository customerRepository = new CustomerRepository();

  @Override
  public void printCustomer(int customerId) {
    Customer customer = customerRepository.getCustomer(customerId);
    if (customer != null) {
      System.out.println(
          "Customer ID: " + customerId + " - New HTTPS System - Name: " + customer.getName());
    } else {
      System.out.println("Customer ID: " + customerId + " not found in New HTTPS System.");
    }
  }

  @Override
  public String getCustomer_Https(int customerId) {
    Customer customer = customerRepository.getCustomer(customerId);
    if (customer != null) {
      return String.format(
          "Customer Data for ID: %d - New HTTPS System - Name: %s, Email: %s",
          customerId, customer.getName(), customer.getEmail());
    } else {
      return "Customer ID: " + customerId + " not found in New HTTPS System.";
    }
  }

  @Override
  public String getCustomerName_Https(int customerId) {
    Customer customer = customerRepository.getCustomer(customerId);
    if (customer != null) {
      return customer.getName() + " - New HTTPS System";
    } else {
      return "Customer ID: " + customerId + " not found in New HTTPS System.";
    }
  }
}
