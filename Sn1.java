import java.util.ArrayList;
class Book{
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn = isbn;
    }
    public void displayBook(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+isbn);
    }
}

class Library{
    ArrayList<Book> books = new ArrayList<>(); // this array will store objects of class Book
    public void addBook(Book b){
        books.add(b);
        System.out.println("book added!!");
    }
    public Book searchByTitle(String title){
        for(int i=0;i < books.size() ; i++){
            Book b = books.get(i);
            if(b.title.equalsIgnoreCase(title)){
                System.out.println("Book found!!");
                return b; // b stores the title of the book
            }
        }
       System.out.println("Book not found!!");
       return null;
       
    }
     void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("No books are there!!");
            return; //stops further searching
        }
        for(int i=0;i < books.size();i++){
            books.get(i).displayBook();
        }
    }
}
public class Sn1{
    public static void main(String[]args){
        Library l = new Library();
        Book b1 = new Book("Java Basics","James Gosling","1111");
        Book b2 = new Book("Data Structure","MARK Allen","2222");
        Book b3 = new Book ("OS","Andew Tanenbaum","3333");

        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);

        System.out.println("All Books: ");
        l.displayAllBooks();

       l.searchByTitle("Java Basics");
        
    }
}
      