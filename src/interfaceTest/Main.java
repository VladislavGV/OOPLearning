package interfaceTest;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Danwich horror", "Lovecraft");
        book.print();
    }

}


class Book implements Printable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}