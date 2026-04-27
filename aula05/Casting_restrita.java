package aula05;

public class Casting_restrita {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; //Vc precisa coloca o int entre () pq o tipo double é maior que o int, por isso nos diminuimos ele(restrita)

    System.out.println(myDouble);
    System.out.println(myInt);
  }
}
