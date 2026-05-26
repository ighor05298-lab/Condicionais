package exercícios_condicionais;

import java.util.Scanner;

public class ex9_encontraNumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite um número X: ");
        float numero1 = sc.nextFloat();

        System.out.print("Digite outro número Y: ");
        float numero2 = sc.nextFloat();

        System.out.print("Digite outro número Z: ");
        float numero3 = sc.nextFloat();

        if (numero1<=numero2 && numero1<=numero3) {
            System.out.println("Numero X é menor ou igual "+ numero1 + "\n Numero Y: " + numero2 + "\n Numero Z: " + numero3);
        }
        else if (numero2<=numero1 && numero2<=numero3) {
            System.out.println("Numero Y é menor ou igual "+ numero2 + "\n Numero X: " + numero1 + "\n Numero Z: " + numero3);
        }
        else if (numero3<=numero1 && numero3<=numero2){
            System.out.println("Numero Z é menor ou igual: "+numero3 +"\nNumero Y: "+ numero2 + "\n Numero X: " + numero1);
        }
        else{
            System.out.println("Numeros iguais"+numero1+"/n"+ numero2+"/n"+numero3);
        }
    }
}
