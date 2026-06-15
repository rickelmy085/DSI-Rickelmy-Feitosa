package ExerciciosJava;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tamanho do lado A");
        double a = input.nextDouble();

        System.out.println("Qual o tamanho do lado B");
        double b = input.nextDouble();

        System.out.println("Qual o tamanho do lado C");
        double c = input.nextDouble();
        
        double[] ordenDecrescente = {a, b, c};

        Arrays.sort(ordenDecrescente);

        for (int i = 0; i < ordenDecrescente.length / 2; i++) {
            double temp = ordenDecrescente[i];
            ordenDecrescente[i] = ordenDecrescente[ordenDecrescente.length - 1 - i];
            ordenDecrescente[ordenDecrescente.length - 1 - i] = temp;
        }

        System.out.println("A orden decrescente é: "+ Arrays.toString(ordenDecrescente));
        
        if (a > b + c) {
            System.out.println("Não formam triângulo algum");
        }
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("Formam um triângulo retângulo");
        }
        if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("Formam um triângulo obtusângulo.");
        }
        if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("Formam um triângulo acutângulo.");
        }

        if (a == b && b == c) {
            System.out.println("Formam um triângulo equilátero");
        } 
        if (a == b || b == c || a == c) {
            System.out.println("Formam um triângulo isósceles");
        }
    }
}
