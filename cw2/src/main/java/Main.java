import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .birthDate(new Date())
                .city("NY")
                .firstName("Kamil")
                .lastName("Piekos")
                .street("Random street")
                .sentence("wooo")
                .telephoneNumber(234145323)
                .houseNumber(123)
                .number(222)
                .build();

        System.out.println(person);
    }

}
