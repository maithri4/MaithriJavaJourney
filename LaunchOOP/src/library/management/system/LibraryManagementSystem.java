package library.management.system;

public class LibraryManagementSystem {
    public static void main(String[] args)
    {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "James Gosling", "ISBN143");
        Book book2 = new Book("Python","Guido Van rossum","ISBN1009");

        Student student1 = new Student("Jyothish","s1");
        Student student2 = new Student("Maithri","s2");
        Librarian librarian = new Librarian("Mr.John","l1");

        librarian.addBook(library, book1);
        librarian.addBook(library, book2);

        System.out.println();
        student2.borrowBook(book1, librarian);
        student2.borrowBook(book1, librarian);

        System.out.println();
        System.out.println("Displaying Books:- ");
        library.showBooks();
    }
}
