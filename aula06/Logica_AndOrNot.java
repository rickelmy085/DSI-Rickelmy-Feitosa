package aula06;

import java.util.Scanner;

public class Logica_AndOrNot {
    public static void main(String[] args) {
        //Espere que fique feliz professor, vc vai ficar muito feliz com essa sequência de aura
        //Eu vi como que fazia o input no java no proprio W3School 

        Scanner nomeAura = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa mais aura");
        String nomeString = nomeAura.nextLine();

        Scanner number = new Scanner(System.in);
        System.out.println("Número aura: ");
        int newNumber = number.nextInt();

        if (nomeString.equals("Rodrigo") && newNumber == 67) {
            System.out.println("Esse cara ama muito a linha azul e tem muita aura 67!");
        } else if (nomeString.equals("Rickelmy") && newNumber == 67) {
            System.out.println("A pessoa que mais tem aura da face da terra!!!");
        } else if (nomeString.equals("") || newNumber == 67) {
            System.out.println("Ele(a) "+ nomeString + " não tem muita aura, mas 67!!");
        } else {
            System.out.println("Conseguiu errar o nome e o número, apenas seja moggado");
        }
    }
}
