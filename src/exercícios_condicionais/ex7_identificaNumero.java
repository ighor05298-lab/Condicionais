package exercícios_condicionais;

import java.util.Scanner;

public class ex7_identificaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número ");
        float num = sc.nextFloat();
            if (num == 0) {
                System.out.println("Número é zero");
            } else if (num % 2 == 0) {
                System.out.println("Número é par: " + num);
            } else {
                System.out.println("Número é ímpar: " + num);
            }

            if (num > 0) {
                System.out.println("Número é positivo");
            } else if (num < 0) {
                System.out.println("Número é negativo");
            }
        }
    }
