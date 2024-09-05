package OOP_N03_WEEK2.main.java.com.mycompany.app;

public class Book {
    String title;
    String author;
    int numPages;
    Book(){};
    public Book(String t, String a, int p){
        title = t;
        author = a;
        numPages = p;
    }

    public String toString() {
        return ("Book Title: '" + title + "', Author: '" + author + "', Page: " + numPages );
    }

}
