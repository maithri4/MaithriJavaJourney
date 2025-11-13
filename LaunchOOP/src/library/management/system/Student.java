package library.management.system;

public class Student extends User
{
    public Student(String userName, String userId) {
        super(userName, userId);
    }

    public void borrowBook(Book book, Librarian librarian){
        librarian.issueBook(book, this);
    }
}
