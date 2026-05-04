package aula06;

import java.util.Scanner;

public class Logica_AndOrNot {
    public static void main(String[] args) {
        Scanner nomeAura = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa mais aura");

        Scanner number = new Scanner(System.in);
        System.out.println("Número aura: ");
        int newNumber = number.nextInt();

        if (nomeAura == "Rodrigo" && newNumber == 67) {
            System.out.println("Esse cara ama muito azul e tem aura boa");
        }

        
    
    }
}
