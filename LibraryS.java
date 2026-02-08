import java.util.Scanner;

class Library{
    String[] availableBooks=new String[10];
    String[] issuedBooks=new String[10];

    int availCount=0;
    int issueCount=0;

    void addBook(String bookName){
        availableBooks[availCount]=bookName;
        availCount++;
        System.out.println("Book added successfully!!");
    }

    void showAvailableBooks(){
        for(int i=0;i<availCount;i++){
            if(availableBooks[i]!=null){
                System.out.println("- "+availableBooks[i]);
            }
        }
    }

    void issueBook(String bookName){
        for(int i=0;i<availCount;i++){
            if(bookName.equals(availableBooks[i])){
                issuedBooks[issueCount]=bookName;
                issueCount++;
                availableBooks[i]=null;
                System.out.println("Issued successfully!!");
                return;
            }
        }
        System.out.println("Book not available!!");
    }

    void returnBook(String bookName){
        availableBooks[availCount]=bookName;
        availCount++;
        System.out.println("Book returned!");
    }
}

public class LibraryS{
    public static void main(String[]args){

        Library lib=new Library();

        lib.addBook("Java");
        lib.addBook("DBMS");
        lib.addBook("OS");

        lib.showAvailableBooks();

        lib.issueBook("Java");

        lib.showAvailableBooks();

        lib.returnBook("Java");

        lib.showAvailableBooks();
    }
}
