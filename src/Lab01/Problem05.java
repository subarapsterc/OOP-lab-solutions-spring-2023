package Lab01;
// done by aaraiz
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time you would like to add or subtract to subtract please input a negative number");
        int input = sc.nextInt();
        TimeCalc(input);
    }

    public static void TimeCalc(int add) {
        int start_hr = 21;
        int start_min = 0;
        int start_sec = 0;
        int hr_add = add / 3600;
        add = add - (hr_add * 3600);
        int min_add = add / 60;
        add = add - (min_add * 60);
        start_sec += add;
        if (start_sec > 60) {
            start_sec = start_sec - 60;
            start_min = start_min + 1;
        } else if (start_sec < 0) {
            start_min = start_min - 1;
            start_sec = start_sec + 60;
        }
        start_min += min_add;
        if (start_min > 60) {
            start_min = start_min - 60;
            start_hr = start_min + 1;
        } else if (start_min < 0) {
            start_hr = start_hr - 1;
            start_min = start_min + 60;
        }
        start_hr += hr_add;
        if (start_hr >= 24) {
            start_hr = start_hr - 24;
        } else if (start_hr < 0) {
            start_hr = 24 + start_hr;
        }
        if (start_hr == 0) {
            System.out.print("00:");
        } else if (start_hr < 10) {
            System.out.print("0" + start_hr + ":");
        } else System.out.print(start_hr + ":");
        if (start_min == 0) {
            System.out.print("00:");
        } else if (start_min < 10) {
            System.out.print("0" + start_min + ":");
        } else System.out.print(start_min + ":");
        if (start_sec == 0) {
            System.out.print("00");
        } else if (start_sec < 10) {
            System.out.print("0" + start_sec);
        } else System.out.print(start_sec);
    }
}
