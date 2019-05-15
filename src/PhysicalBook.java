public class PhysicalBook extends Books {

    public int weight;

    PhysicalBook (String name, String description, int price, String title, String author, int pages, int weight){
        super(name, description, price, title, author, pages);
        this.weight = weight;

    }
}
