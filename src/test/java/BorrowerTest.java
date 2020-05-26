import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private Library library;
    private Borrower borrower;

    @Before
    public void setUp(){
        book1 = new Book("I promessi sposi", "A. Manzoni", "classic");
        book2 = new Book("David Copperfield", "Charles Dickens", "classic");
        book3 = new Book("Charlotte Bronte", "Jane Eyre", "classic");
        book4 = new Book("Flour Salt Yeast", "Ken Forkish", "food");
        book5 = new Book("Twelve Years a Slave", "Solomon Northup", "romance");
        book6 = new Book("A bried history of time", "Stephen Hawking", "science");
        library = new Library(100);
        borrower = new Borrower();
    }

    @Test
    public void howManyBookInTheCollection(){
        assertEquals(0, borrower.countBookInCollection());
    }
    @Test
    public void canAddBookToCollection(){
        library.addBookToStock(book1);
        library.borrowTo(book1, borrower);
        assertEquals(1, borrower.countBookInCollection());
    }




}
