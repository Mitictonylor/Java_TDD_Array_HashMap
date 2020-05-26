import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private Library library1;
    private Library library2;

    @Before
    public void setUp(){
        book1 = new Book("I promessi sposi", "A. Manzoni", "classic");
        book2 = new Book("David Copperfield", "Charles Dickens", "classic");
        book3 = new Book("Charlotte Bronte", "Jane Eyre", "classic");
        book4 = new Book("Flour Salt Yeast", "Ken Forkish", "food");
        book5 = new Book("Twelve Years a Slave", "Solomon Northup", "romance");
        book6 = new Book("A bried history of time", "Stephen Hawking", "science");
        library1 = new Library(1);
        library2 = new Library(200);
    }
    @Test
    public void canCountHowManyBookAreInTheLibraryStock(){
        assertEquals(0, library1.countStock());
    }
    @Test
    public void canAddABookToTheStock(){
        library1.addBookToStock(book1);
        library2.addBookToStock(book2);
        assertEquals(1, library1.countStock());
        assertEquals(1, library2.countStock());
    }
    @Test
    public void checkIfThereIsEnoughSpaceInTheLibraryStock_noSpace(){
        library1.addBookToStock(book1);
        library1.addBookToStock(book2);
        assertEquals(1, library1.countStock());
    }
    @Test
    public void checkIfThereIsEnoughSpaceInTheLibraryStock_SpaceAvailable(){
        library2.addBookToStock(book1);
        library2.addBookToStock(book2);
        assertEquals(2, library2.countStock());
    }
}
