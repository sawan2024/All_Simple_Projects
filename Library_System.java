/**
 * @author sawan
 * @version 0.2
 * @see <a href=https://docs.oracle.com/en/java/javase/14/docs/api/index.html>Java<a/>
 * @since 2004
 */


 class Library{
//    String [] book =new String[100];  to way to defined the Array String
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String books){
        this.books[no_of_books] = books;
        no_of_books++;
        System.out.println("this books has been add");
    }
    void ShowAvailableBooks(){
        System.out.println("All Available Books");
        for (String book : this.books){
            if (book == null){
//                break;    //After null Value Find Check the array and Show All
                continue;
            }
            System.out.println("* "+ book);
        }
    }
    void isIssued(String book){
        for (int i = 0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The Book has been isIssued");
                this.books[i]=null;
                return;
            }
            System.out.println("* "+ book);
        }
        System.out.println("this books does not exit");
    }
    void returnbook(String book){
        this.books[no_of_books] = book;
        System.out.println(book + "Book Has Been Return");
    }


}

public class Library_System{
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think And Grow Rich");
        centralLibrary.addBook("c++");
        centralLibrary.addBook("java");
        centralLibrary.addBook("javascript");
        centralLibrary.ShowAvailableBooks();
        centralLibrary.isIssued("c++");
        centralLibrary.ShowAvailableBooks();
        centralLibrary.returnbook("c++");
        centralLibrary.ShowAvailableBooks();
    }
}