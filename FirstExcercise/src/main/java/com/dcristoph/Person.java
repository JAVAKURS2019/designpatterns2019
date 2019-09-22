package com.dcristoph;

import java.util.Date;

public class Person {

    private int number;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private int houseNumber;
    private int telephoneNumber;
    private Date birthDate;
    private String sentence;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    private Person(PersonBuilder builder) {
        this.number = builder.number;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.city = builder.city;
        this.street = builder.street;
        this.houseNumber = builder.houseNumber;
        this.telephoneNumber = builder.telephoneNumber;
        this.birthDate = builder.birthDate;
        this.sentence = builder.sentence;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "number=" + number +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", telephoneNumber=" + telephoneNumber +
                ", birthDate=" + birthDate +
                ", sentence='" + sentence + '\'' +
                '}';
    }

    public static class PersonBuilder{
        //base arguments
        private int number;
        private String firstName;
        private String lastName;
        //optional arguments
        private String city;
        private String street;
        private int houseNumber;
        private int telephoneNumber;
        private Date birthDate;
        private String sentence;

        public PersonBuilder(int number, String firstName, String lastName) {
            this.number = number;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public PersonBuilder setHouseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public PersonBuilder setTelephoneNumber(int telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public PersonBuilder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public PersonBuilder setSentence(String sentence) {
            this.sentence = sentence;
            return this;
        }

        public Person build() {
            return new Preson(this);
        }
    }
}
