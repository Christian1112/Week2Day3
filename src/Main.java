public class Main {

    public static void main(String[] args) {

        //A1
        /*
        Employee p1 = new Employee("Benjamin","Schneider",1997, 1800);
        System.out.println("Your name is " + p1.getName() + " " + p1.getSurName() + ", born in " + p1.getYearOfBirth() + ", salary is " + p1.getSalary());

        p1.setName("Christian");
        p1.setSurName("Simic");
        p1.setYearOfBirth(1992);
        p1.setSalary(2000);

        System.out.println("Your name is " + p1.getName() + " " + p1.getSurName() + ", born in " + p1.getYearOfBirth() + ", salary is " + p1.getSalary());
        */

        //A2
        /*
        DogPark dog1 = new DogPark(2015,"Benjamin","stretching");
        System.out.println("The dog was born in " + dog1.getBirthYear() + ", the owners name is " + dog1.getOwnerName() + ", the dog is " + dog1.getBehaviour() + ".");

        dog1.setBirthYear(2019);
        System.out.println("The dog was born in " + dog1.getBirthYear() + ", the owners name is " + dog1.getOwnerName() + ", the dog is " + dog1.getBehaviour() + ".");
         */

        //A3

        Student[] allStudents = {
                new Student("Christian Simic", 1992, "3b"),
                new Student("Benjamin Schneider", 1997, "1c"),
                new Student("Simon Blaha", 1990, "7b"),
                new Student("Judith Lang-Ladurner", 1980, "6d"),
                new Student("Annina Henninger", 1980, "6a"),
                new Student("Jenny Tang", 1995, "3c"),
        };

        for(int i = 0; i < allStudents.length; i++){
            System.out.println(allStudents[i].printAllData());
        }
    }
}
