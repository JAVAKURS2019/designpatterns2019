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

    // <editor-fold desc="Person setters and getters">
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
    // </editor-fold>

    @Override
    public String toString() {
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
            Person person = new Person();

            person.setSentence(sentence);
            person.setStreet(street);
            person.setNumber(number);
            person.setLastName(lastName);
            person.setHouseNumber(houseNumber);
            person.setFirstName(firstName);
            person.setCity(city);
            person.setBirthDate(birthDate);
            person.setTelephoneNumber(telephoneNumber);

            return person;
        }
    }

    private Person() {
    }
}