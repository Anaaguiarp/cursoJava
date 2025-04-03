import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) throws Exception {
        int numFuncionario;
        int horasTrabalhadas;
        float valorHora = 0f;
        float salarioFuncionario = 0f;

        Scanner sc = new Scanner (System.in);
        System.out.println("Informe o número do funcionário ");
        numFuncionario = sc.nextInt();
        System.out.println("Informe o número de horas trabalhadas do funcionário ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Informe quanto esse funcionário recebe por hora trabalhada ");
        valorHora = sc.nextFloat();

        salarioFuncionario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f %n", salarioFuncionario);

        sc.close();
    }
}