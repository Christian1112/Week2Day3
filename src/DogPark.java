public class DogPark {

    private int birthYear;
    private String ownerName;
    private String behaviour;

    DogPark (int birthYear, String ownerName, String behaviour){

        this.birthYear = birthYear;
        this.ownerName = ownerName;
        this.behaviour = behaviour;

    }

    public void setBirthYear(int newBirthYear){
        this.birthYear = this.birthYear;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setOwnerName ( String newOwnerName){
        this.ownerName = this.ownerName;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setBehaviour( String newBehaviour){
        this.behaviour = newBehaviour;
    }

    public String getBehaviour(){
        return this.behaviour;
    }

}
