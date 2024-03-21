/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/21/2024 
 * File Name: CustomerDataHttps.java 
 * Description: An interface defining operations for handling customer data via HTTPS protocol, 
 * including methods for printing customer information, retrieving customer data, and 
 * getting the customer's name.
 */

package edu.bu.met.cs665;

public interface CustomerDataHttps {
  void printCustomer(int customerId);

  String getCustomer_Https(int customerId);

  String getCustomerName_Https(int customerId);
}
