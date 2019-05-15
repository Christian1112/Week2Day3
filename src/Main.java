public class Main {

    public static void main(String[] args) {

        Employee p1 = new Employee("Benjamin","Schneider",1997, 1800);
        System.out.println("Your name is " + p1.getName() + " " + p1.getSurName() + ", born in " + p1.getYearOfBirth() + ", salary is " + p1.getSalary());

        p1.setName("Christian");
        p1.setSurName("Simic");
        p1.setYearOfBirth(1992);
        p1.setSalary(2000);

        System.out.println("Your name is " + p1.getName() + " " + p1.getSurName() + ", born in " + p1.getYearOfBirth() + ", salary is " + p1.getSalary());

    }
}
