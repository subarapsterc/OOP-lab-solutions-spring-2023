package Lab05;

public class LinkedList {
    /* Node to store the head of the linked list */
    Node head;

    /**
     * Method appends a data to the tail of linked list
     * @param data the data that needs to be appended in the linked list
     */
    public void append(int data) {
        /* If head is null, the list is empty, append it to the head */
        if (head == null) {
            this.head = new Node(data);
            return;
        }
        /* else, find the tail of the list by traversing and insert at end */
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = new Node(data);
    }

    /**
     * Method inserts data into linked list at a given index
     * @param data the data to be inserted in the linked list
     * @param index the index where it will be inserted
     */
    public void append(int data, int index) {
        /* if index is negative, return */
        if (index < 0) {
            System.out.println("Index cannot be negative");
            return;
        }
        /* If the list is empty, append it to the start */
        if (head == null) {
            this.head = new Node(data);
            return;
        }
        /* If the index is 0, data needs to be inserted at the start and head needs to be updated */
        if (index == 0) {
            Node ins = new Node(data);
            /* set next of insert to head */
            ins.next = head;
            /* set head as the new node */
            head = ins;
            return;
        }
        /* else traverse till that index and store current and previous nodes */
        Node current = head;
        Node prev = current;
        for (int i = 0; i < index; i++) {
            /* if the current.next is null, the list has ended, just insert data on tail */
            if (current.next == null) {
                current.next = new Node(data);
                return;
            }
            /* keep track of previous and current node */
            prev = current;
            current = current.next;
        }
        /* insert data after previous */
        prev.next = new Node(data);
        /* Link the new node properly with the current node */
        prev.next.next = current;

    }

    /**
     * Removes item from the linked list given the data
     * @param data the data to be removed from the list
     */
    public void remove(int data) {
        /* return if the list is empty, i.e. head is null */
        if (head == null) return;
        /* if the head has data, remove that node */
        if (head.data == data) {
            head = head.next;
            return;
        }
        /* else traverse through the list to find the node to be removed */
        Node curr = head;
        while (curr.next != null) {
            /* remove if found */
            if (curr.next.data == data) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    /**
     * Removes item from linked list given it's index
     * @param index the int index at which the data should be removed
     */
    public void removeFromIndex(int index) {
        /* if index is negative return */
        if (index < 0) {
            System.out.println("Index cannot be negative");
            return;
        }

        /* if the list is empty return */
        if (head == null) return;
        /* if the index is 0, the head should be removed */
        if (index == 0) {
            head = head.next;
            return;
        }
        /* else traverse till that index and keep track of prev and current nodes */
        Node temp = head;
        Node prev = temp;
        for (int i = 0; i < index; i ++) {
            /* if the last node is reached, and index hasn't ended remove the last node */
            if (temp.next == null) {
                System.out.println("removal: index does not exist");
                return;
            }
            /* update prev and temp */
            prev = temp;
            temp = temp.next;
        }
        /* deleting after the for loop exit */
        prev.next = temp.next;
    }

    /**
     * Method removes all occurrences of the given data
     * @param data takes data input of which all occurrences should be removed
     */
    public void removeAllOccurrences(int data) {
        /* Traverse through the list and call remove method on every node */
        Node curr = head;
        while (curr != null) {
            remove(data);
            curr = curr.next;
        }
    }

    /**
     * Method that will display the string items
     * @return string of all items in list
     */
    public String toString() {
        String out = "[ ";
        Node cur = head;
        while (cur != null) {
            out += cur.data + " ";
            cur = cur.next;
        }
        out += "]";
        return out;
    }


}
