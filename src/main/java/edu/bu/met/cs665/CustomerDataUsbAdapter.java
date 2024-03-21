/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/21/2024 
 * File Name: CustomerDataUsbAdapter.java 
 * Description: Implements the CustomerDataHttps interface, acting as an adapter for 
 * CustomerDataUsb. It allows CustomerDataUsb objects to be used in places where CustomerDataHttps
 * objects are expected, by delegating calls to an instance of CustomerDataUsb.
 */

package edu.bu.met.cs665;

public class CustomerDataUsbAdapter implements CustomerDataHttps {
  private CustomerDataUsb usbData;

  public CustomerDataUsbAdapter(CustomerDataUsb usbData) {
    this.usbData = usbData;
  }

  @Override
  public void printCustomer(int customerId) {
    usbData.printCustomer(customerId); // Delegates to the USB method
  }

  @Override
  public String getCustomer_Https(int customerId) {
    return usbData.getCustomer_Usb(customerId); // Delegates to the USB method
  }

  @Override
  public String getCustomerName_Https(int customerId) {
    return usbData.getCustomerName_Usb(customerId); // Delegates to the USB method
  }
}
