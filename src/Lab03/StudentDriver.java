package Lab03;

public class StudentDriver {
    public static void main(String[] args) {

        // step 1
        String[] first_names = {
                "Alpha",    "Beta",
                "Charlie",  "Delta",
                "Echo",     "Foxtrot",
                "Golf",     "Hotel",
                "India",    "Juliet"
        };

        String[] second_names = {
                "Kilo",     "Lima",
                "Mike",     "November",
                "Oscar",    "Papa",
                "Quebec",   "Romeo",
                "Sierra",   "Tango"
        };

        String[] courses = {
                "English:",   "",
                "Maths:",     "",
                "Physics:",   "",
                "Chemistry:", "",
                "Art:",       ""
        };


        // step 2
        Student[] students = new Student[20];

        // to print all the students' info
        for (int i = 0; i < students.length; i++) {
            Student tempStud = new Student(randomName(first_names), randomName(second_names), courses);
            students[i] = tempStud;

            System.out.println(tempStud.getDetails());
        }

        Student bestStudent = findBestStudent(students);
        System.out.printf("%n--- BEST STUDENT ---%n");
        System.out.println(bestStudent.getDetails());
    }

    // step 3
    private static String randomName(String[] names) {
        return names[(int)(Math.random() * 10)];
    }

    // problem 3
    private static Student findBestStudent(Student[] students) {
        int highestMarks = 0;
        int highestFailMarks = 0;
        int indexBestStudent = -1;
        int indexBestFailStudent = -1;

        for (int i = 0; i < students.length; i++) {
            boolean fail = false;
            int total = 0;

            for (int j = 1; j < students[i].courseGrades.length; j += 2) {      // determines if student failed any course and calculates total marks
                int grade = Integer.parseInt(students[i].courseGrades[j]);
                total += grade;
                if (grade < 60) {
                    fail = true;
                }
            }

            if (fail) {
                if (highestFailMarks < total) {
                    highestFailMarks = total;
                    indexBestFailStudent = i;
                }
            }

            else {
                if (highestMarks < total) {
                    highestMarks = total;
                    indexBestStudent = i;
                }
            }

        }

        if (indexBestStudent != -1)      // if at least one student didn't fail
            return students[indexBestStudent];

        return students[indexBestFailStudent];
    }

}