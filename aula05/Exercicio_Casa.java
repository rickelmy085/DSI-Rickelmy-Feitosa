package aula05;

public class Exercicio_Casa {
    public static void main(String[] args) {
        //Colocaremos todos os numeros em binários do lado para entender 
        int operadorAnd = 6; // 110
        int operadorOr = 6; // 110
        int operadorXOR = 6; // 110
        int operadorRight = 24; // 11000
        int operadorLeft = 5; // 101

        //Para entender melhor a explicação atribuiremos 1 sendo true e 0 sendo false, na minha cabeça faz mais sentido🤓

        System.err.println(operadorAnd &= 3);// A regra do AND é que APENAS SE OS DOIS VALORES forem TRUE(1) ele saira TRUE(1)
        // O que ele faz é comparar os 2 números em bit
        //1 | 1| 0 (Número 6)| Podemos ver que so saira 1(True) se os dois números comparados sejam 1
        //0 | 1| 1 (Número 3)|
        //0 | 1| 0 RESULTADO | O resultado é o número 2 em binário
        // Saída será 2, que em binário é 010

        System.err.println(operadorOr |=3);// A regra de OR é que APENAS UM VALOR seja TRUE(1) para sair true(1)
        //1 | 1| 0 (Número 6)| Aqui vemos que apenas 1 precisa ser true(1) para sair true(1)
        //0 | 1| 1 (Número 3)|
        //1 | 1| 1 RESULTADO | O resultado é 7 em binário
        // Saída será 7, que em binário é 111

        System.err.println(operadorXOR ^= 3);// A regra de XOR(^=) aqui ele inverte, apenas será true SE APENAS OS VALORES FOREM DIFERENTES
        //1 | 1| 0 (Número 6)| Aqui vimos que só saiu true(1) quando os dois eram true(1) e false(0)
        //0 | 1| 1 (Número 3)|
        //1 | 0| 1 RESULTADO | O resultado é 5 em binário
        // Saída será de 5, que me binário é 5 

        System.err.println(operadorRight >>= 3);// A regra do deslocamento à direita é que ele movera para a direita 3 casas a direita
        // Ele movera para a direita pois colocamos depois do >>= colocamos como o número que decide quantas casas vai para a direita o 3
        // 11000 -> (1.º casa)01100 -> (2.º casa)00110 -> (3.º casa) 00011 
        // 00011 é 3
        // De forma mais fácil, seria nos dividimos nosso número pela potência de 2 sobre o número que escolhemos(2x2x2 = 8| 24/8=3)
        
        System.err.println(operadorLeft <<= 3);// A regra para esquerda seque a logica inversa do de direita
        // 101 -> (1.º casa)1010 -> (2.º casa)10100 -> (3.º casa)10100
        // 101000 é 40 
        // De forma mais fácil, seria nos multiplicamos nosso número pela potência de 2 sobre o número que escolhemos(2x2x2 = 8| 5x8=40)

    }

}