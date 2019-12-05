package com.lastjavafxtest;

public class ContactResult {

    private  StringBuilder First;
    private  StringBuilder addressLine1;
    private  StringBuilder city;
    private  StringBuilder zipCode1;
    private  StringBuilder zipCode2;
    private  StringBuilder phone;
    private  StringBuilder email;

    private ContactResult(Builder builder) {
       // Builder builder = new Builder();
    }

    public static class Builder{

        public Builder(){

        }
    }



}
