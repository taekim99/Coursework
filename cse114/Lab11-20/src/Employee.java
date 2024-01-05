public class Employee extends Person {
    private int salary;
    private MyDate dateHired;
    public Employee() {
    }
    public Employee(String name, String address, String phoneNumber, int age, String emailAddress, int salary, int year, int month, int day) {
        super(name, address, phoneNumber, age, emailAddress);
        this.salary = salary;
        dateHired = new MyDate(year, month, day);
    }
    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsalary: " + salary + ", date hired: "
                + getDateHired().getYear() + "/" + getDateHired().getMonth() + "/" + getDateHired().getDay();
    }
}
// MyDate - in the main method! try!