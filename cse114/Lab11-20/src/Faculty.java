import java.time.Year;
public class Faculty extends Employee {
    private String officeHours;
    private int rank;
    public Faculty() {
    }
    public Faculty(String name, String address, String phoneNumber, int age, String emailAddress, int salary, int year, int month, int day, String officeHours, int rank) {
        super(name, address, phoneNumber, age, emailAddress, salary, year, month, day);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public int salaryRange() {
        if (rank * (Year.now().getValue() - this.getDateHired().getYear()) < 10)
            return 1;
        else if (rank * (Year.now().getValue() - this.getDateHired().getYear()) < 20)
            return 2;
        else if (20 <= rank * (Year.now().getValue() - this.getDateHired().getYear()))
            return 3;
        else
            return 0;
    }
    @Override
    public String toString() {
        return super.toString() + "\noffice hours: " + officeHours + ", rank: " + rank;
    }
}