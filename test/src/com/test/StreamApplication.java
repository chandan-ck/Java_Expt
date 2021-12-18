package com.test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {

    static List<User> users = Arrays.asList(
            new User("C", 30),
            new User("D", 40),
            new User("A", 10),
            new User("B", 20),
            new User("E", 50));

    public static void main(String[] args) {
        
        /*List<User> sortedList = users.stream()
            .sorted((o1, o2) -> o1.getAge() - o2.getAge())
            .collect(Collectors.toList());*/
            
        List<User> sortedList = users.stream()
            .sorted(Comparator.comparingInt(User::getAge))
            .collect(Collectors.toList());
 
        sortedList.forEach(System.out::println);
        
        
      //first name comparator
        Comparator<User> compareByFirstName = Comparator.comparing( User::getName );
         
        //last name comparator
        Comparator<User> compareByLastName = Comparator.comparing( User::getAge );
         
        //Compare by first name and then last name (multiple fields)
		Comparator<User> compareByFullName = compareByFirstName.thenComparing(compareByLastName);

		// Using Comparator - pseudo code
		users.stream().sorted(compareByFirstName).collect(Collectors.toList());

		Comparator<User> compareByName = Comparator.comparing(User::getName)
				.thenComparing(User::getName);

		List<User> sortedEmployees = users.stream().sorted(compareByName).collect(Collectors.toList());

		System.out.println(sortedEmployees);

    }

    static class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}