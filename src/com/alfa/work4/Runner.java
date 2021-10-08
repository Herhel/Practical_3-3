package com.alfa.work4;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public void run() {

        List<Person> people = Arrays.asList(
                new Person("Jim", 18, "male"),
                new Person("Vano", 19, "male"),
                new Person("Dima", 24, "male"),
                new Person("Lena", 33, "female"),
                new Person("Dianna", 20, "female"),
                new Person("Max", 12, "male"));

        people.stream()
                .filter(x -> x.getGender().equalsIgnoreCase("male") && x.getAge() >= 18 && x.getAge() <= 27)
                .forEach(System.out::println);

        double avg = people.stream()
                .filter(p -> p.getGender().equalsIgnoreCase("female"))
                .mapToInt(p -> p.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
