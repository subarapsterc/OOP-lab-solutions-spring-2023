package Lab02;

import java.util.Random;

public class Problem04 {
    public static void main(String[] args) {
        String[] personNames = { "Alpha", "Beta", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet" };
        String[] petNames = { "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango" };
        Random random = new Random();

        Person[] people = new Person[(int) (Math.random() * 50 + 1)];

        for (int i = 0; i < people.length; i++) {
            Pet temp = new Pet(petNames[random.nextInt(10)], "puppy", random.nextInt(10));
            people[i] = new Person(personNames[random.nextInt(10)], random.nextInt(100), temp);

            System.out.println(people[i].getDetails());
            System.out.println();
        }
        System.out.println("total people: " + people.length);
    }
}
