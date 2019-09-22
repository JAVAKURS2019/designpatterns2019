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

    public static final class Builder {
        private int number;
        private String firstName;
        private String lastName;
        private String city;
        private String street;
        private int houseNumber;
        private int telephoneNumber;
        private Date birthDate;
        private String sentence;


        public Builder number(int number) {
            this.number = number;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder houseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder telephoneNumber(int telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public Builder birthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder sentence(String sentence) {
            this.sentence = sentence;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public Person(Builder builder) {

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
}
