package Lab02;  // problem 03

public class Person {
    String name;
    int age;
    Pet pet;

    Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    String getDetails() {
        return String.format("Name: %s %nAge: %d %n%s", name, age, pet.getDetails());
    }

    public static void main(String[] args) {
        Pet myPet = new Pet("Nova", "Arabian Mau", 2);
        Person me = new Person("Subata", 22, myPet);

        System.out.println(me.getDetails());
    }
}
