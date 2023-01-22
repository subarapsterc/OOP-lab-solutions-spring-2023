package Lab01;

public class Problem02 {
    public static void main(String[] args) {
        String original = "bananas";
        String find = "anas";
        FindIndex(original, find);
    }

    public static int FindIndex(String original, String find) {
        int index_found = 0;
        boolean match_found = false;
        for (int i = 0; i < original.length(); i++) {
            String store = "";
            for (int x = i; x < i + find.length(); x++) {
                store += original.charAt(x);
            }
            if (find.compareTo(store) == 0) {
                index_found = i;
                match_found = true;
                break;
            }
        }
        if (match_found) {
            System.out.println("match found at index " + index_found);
        } else {
            System.out.println("no match");
            index_found = -1;
        }
        return index_found;
    }
}