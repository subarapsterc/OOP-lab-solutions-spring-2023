package Lab10;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends JFrame{
    public static void main(String[] args) throws FileNotFoundException {
        // PROBLEM 1
        File file = new File("C:\\Users\\subata\\IdeaProjects\\OOP-lab-solutions-spring-2023\\src\\Lab10\\pk.csv");
        Scanner scanner = new Scanner(file);
//         scanner file not found exception dekhna

        scanner.nextLine();     // skips column titles

        City[] cities = new City[158];
        for (int i = 0; scanner.hasNext(); i++) {
            String[] line = scanner.nextLine().split(",");
            cities[i] = new City(
                    line[0],
                    Float.parseFloat(line[1]),
                    Float.parseFloat(line[2]),
                    line[3],
                    line[4],
                    line[5]);

            System.out.println("\n"+ (i+1));
            System.out.println(cities[i]);
        }

        System.out.println("\n--------------- PROBLEM 2 ---------------");

        ArrayList<City> sindh = new ArrayList<>();
        ArrayList<City> punjab = new ArrayList<>();
        ArrayList<City> kpk = new ArrayList<>();
        ArrayList<City> islamabad = new ArrayList<>(); 
        ArrayList<City> balochistan = new ArrayList<>();
        ArrayList<City> gilgit = new ArrayList<>();
        ArrayList<City> kashmir = new ArrayList<>();

        for (int i = 0; i < cities.length; i++) {
            switch (cities[i].admin_name) {
                case "Sindh": {
                    sindh.add(cities[i]);
                    break;
                }
                case "Punjab": {
                    punjab.add(cities[i]);
                    break;
                }
                case "Khyber Pakhtunkhwa": {
                    kpk.add(cities[i]);
                    break;
                }
                case "Islāmābād": {
                    islamabad.add(cities[i]);
                    break;
                }
                case "Balochistān": {
                    balochistan.add(cities[i]);
                    break;
                }
                case "Gilgit-Baltistan": {
                    gilgit.add(cities[i]);
                    break;
                }
                case "Azad Kashmir": {
                    kashmir.add(cities[i]);
                    break;
                }
            }
        }

        System.out.println("\nIslamabad: \n" + islamabad + "\n");

        punjab.add(islamabad.get(0));
        islamabad.remove(islamabad.get(0));
        System.out.println("> moved islamabad to punjab\n");

        System.out.println("Islamabad:\n" + islamabad + "\n");

        System.out.println(punjab.get(punjab.size() - 1) + "> This city is now in Punjab.");

        System.out.println("\n--------------- PROBLEM 3 ---------------");

        CityFactory factory = new CityFactory(sindh, punjab, kpk, balochistan, gilgit, kashmir);
        System.out.println(factory.getCityFrom(CityFactory.KASHMIR));
        System.out.println(factory.getCityFrom(CityFactory.KASHMIR));

//      --------------- PROBLEM 4 ---------------

        JFrame frame = new JFrame("Cities of Pakistan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Map map = new Map(cities);
        frame.add(map);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

//        initMap(cities);
    }

    public void initMap(City[] cities){

    }
}
