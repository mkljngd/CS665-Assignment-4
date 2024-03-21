/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/21/2024 
 * File Name: Customer.java 
 * Description: Represents a customer with properties such as ID, name, and email. It
 * encapsulates basic customer information.
 */

package edu.bu.met.cs665;

public class Customer {
  private int id;
  private String name;
  private String email;

  /**
   * Constructs a new Customer instance with the specified ID, name, and email.
   * 
   * @param id    the unique identifier for the customer
   * @param name  the name of the customer
   * @param email the email address of the customer
   */

  public Customer(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}
