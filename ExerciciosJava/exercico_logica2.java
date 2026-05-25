package ExerciciosJava;

import java.util.Scanner;

public class exercico_logica2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        String name = input.nextLine();

        System.err.println("Qual o seu sexo(m/f): ");
        String sexo = input.nextLine();

        System.err.println("Tempo de casa: ");
        int tempoServico = input.nextInt();

        System.out.println("Qual seu salario: ");
        double salario = input.nextDouble();

        if (sexo.equals("m") && tempoServico >= 15) {
            double bonus = salario * 0.2;
            bonus += salario;
            System.out.printf("Seu salario será de: %.2f", bonus);
        }
    }
}
