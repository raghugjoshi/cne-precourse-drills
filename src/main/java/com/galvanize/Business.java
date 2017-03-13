package com.galvanize;
import java.util.*;

interface Addressable {
  List<Address> getAddresses();
  void addAddress(Address address);
}

class Business implements Addressable {

  final private String name;
  private List<Address> addressList = new ArrayList<Address>();

  // Constructor 
  public Business(String localName) {
    name = localName;
  }

  public String getName() {
    return name;
  }

  public void addAddress(Address address){
    addressList.add(address);
  }

  public List<Address> getAddresses() {
    // Iterator itr = addressList.iterator();     
    // while(itr.hasNext()){  
    //  System.out.println(itr.next());  
    // }  
    return addressList;
  }

  public static void main(String args[]) {
    
    // List of Address objects
    Address addressOne = new Address("15 Main St", "OH", "Cleveland", "44101");
    Address addressTwo = new Address("16 Main St", "OH", "Cleveland", "44101");
    Address addressThree = new Address("17 Main St", "OH", "Cleveland", "44101");
    Address addressFour = new Address("18 Main St", "OH", "Cleveland", "44101");

    // Business Object

    Business myBusiness = new Business("my Business");
    myBusiness.getName();

    // Add addresses to address list
    myBusiness.addAddress(addressOne);
    myBusiness.addAddress(addressTwo);
    myBusiness.addAddress(addressThree);
    myBusiness.addAddress(addressFour);

    // get list of addresses
    myBusiness.getAddresses();
  }
}