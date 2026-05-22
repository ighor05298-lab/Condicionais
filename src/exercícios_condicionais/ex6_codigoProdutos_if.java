package exercícios_condicionais;

import java.util.Scanner;

public class ex6_codigoProdutos_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o código do seu produto(1001,1324,6548,987,7623):");
        float codProduto = sc.nextFloat();

        System.out.print("Digite a quantidade de produtos comprados ");
        int qtd = sc.nextInt();


        if (codProduto==1001) {
            float totalProduto = (float)(5.32*qtd);
            System.out.println("Total a pagar: R$"+totalProduto);
        } else if (codProduto==1324) {
            float totalProduto = (float)(6.45*qtd);
            System.out.println("Total a pagar: R$"+totalProduto);
        }
        else if (codProduto==6548) {
            float totalProduto = (float)(2.37*qtd);
            System.out.println("Total a pagar: R$"+totalProduto);
        }
        else if (codProduto==987) {
            float totalProduto = (float)(5.32*qtd);
            System.out.println("Total a pagar: R$"+totalProduto);
        } else if (codProduto==7623) {
            float totalProduto = (float)(6.45*qtd);
            System.out.println("Total a pagar: R$"+totalProduto);
        }
        else{
            System.out.println("Código de produto invalido:"+codProduto);
        }

    }
    }
