package com.galvanize;

public class Address {

  private String street;
  private String city;
  private String state;
  private String zip;

  public Address(String street, String city, String state, String zip) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public String getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZip() {
    return zip;
  }

  public void setStreet(String anotherStreet) {
    street = anotherStreet;
  }

  public void setCity(String anotherCity) {
    city = anotherCity;
  }

  public void setState(String anotherState) {
    state = anotherState;
  }

  public void setZip(String anotherZip) {
    zip = anotherZip;
  }

  // Override toString method

  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append(this.getStreet()); 
    result.append(", ");
    result.append(this.getCity()); 
    result.append(", ");
    result.append(this.getState());
    result.append(" ");
    result.append(this.getZip());
    return result.toString();
  }

  // Main method
  public static void main(String args[]) {
    Address myOldAddress = new Address("15 Main St", "OH", "Cleveland", "44101");
    System.out.println(myOldAddress);
  }

}