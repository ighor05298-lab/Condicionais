package exercícios_condicionais;

import java.util.Scanner;

public class ex1_numerosIguais {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Números iguais:"+ numero1+" e "+numero2);
        }
        else{
            System.out.println("Números diferentes:"+numero1 +" e "+ numero2);
        }
    }
}
