import javax.print.DocFlavor;

public class Employee {

    private String name;
    private String surName;
    private int yearOfBirth;
    private int salary;

    Employee (String name, String surName, int yearOfBirth, int salary){
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public void setName (String newName){
        this.name = newName;
    }

    public String getName () {
        return this.name;
    }

    public void setSurName (String newSurName){
        this.surName = newSurName;
    }

    public String getSurName(){
        return this.surName;
    }

    public void setYearOfBirth (int newYearOfBirth){
        this.yearOfBirth = newYearOfBirth;
    }

    public int getYearOfBirth(){
        return this.yearOfBirth;
    }

    public void setSalary(int newSalary){
        this.salary = newSalary;
    }

    public int getSalary(){
        return this.salary;
    }





    //A1: Employee class get/set
    //Create employee class with following private variables: Name, Surname, yearOfBirth, Sallary (in EUR). Create public getter and setter methods. Create several objects,
    // and make the use of get and set methods.


}



