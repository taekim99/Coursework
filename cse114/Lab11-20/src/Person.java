// Tae Kim, CSE 114, Section1, Lab17, April 5, 2023
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private int age;
    private String emailAddress;
    public Person() {
    }
    public Person(String name, String address, String phoneNumber, int age, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.emailAddress = emailAddress;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return "name: " + name + ", address: " + address + ", phone number: " + phoneNumber
                + ", age: " + age + ", email address: " + emailAddress;
    }
}