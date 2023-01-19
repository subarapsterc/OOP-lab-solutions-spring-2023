package Lab01;

public class Problem01 {
    public static void main(String[] args) {

        String name = "subata";
        int age = 22;
        float height = 1.6f;

        String info = name + "*" + age + "*" + height;
        // info = "subata*22*1.6"

        System.out.println("name: " + getName(info));
        System.out.println("age: " + getAge(info));
        System.out.println("height: " + getHeight(info));

    }

    static String getName(String info) {
        return findString(info, 0);
    }

    static int getAge(String info) {
        return Integer.parseInt(findString(info, 1));
    }

    static float getHeight(String info) {
        return Float.parseFloat(findString(info, 2));
    }

    private static String findString(String info, int targetIndex) {
        int index = 0;
        String s = "";

        for (int i = 0; i < info.length(); i++) {

            // locate correct section
            if (info.charAt(i) == '*') {
                index++;
            }

            // when in correct section, append character into new string
            else if (index == targetIndex) {
                s = s + info.charAt(i);
            }

            // optional: break statement for when index reaches past target index
            if (index > targetIndex) {
                break;
            }
        }

        return s;
    }
}
