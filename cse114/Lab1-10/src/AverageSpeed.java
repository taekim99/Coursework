public class AverageSpeed {
    public static void main(String[] args) {
        double distanceRun = 24.0;
        double hoursTaken = 1.0;
        double minutesTaken = 40.0;
        double secondsTaken = 35.0;
        double timeHours = hoursTaken + minutesTaken/60.0 + secondsTaken/(60.0*60.0);
        double averageSpeed;
        averageSpeed = (distanceRun * 1.6)/timeHours;
        System.out.println("Average speed: " + averageSpeed);
    }
}
//jan 30, 2023