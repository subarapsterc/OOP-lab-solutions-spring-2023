package Lab05;
// done by ali ahmed

public class LinkedListManager {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(10);
        list.append(10);
        list.append(5);
        list.append(1, 0);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.removeFromIndex(2);
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        list.removeAllOccurrences(10);
        System.out.println(list);

        String text = "This is some text that will be converted to ASCII values";

        Problem3.storeStringAscii(text, list);
        System.out.println("ASCII values in list: " + list);
        String out = Problem4.combineAscii(list);
        System.out.println(out);
    }
}
