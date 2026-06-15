package ExerciciosJava;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Exercício 1
        Scanner input = new Scanner(System.in); 

        System.out.println("Nome do funcionario: ");
        String name = input.nextLine();

        System.out.println("Número de horas trabalhadas: ");
        double horas = input.nextDouble();

        System.out.println("valor que recebe por hora: ");
        double horaPreco = input.nextDouble();

        System.out.println("Qual a sua idade");
        int idade = input.nextInt();

        System.out.println("Seu tempo de serviço: ");
        int tempoServico = input.nextInt();

        input.nextLine(); 

        System.out.println("Você tem filhos que tem menos de 14 anos(y/n)? ");
        String children = input.nextLine();

        //Saber se tem filhos
        if (children.equals("y")) {
            System.out.println("Quantos vc tem?");
            int childrenMenor = input.nextInt();
            System.out.println("Você tem: "+ childrenMenor);
        } else {
            System.out.println("Obrigado!");
        }

        double salarioDia = horas * horaPreco;
        System.out.println("\nO sálario da família é(Ao dia): "+ salarioDia);

        double salarioBruto = (salarioDia * 20)/0.085;
        
        System.out.printf("Seu salário Bruto já com o INPS: R$ %.2f\n", salarioBruto);

        //Calcular o IR
        double SalarioIR = 0;
        if (salarioBruto > 1500) {
            double descontado = salarioBruto * 0.15;
            SalarioIR = salarioBruto - descontado;
            System.out.printf("Seu sálario "+ name +", com o IR será de: %.2f\n", SalarioIR);
        } else if (salarioBruto < 500 && salarioBruto < 1500) {
            double descontado = salarioBruto * 0.08;
            SalarioIR = salarioBruto - descontado;
            System.out.println("Seu sálario"+ name +", será de: "+ SalarioIR+ "\n");
        } else {
            SalarioIR = salarioBruto;
            System.out.println("Seu salario continua normal, sem o IR descontado");
        }   
        System.out.printf("Valor final guardado do IR: R$ %.2f\n", SalarioIR);

        //Calcular o adicional
        double adicionalSalarioIdade = 0;
        double adicionalSalarioTempo = 0;
        if (idade > 40 && tempoServico > 15) {
            double adicionalIdade = salarioBruto * 0.02;
            double adicionalTempo = salarioBruto * 0.035;
            adicionalSalarioIdade = salarioBruto + adicionalIdade;
            adicionalSalarioTempo = salarioBruto + adicionalTempo;
        } if (idade > 40) {
            double adicional = salarioBruto * 0.02;
            adicionalSalarioIdade = salarioBruto + adicional;
            System.err.printf("Seu salario com o adicional é de: %.2f\n", adicionalSalarioIdade);
        } if (tempoServico > 15) {
            double adicional = salarioBruto * 0.035;
            adicionalSalarioTempo = salarioBruto + adicional;
            System.out.printf("Seu sálario com o adicional é de: %.2f\n", adicionalSalarioTempo);
        } if (tempoServico <= 15 && tempoServico > 5 && idade > 30) {
            double adicionalTempo = salarioBruto * 0.015;
            adicionalTempo += salarioBruto;
            System.err.printf("O adicional com o tempo entre 5 e 15 e idade maior que 30 é de: %.2f\n",adicionalTempo);

        }
        System.out.printf("Seu salario com o adicional de idade: %.2f\n", adicionalSalarioIdade);
        System.out.printf("Seu salario com o adicional de tempo de serviço: %.2f\n", adicionalSalarioTempo);

        System.out.println(" ");  
    }
}