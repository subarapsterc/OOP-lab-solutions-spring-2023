package Lab03;

public class Student {
    private String firstName;
    private String lastName;
    public String[] courseGrades = new String[10];

    public Student(String firstName, String lastName, int[] marks) {
        this.firstName = firstName;
        this.lastName = lastName;

        /* Init course array and assign random marks */
        /* Assigning courses at every alternate index in the array */
        courseGrades[0] = "Math";
        courseGrades[2] = "Science";
        courseGrades[4] = "English";
        courseGrades[6] = "Urdu";
        courseGrades[8] = "Chinese";

        int j = 0;
        for (int i = 1; i < courseGrades.length; i += 2) {
            courseGrades[i] = String.valueOf(marks[j]);
            j ++;
        }
    }

    public Student(String fName, String lName, String[] courses) {
        // step 4
        firstName = fName;
        lastName = lName;

        for (int i = 0; i < courseGrades.length; i += 2) {
            courseGrades[i] = courses[i];   // deep copy of courses array
            courseGrades[i + 1] = String.valueOf(randomGrade());    // randomised marks
        }
    }


    // step 5
    private int randomGrade() {
        return (int)(Math.random() * 101);
    }

    // step 6 + 7
    private String calculateGrade(int marks) {
        if (marks < 60)
            return "F";
        if (marks < 64)
            return "C-";
        if (marks < 68)
            return "C";
        if (marks < 72)
            return "C+";
        if (marks < 77)
            return "B-";
        if (marks < 82)
            return "B";
        if (marks < 87)
            return "B+";
        if (marks < 93)
            return "A-";
        else
            return "A";
    }

    public String getDetails() {
        String deets = String.format("First Name:%9s%nLast Name: %9s%n%n", firstName, lastName);

        for (int i = 0; i < courseGrades.length; i += 2) {
            deets += String.format("%-11s %4s  %s%n", courseGrades[i], courseGrades[i+1], calculateGrade(Integer.parseInt(courseGrades[i+1])));
        }

        return deets;
    }
}
