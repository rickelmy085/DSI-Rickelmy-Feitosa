package aula07;

public class ForArray {
    public static void main(String[] args) {
        //Temos que criar um array antes
        String[] studentNames = {"Rickelmy", "Louie", "Rafael Ramos", "Matheus", "Pedro Henrique", "Ariella"};

        for(String names : studentNames) {
            System.out.println(names);
        }
        //Ele vai pegar o elemento do indice 0("Rickelmy")
        System.out.println("\n"+ studentNames[0]);
    }
}