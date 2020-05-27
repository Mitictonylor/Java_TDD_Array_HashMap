
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;
    private HashMap<String, Integer> genreHashMap;


    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
        this.genreHashMap = new HashMap<String, Integer>();
    }


    public int countStock() {
        return this.stock.size();
    }

    public void addBookToStock(Book bookName) {
        if (this.countStock() < this.capacity) {
            this.stock.add(bookName);
            this.addToGnereHashMap(bookName);
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
//if the genre already exist in the hashmap extract
// the existing count and assign it to the variable counter
    public void addToGnereHashMap(Book book){
        String genre = book.getGenre();

        if(this.genreHashMap.containsKey(genre)){
            int counter = this.genreHashMap.get(genre);
            counter ++;
            this.genreHashMap.put(genre, counter);
        }else{
            this.genreHashMap.put(genre, 1);
        }
    }


}


