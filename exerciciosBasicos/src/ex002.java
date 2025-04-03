import java.util.Locale;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) throws Exception {
        float raio = 0f; 
        float area = 0f; 

        Scanner sc = new Scanner (System.in);
        System.out.println("Informe o valor do raio do círculo, please");
        raio = sc.nextFloat();

        area = (float) (Math.PI * Math.pow(raio, 2));
        Locale.setDefault(Locale.US);
        System.out.printf("A = %.2f%n", area);

        sc.close();
    }
}