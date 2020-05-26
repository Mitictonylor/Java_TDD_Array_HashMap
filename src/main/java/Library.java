import java.util.ArrayList;

public class Library {

    private int capacity ;
    private ArrayList stock;


    public Library(int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }


    public int countStock() {
        return this.stock.size();
    }

    public void addBookToStock(Book bookName) {
        if (this.countStock() < this.capacity){
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
}
