package org.example;

import java.time.temporal.ValueRange;
import java.util.Optional;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(monday.whichDay(monday));
        System.out.println(monday.whichDay2(monday));

        PersonRepository personRepo = new PersonRepository();
        Person person1 = new Person("1", "Alice", DayOfWeek.MONDAY, Gender.FEMALE);
        Person person2 = new Person("2", "Alice", DayOfWeek.SUNDAY, Gender.MALE);
        personRepo.addPerson(person1);
        personRepo.addPerson(person2);


        Optional<Person> optionalPerson = personRepo.findById("1");
        System.out.println(optionalPerson);
        Optional<Person> optionalPerson2 = personRepo.findById("2");
        System.out.println(optionalPerson2);

        if(optionalPerson.isPresent()){
            System.out.println(optionalPerson.get());
            System.out.println(optionalPerson.get().favoriteDay());

        }else{
            System.out.println("Person isn't found.");
        }
        personRepo.numberOfGender();


        System.out.println(personRepo.findByName("Alice"));
        System.out.println(personRepo.findByName("Example"));
    }
}