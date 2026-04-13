package aula04;

public class ExemploVariaveis {
    public static void main(String[] args) {
    int items = 67;
    int itemsBeans = 37;
    float priceItems = 19.99f;
    double priceItemsBeans = 29.99d;

    float totalCost = items * priceItems;
    double totalCostBeans = itemsBeans * priceItemsBeans;
    double totalCostAll = totalCost + totalCostBeans;
    char symbol = '$';

    System.out.println("Numeros de itens em estoque : " + items);
    System.out.println("Preço por item : " + priceItems + symbol);
    System.out.println("Custo total de feijao = " + totalCostBeans + symbol);
    System.out.println("Custo total de itens = " + totalCost + symbol);
    System.out.println("Custo total de TUDO = " + totalCostAll + symbol);
    }
}
