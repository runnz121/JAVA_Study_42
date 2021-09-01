package ex4;

public class Book {

    private String bookName;
    private String author;

    public Book(){};
    public Book (String title, String author) {
        this.bookName = title;
        this.author = author;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(bookName+","+author);
    }
}
