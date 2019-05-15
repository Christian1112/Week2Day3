public class Books extends Product {

    private String title;
    private String author;
    private int pages;

    Books (String name, String description, int price, String title, String author, int pages){
        super(name, description, price);
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
