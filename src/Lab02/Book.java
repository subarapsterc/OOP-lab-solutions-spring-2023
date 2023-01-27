package Lab02;  // problem 01

public class Book {
    String title;
    String author;
    String ISBN;
    int numOfPages;

    Book(String title, String author, String ISBN, int numOfPages) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numOfPages = numOfPages;
    }

    String summary() {
        return String.format("Title: %s %nAuthor: %s %nISBN: %s %nNumber of pages: %d %n",
                title, author, ISBN, numOfPages);

        // String.format is used to do what System.out.printf does (without printing)
        // It's good for stuff like this where you need to return a long String with new lines and lots of moving parts
    }

    public static void main(String[] args) {
        Book harryPotter1 = new Book("Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling", "1234567890", 309);

        System.out.println(harryPotter1.summary());
    }

}
