
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;


    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }


    public int countStock() {
        return this.stock.size();
    }

    public void addBookToStock(Book bookName) {
        if (this.countStock() < this.capacity) {
            this.stock.add(bookName);
        }
    }

    public void removeBookFromStock(Book book) {
        int index = this.stock.indexOf(book);
        this.stock.remove(index);
    }


    public void borrowTo(Book book, Borrower borrower) {
        borrower.addBookToCollection(book);
        this.removeBookFromStock(book);

    }

    public ArrayList<String> getAllTheGenres() {
        ArrayList<String> genres = new ArrayList<String>();
        for (Book book : this.stock) {
            if (!genres.contains(book.getGenre())) {
                genres.add(book.getGenre());
            }
        }
        return genres;
    }
}


