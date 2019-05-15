public class Pets extends Product {
    private String race;
    private String age;

    Pets(String name, String description, int price, String race, String age){
        super(name, description, price);
        this.race = race;
        this.age = age;
    }

    public String getRace(){
        return this.race;
    }

    public void setRace(String race){
        this.race = race;
    }

    public String getAge(){
        return this.age;
    }

    public void setAge(String age){
        this.age = age;
    }
}
