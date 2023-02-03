package Lab03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        try {
            File file = new File("./src/Lab03/data.txt");
            Scanner sc = new Scanner(file);

            Student[] students = new Student[sc.nextInt()];
            int j = 0;
            while (sc.hasNext()) {
                String fname = sc.next();
                String lname = sc.next();
                int[] marks = new int[5];
                for (int i = 0; i < marks.length; i++) {
                    marks[i] = sc.nextInt();
                }
                Student student = new Student(fname, lname, marks);
                students[j] = student;
                j++;
            }

            System.out.println("Best student: ");
            System.out.println(StudentDriver.findBestStudent(students).getDetails());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
