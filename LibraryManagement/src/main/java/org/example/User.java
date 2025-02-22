package org.example;

public class User {
    public String name;
    private int contact;
    protected String address;


    public void printUserDetails(){

        System.out.println("User name" + name);
        System.out.println("Contact" + contact);
        System.out.println("Address" + address);
    }
    public int getContact(int contact){
        return contact;
    }

    public String getName(String name){
        return name;
    }
}
