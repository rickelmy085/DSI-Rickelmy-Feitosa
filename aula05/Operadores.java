package aula05;

public class Operadores {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);
        System.err.println(n1&=5);

        int n3 = 5;
        int resultado = ++n3 + --n3; // Seria ser (5+1)+(5-1)

        System.err.println(resultado);
        System.err.println(++n3); //Ele incrementa +1 no n3
        System.err.println(--n3); //ELe decrementa 1 do n3(Que é 6 agora), então fica 5
    }
}
