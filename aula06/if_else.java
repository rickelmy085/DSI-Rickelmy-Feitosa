package aula06;

import java.util.Scanner; //Pesquisei no Google e acabei caindo no W3School, a pessoa tem que importa que nem no Golang

public class if_else {
    public static void main(String[] args) {
    //Agora teremos que explicar o if, if else e o else
    //E vou usar o exemplo mais classico, ver se o numero é impar ou par

        Scanner myNumber = new Scanner(System.in);
        System.out.println("Digite seu numeros: ");
        int My_number = myNumber.nextInt();

        if (My_number % 2 == 0) {
            System.out.println("Seu número é par");
        } else {
            System.out.println("Seu número é impar");
        }
    
    }
}