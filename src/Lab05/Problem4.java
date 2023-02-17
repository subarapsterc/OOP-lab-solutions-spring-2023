package Lab05;

public class Problem4 {

    /**
     * Function that returns a string by retrieving all the ASCII values of the stored characters and then
     * combines the characters together to form a String
     * @param list list containing the ascii values of a string
     * @return combined string from the ascii values in list
     */
    public static String combineAscii(LinkedList list) {
        /* Traverse through the list and keep appending each char to the output string */
        Node temp = list.head;
        String output = "";
        while (temp != null) {
            /* convert int to char and then append to string */
            output += (char) temp.data;
            temp = temp.next;
        }
        return output;
    }
}
