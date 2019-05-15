import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    private String name;
    private int birthYear;
    private String classe;

    Calendar calendar = new GregorianCalendar();
    private int currentYear = calendar.get(Calendar.YEAR);

    public Student(String name, int birthYear, String classe){
        this.name = name;
        this.birthYear = birthYear;
        this.classe = classe;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int calcAge(int currentYear){
        int age = 0;
        age = currentYear - this.birthYear;
        return age;
    }

    public String printAllData(){
        return "\"" + this.name + "\"" + ", born on " + this.birthYear + ", age " + calcAge(this.currentYear) + ", goes to class " + this.classe;
    }
}