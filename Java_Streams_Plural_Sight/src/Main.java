import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        // Add initial person
        personList.add(new Person("Ali", "Veli", "London", 21));

        // Randomly generate and add 50 more persons
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            String firstName = generateRandomName();
            String lastName = generateRandomName();
            String classRoom = generateRandomClassroom();
            int age = random.nextInt(50) + 11; // Random age between 18 and 67

            personList.add(new Person(firstName, lastName, classRoom, age));
        }

        // Print the personList
//        for (Person person : personList) {
//            System.out.println(person);
//        }


//        List<String> firstNameList = personList.stream()
//                .map(Person::getFirstName)
//                .filter(firstName -> firstName.toLowerCase().contains("A".toLowerCase()))
//                .collect(Collectors.toList());
//
//        System.out.println(firstNameList);

//        List<Integer> ageUnderEighteenList = personList.stream()
//                .map(Person::getAge)
//                .filter(e -> e < 18)
//                .collect(Collectors.toList());
//
//        System.out.println(ageUnderEighteenList);


//        personList.stream()
//                .filter(person -> person.getAge() > 56)
//                .toList()
//                .forEach(System.out::println);
//

//        List<String> nameToLowerCase = personList.stream()
//                .map(person -> person.getFirstName().toLowerCase())
//                .collect(Collectors.toList());
//
//        System.out.println(nameToLowerCase);

//        long count = personList.stream().count();
//
//        System.out.println(count);

//        long count = personList.stream()
//                .map(Person::getAge)
//                .filter(age -> age < 25)
//                .count();
//
//        System.out.println(count);


















    }


    private static String generateRandomName() {
        String[] names = {"John", "Emma", "Sophia", "Zoe", "Kelly", "Ali", "Francis",
                "Michael", "Olivia", "William", "Ava", "James", "Isabella", "Alexander"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    // Helper method to generate a random class room
    private static String generateRandomClassroom() {
        String[] classrooms = {"Ankara", "Brusssel", "Colchester", "Dunkirk", "Edinburgh"};
        Random random = new Random();
        return classrooms[random.nextInt(classrooms.length)];
    }

}

