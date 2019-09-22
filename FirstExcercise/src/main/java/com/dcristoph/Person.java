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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", firstName:" + firstName + " lastName:'" + lastName + "\n"+
                "city:" + city + '\'' +
                " street:" + street + '\'' +
                " houseNumber:" + houseNumber + "\n" +
                ", telephoneNumber:" + telephoneNumber +
                ", birthDate:" + birthDate +
                ", sentence:" + sentence + '\'' +
                '}';
    }


    public Person(Builder myBuilder) {
        this.number = myBuilder.number;
        this.firstName = myBuilder.firstName;
        this.lastName = myBuilder.lastName;
        this.city = myBuilder.city;
        this.street = myBuilder.street;
        this.houseNumber = myBuilder.houseNumber;
        this.telephoneNumber = myBuilder.telephoneNumber;
        this.birthDate = myBuilder.birthDate;
        this.sentence = myBuilder.sentence;
    }

    public static class Builder {
        private int number;
        private String firstName;
        private String lastName;
        private String city;
        private String street;
        private int houseNumber;
        private int telephoneNumber;
        private Date birthDate;
        private String sentence;

        public Builder(int numberr, String firstNamee, String lastNamee, String cityy, String streett, int houseNumberr, int telephoneNumberr,
                       Date birthDatee, String sentencee) {
            this.number = numberr;
            this.firstName = firstNamee;
            this.lastName = lastNamee;
            this.city = cityy;
            this.street = streett;
            this.houseNumber = houseNumberr;
            this.telephoneNumber = telephoneNumberr;
            this.birthDate = birthDatee;
            this.sentence = sentencee;
        }

        public Person build (){
            return new Person(this);
        }
    }
}