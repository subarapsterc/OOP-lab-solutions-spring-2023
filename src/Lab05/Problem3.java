package Lab05;

public class Problem3 {

    /**
     * Function that accepts a String as the input value, and then it extracts the
     * ASCII value of every character of the passed string and stores it in the list
     * @param text the text from which the ASCII values will be extracted
     * @param list The list in which the ascii values will be appended
     */
    public static void storeStringAscii(String text, LinkedList list) {
        /* traverse through the text and convert each character to int of its ascii value */
        for (int i = 0; i < text.length(); i ++) {
            int ascii = text.charAt(i);
            /* append the ascii value to list */
            list.append(ascii);
        }
    }
}
