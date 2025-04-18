import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.prinf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefult(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
