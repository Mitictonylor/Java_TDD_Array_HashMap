import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void getBookGenre(){
        Book book = new Book("I promessi sposi", "A. Manzoni", "classic");
        assertEquals("classic", book.getGenre());
    }
}
