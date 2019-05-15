public class EBook extends Books {

    private String url;

    EBook (String name, String description, int price, String title, String author, int pages, String url){
        super(name, description, price, title, author, pages);
        this.url = url;
    }

    public String getUrl(){
        return this.url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String toString(){
        return "Name: " + "\"" + getName() + "\"" + ", Description: " + getDescription() + ", Price: " + getPrice() + "€, Title: " + "\"" + getTitle() + "\"" + ", Author: " + getAuthor() + ", Pages: " + getPages() + ", URL: " + getUrl();
    }
}

