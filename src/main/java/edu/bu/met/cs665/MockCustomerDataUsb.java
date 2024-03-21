/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/21/2024 
 * File Name: MockCustomerDataUsb.java 
 * Description: A mock implementation of the CustomerDataUsb interface, also for testing purposes.
 * It uses CustomerRepository to simulate USB-based data retrieval and operations.
 */

package edu.bu.met.cs665;

public class MockCustomerDataUsb implements CustomerDataUsb {
  private CustomerRepository customerRepository = new CustomerRepository();

  @Override
  public void printCustomer(int customerId) {
    Customer customer = customerRepository.getCustomer(customerId);
    if (customer != null) {
      System.out.println(
          "Customer ID: " + customerId + " - Legacy USB System - Name: " + customer.getName());
    } else {
      System.out.println("Customer ID: " + customerId + " not found in Legacy USB System.");
    }
  }

  @Override
  public String getCustomer_Usb(int customerId) {
    Customer customer = customerRepository.getCustomer(customerId);
    System.out.println("here" + customer);
    if (customer != null) {
      return String.format(
          "Customer Data for ID: %d - Legacy USB System - Name: %s, Email: %s",
          customerId, customer.getName(), customer.getEmail());
    } else {
      return "Customer ID: " + customerId + " not found in Legacy USB System.";
    }
  }

  @Override
  public String getCustomerName_Usb(int customerId) {
    Customer customer = customerRepository.getCustomer(customerId);
    if (customer != null) {
      return customer.getName() + " - Legacy USB System";
    } else {
      return "Customer ID: " + customerId + " not found in Legacy USB System.";
    }
  }
}
