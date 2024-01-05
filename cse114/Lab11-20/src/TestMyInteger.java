// Tae Kim, CSE 114, Section1, Lab18_2_1, April 10, 2023
public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger object = new MyInteger(3);
        MyInteger n = new MyInteger(3);
        System.out.println("even " + object.isEven());
        System.out.println("odd " + object.isOdd());
        System.out.println("prime " + object.isPrime());

        System.out.println("\nodd " + MyInteger.isOdd(object));
        System.out.println("even " + MyInteger.isEven(object));
        System.out.println("prime " + MyInteger.isPrime(object));

        System.out.println("\nequals " + object.equals(3));
        System.out.println("equals static" + object.equals(n));
    }
}
