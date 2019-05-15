public class PhysicalBook extends Books {

    private int weight;

    PhysicalBook (String name, String description, int price, String title, String author, int pages, int weight){
        super(name, description, price, title, author, pages);
        this.weight = weight;

    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return "Name: " + "\"" + getName() + "\"" + ", Description: " + getDescription() + ", Price: " + getPrice() + "€, Title: " + "\"" + getTitle() + "\"" + ", Author: " + getAuthor() + ", Pages: " + getPages() + ", Weight: " + getWeight() + "kg";
    }
}
