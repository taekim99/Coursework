public class Student extends Person {
    private static String classStatus;
    public Student() {
    }
    public Student(String name, String address, String phoneNumber, int age, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, age, emailAddress);
        this.classStatus = classStatus;
    }
    @Override
    public String toString() {
        return super.toString() + "\nclass status: " + classStatus;
    }
}
