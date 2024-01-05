public class Staff extends Employee {
    private String title;
    public Staff() {
    }
    public Staff(String name, String address, String phoneNumber, int age, String emailAddress, int salary, int year, int month, int day, String title) {
        super(name, address, phoneNumber, age, emailAddress, salary, year, month, day);
        this.title = title;
    }
    public String toString() {
        return super.toString() + "\ntitle: " + title;
    }
}