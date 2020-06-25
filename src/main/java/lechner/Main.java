package lechner;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library("Objectophiles unite");


        Book b1 = new Book("Love Train", "John Mc ChooChoo", "english", "romance", 69);
        Book b2 = new Book("10 Things you didn't now your desk lamp could do", "Phil Bright", "english", "self development", 205);
        Book b3 = new Book("You really gon' sit on that?!", "Shatiqua", "universal", "love/horror", 58219);

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        Person p1 = new Person(1, 200);
        Person p2 = new Person(2, 3);
        Person p3 = new Person(3, 985109320);


        lib.lendBook(p1, b1);
        lib.lendBook(p2, b2);
        lib.lendBook(p3, b3);

        lib.returnBook(p1, b1, 5);
        lib.returnBook(p3, b3, 30000);
    }
}
