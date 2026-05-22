package exercícios_condicionais;

import java.util.Scanner;

public class ex6_codigoProdutos_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código do seu produto(1001,1324,6548,987,7623): ");
        int codProduto = sc.nextInt();
        System.out.print("Digite a quatidade de produtos comprados: ");
        int qtd = sc.nextInt();
        float totalProduto = 0;

        switch (codProduto) {
            case 1001:
                totalProduto = (float) (5.32 * qtd);
                break;
            case 1324:
                totalProduto = (float) (6.45 * qtd);
                break;
            case 6548:
                 totalProduto = (float) (2.37 * qtd);
                break;
            case 987:
                 totalProduto = (float) (5.32 * qtd);
                break;
            case 7623:
                totalProduto = (float) (6.45 * qtd);
                break;
            default:
                System.out.println("Produto invalido");
                break;
        }
        System.out.println("Total a pagar: R$"+totalProduto);
    }
}
