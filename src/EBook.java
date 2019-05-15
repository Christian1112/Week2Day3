public class EBook extends Books {

    private String url;

    EBook (String name, String description, int price, String title, String author, int pages, String url){
        super(name, description, price, title, author, pages);
        this.url = url;
    }
}
