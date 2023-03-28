package Lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Car {

    private String model;
    private float price;
    private float roadWorthyPrice;
    private int[] roadTaxPer3Months;
    private String bodyType;
    private String transmission;
    private int noOfSeats;
    private char segment;
    private String introduction;

    private static Car[] cars = new Car[4];

    public Car() {

    }

    public Car(String model, float price, float roadWorthyPrice, int minTax, int maxTax, String bodyType,
               String transmission, int noOfSeats, char segment, String introduction) {
        this.model = model;
        this.price = price;
        this.roadTaxPer3Months = new int[]{minTax, maxTax};
        this.roadWorthyPrice = roadWorthyPrice;
        this.bodyType = bodyType;
        this.transmission = transmission;
        this.noOfSeats = noOfSeats;
        this.segment = segment;
        this.introduction = introduction;
    }

    public String getModel() {
        return this.model;
    }

    public float getPrice() {
        return this.price;
    }

    public float getRoadWorthyPrice() {
        return this.roadWorthyPrice;
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public char getSegment() {
        return this.segment;
    }

    public int getNoOfSeats() {
        return this.noOfSeats;
    }

    public String getIntroduction() {
        return  this.introduction;
    }

    public static void readAllCars() {
        try {
            File file = new File("src/Lab06/cars.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String model = sc.nextLine();
                System.out.println(model);

                String line = sc.nextLine();
                float price = Float.parseFloat(line.substring(line.length() - 6));  System.out.println(price);
//
//                line = sc.nextLine();
//                float newPriceR = Float.parseFloat(line.substring(line.length() - 6));  System.out.println(newPriceR);
//
//                line = sc.nextLine();
//                int minRT = Integer.parseInt(line.substring(line.length() - 11, line.length() - 8));    System.out.println(minRT);
//                int maxRT = Integer.parseInt(line.substring(line.length() - 3));    System.out.println(maxRT);
//
//                line = sc.nextLine();
//                String bodyType = line.substring(8);
//                System.out.println(bodyType);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", roadWorthyPrice=" + roadWorthyPrice +
                ", bodyType='" + bodyType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", segment=" + segment +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}