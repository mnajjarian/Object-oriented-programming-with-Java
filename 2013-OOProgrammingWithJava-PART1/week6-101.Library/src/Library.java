import java.util.ArrayList;

public class Library {
    private ArrayList<Book> list;
    
    public Library() {
        this.list = new ArrayList<Book>();
        
    }
    public void addBook(Book newBook) {
        list.add(newBook);
        
    }
    public void printBooks() {
        for(Book b : this.list) {
            System.out.println(b);
        }
        
    }
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> result = new ArrayList<Book>();
        
        for(int i = 0; i < this.list.size(); i++) {
            if(StringUtils.included(this.list.get(i).title(), title)) {
            //if (this.list.get(i).title().contains(title)) {
                result.add(this.list.get(i));
            }
        }
        return result;
    }
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> result = new ArrayList<Book>();
        
        for(int i = 0; i < this.list.size(); i++) {
            if(StringUtils.included(this.list.get(i).publisher(), publisher)) {
            //if(this.list.get(i).publisher().contains(publisher)) {
                result.add(this.list.get(i));
            }
        }
        return result;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> result = new ArrayList<Book>();
        
        for(int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).year() == year) {
                result.add(this.list.get(i));
            }
        }
        return result;
    }
    
}
