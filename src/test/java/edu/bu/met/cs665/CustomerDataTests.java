/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/21/2024 
 * File Name: CustomerDataTests.java 
 * Description: Contains unit tests to verify the functionality of the customer data handling 
 * classes, including both the mock implementations and the adapter.
 */

package edu.bu.met.cs665;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerDataTests {
  private MockCustomerDataUsb mockCustomerDataUSB;
  private MockCustomerDataHttps mockCustomerDataHTTPS;
  private CustomerDataUsbAdapter customerDataUSBAdapter;
  private CustomerRepository customerRepository;

  @BeforeEach
  void setUp() {
    customerRepository = new CustomerRepository();
    mockCustomerDataUSB = new MockCustomerDataUsb();
    mockCustomerDataHTTPS = new MockCustomerDataHttps();
    customerDataUSBAdapter = new CustomerDataUsbAdapter(mockCustomerDataUSB);
  }

  @Test
  void testGetCustomerNameUSB() {
    final int customerId = 1;
    Customer expectedCustomer = customerRepository.getCustomer(customerId);
    String expected = String.format("%s - Legacy USB System", expectedCustomer.getName());
    assertEquals(expected, mockCustomerDataUSB.getCustomerName_Usb(customerId));
  }

  @Test
  void testGetCustomerUSB() {
    final int customerId = 2;
    Customer expectedCustomer = customerRepository.getCustomer(customerId);
    String expected =
        String.format(
            "Customer Data for ID: %d - Legacy USB System - Name: %s, Email: %s",
            expectedCustomer.getId(), expectedCustomer.getName(), expectedCustomer.getEmail());
    assertEquals(expected, mockCustomerDataUSB.getCustomer_Usb(customerId));
  }

  @Test
  void testGetCustomerNameHTTPS() {
    final int customerId = 3;
    Customer expectedCustomer = customerRepository.getCustomer(customerId);
    String expected = String.format("%s - New HTTPS System", expectedCustomer.getName());
    assertEquals(expected, mockCustomerDataHTTPS.getCustomerName_Https(customerId));
  }

  @Test
  void testGetCustomerHTTPS() {
    final int customerId = 4;
    Customer expectedCustomer = customerRepository.getCustomer(customerId);
    String expected =
        String.format(
            "Customer Data for ID: %d - New HTTPS System - Name: %s, Email: %s",
            expectedCustomer.getId(), expectedCustomer.getName(), expectedCustomer.getEmail());
    assertEquals(expected, mockCustomerDataHTTPS.getCustomer_Https(customerId));
  }

  @Test
  void testAdapterGetCustomerName() {
    final int customerId = 5;
    Customer expectedCustomer = customerRepository.getCustomer(customerId);
    String expected = String.format("%s - Legacy USB System", expectedCustomer.getName());
    assertEquals(expected, customerDataUSBAdapter.getCustomerName_Https(customerId));
  }

  @Test
  void testGetCustomerUSBWithInvalidID() {
    final int customerId = 999;
    String expected = "Customer ID: " + customerId + " not found in Legacy USB System.";
    assertEquals(expected, mockCustomerDataUSB.getCustomer_Usb(customerId));
  }

  @Test
  void testGetCustomerHTTPSWithInvalidID() {
    final int customerId = 999;
    String expected = "Customer ID: " + customerId + " not found in New HTTPS System.";
    assertEquals(expected, mockCustomerDataHTTPS.getCustomer_Https(customerId));
  }

  @Test
  void testAdapterGetCustomerNameWithInvalidID() {
    final int customerId = 999;
    String expected = "Customer ID: " + customerId + " not found in Legacy USB System.";
    assertEquals(expected, customerDataUSBAdapter.getCustomerName_Https(customerId));
  }
}
