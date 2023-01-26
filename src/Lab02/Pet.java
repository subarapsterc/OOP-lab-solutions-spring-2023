package Lab02;  // problem 03

public class Pet {
    String name;
    String breed;
    int age;

    Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    String getDetails() {
        return String.format("Pet Name: %s %nPet Breed: %s %nPet Age: %d", name, breed, age);
    }
}
