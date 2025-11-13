package library.management.system;

public class Librarian extends User{

    public Librarian(String userName, String userId) {
        super(userName, userId);
    }

    void issueBook(Book book, Student student){
        if(book.isAvailable()){
            System.out.println(student.getUserName()+" borrowed "+book);
            book.bookIssued();
        }
        else
            System.out.printf("Sorry! %s is currently unavailable.", book.getTitle());
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
        System.out.println("Librarian " + this.getUserName() + " added " + book);
    }
}
