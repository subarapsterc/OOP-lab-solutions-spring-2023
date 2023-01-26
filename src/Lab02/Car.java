package Lab02;  // problem 02

public class Car {

    String make;
    String model;
    int year;
    String color;
    int wheelsNum;
    int doorsNum;

    Car(String make, String model, int year, String color, int numOfWheels, int numOfDoors) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        wheelsNum = numOfWheels;
        doorsNum = numOfDoors;
    }

    String details() {
        return String.format("Make: %s %nModel: %s %nYear: %d %nColor: %s %nNumber of wheels: %d %nNumber of doors: %d",
                make, model, year, color, wheelsNum, doorsNum);
    }

    public static void main(String[] args) {
        Car[] cars = {
                new Car("Ford", "Mustang", 2020, "Red", 4, 2),
                new Car("Honda", "Civic", 2019, "White", 4, 4),
                new Car("Tesla", "Model S", 2018, "Black", 4, 4)
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.printf("Car %d: %n", i + 1); // i + 1 so that the cars are labeled 1, 2, 3 instead of 0, 1, 2
            System.out.println(cars[i].details());
            System.out.println();                   // extra line between details to separate the cars
        }
    }
}
