// Tae Kim, CSE 114, Section1, Lab16_1, April 3, 2023
public class TestStock {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", "Google Inc");
        google.setPreviousClosingPrice(1000);
        google.setCurrentPrice(2000);
        double percent = google.changePercent();
        System.out.println("Change of percent, Google: " + percent);

        Stock facebook = new Stock();
        facebook.setPreviousClosingPrice(207.74);
        facebook.setCurrentPrice(208.08);
        System.out.println("Change of percent, facebook: " + facebook.changePercent());

        Stock amazon = new Stock();
        amazon.setPreviousClosingPrice(102.18);
        amazon.setCurrentPrice(102.26);
        System.out.println("Change of percent, amazon: " + amazon.changePercent());
    }
}
