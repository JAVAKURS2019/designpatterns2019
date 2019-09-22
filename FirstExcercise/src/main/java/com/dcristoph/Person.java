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

    public Person(int number, String firstName, String lastName, String city, String street, int houseNumber, int telephoneNumber, Date birthDate, String sentence) {


        public int getNumber () {
            return number;
        }

        public void setNumber ( int number){
            this.number = number;
        }

        public String getFirstName () {
            return firstName;
        }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public String getCity () {
            return city;
        }

        public void setCity (String city){
            this.city = city;
        }

        public String getStreet () {
            return street;
        }

        public void setStreet (String street){
            this.street = street;
        }

        public int getHouseNumber () {
            return houseNumber;
        }

        public void setHouseNumber ( int houseNumber){
            this.houseNumber = houseNumber;
        }

        public int getTelephoneNumber () {
            return telephoneNumber;
        }

        public void setTelephoneNumber ( int telephoneNumber){
            this.telephoneNumber = telephoneNumber;
        }

        public Date getBirthDate () {
            return birthDate;
        }

        public void setBirthDate (Date brithDate){
            this.birthDate = brithDate;
        }

        public String getSentence () {
            return sentence;
        }

        public void setSentence (String sentence){
            this.sentence = sentence;
        }


        @java.lang.Override
        public java.lang.String toString () {
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

        public boolean equals (Object object){
            if (this == object) return true;
            if (!(object instanceof Person)) return false;
            if (!super.equals(object)) return false;
            Person person = (Person) object;
            return number == person.number &&
                    firstName.equals(person.firstName) &&
                    lastName.equals(person.lastName) &&
                    birthDate.equals(person.birthDate);
        }

        public int hashCode () {
            return Objects.hash(super.hashCode(), number, firstName, lastName, birthDate);
        }
    }