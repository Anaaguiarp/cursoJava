import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) throws Exception {
        int A, B, C, D;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe o valor de A: ");
        A = sc.nextInt();
        System.out.println("Informe o valor de B: ");
        B = sc.nextInt();
        System.out.println("Informe o valor de C: ");
        C = sc.nextInt();
        System.out.println("Informe o valor de D: ");
        D = sc.nextInt();

        System.out.println("DIFERENÇA: " + (A * B - C * D));

        sc.close();
    }
}