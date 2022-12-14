import java.time.LocalDate;
import java.time.Month;

public class User {
    private String name;
    private LocalDate dob;

    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }
    public User(String _name, int _year, int _month, int _day){
        this.name = _name;
        this.dob = LocalDate.of(_year,_month,_day);
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getDob() {
        return this.dob;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void doSomething(){
        System.out.println("Hello "+this.name+" who was born on "+this.dob+"!");
    }
}
