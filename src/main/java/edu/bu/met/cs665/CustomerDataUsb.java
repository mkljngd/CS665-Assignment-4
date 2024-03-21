/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/21/2024 
 * File Name: CustomerDataUsb.java 
 * Description: This interface specifies operations for managing customer data but through USB
 * connections, including methods for printing customer information, retrieving customer data, 
 * and getting the customer's name.
 */

package edu.bu.met.cs665;

public interface CustomerDataUsb {
  void printCustomer(int customerId);

  String getCustomer_Usb(int customerId);

  String getCustomerName_Usb(int customerId);
}
