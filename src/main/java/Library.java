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
        this.stock.add(bookName);
    }

    public boolean checkSpaceInStock() {
        if (this.capacity >= this.countStock()){
            return true;
            }else{
            return false;
        }
    }
}
