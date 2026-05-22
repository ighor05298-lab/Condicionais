package exercícios_condicionais;

import java.util.Scanner;

public class ex4_diaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do dia da semana: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Dia " + dia + " Domingo");
                break;
            case 2:
                System.out.println("Dia " + dia + " Segunda-feira");
                break;
            case 3:
                System.out.println("Dia " + dia + " Terça-feira");
                break;
            case 4:
                System.out.println("Dia" + dia + " Quarta-feira");
                break;
            case 5:
                System.out.println("Dia " + dia + " Quinta-feira");
                break;
            case 6:
                System.out.println("Dia " + dia + " Sexta-feira");
                break;
            case 7:
                System.out.println("Dia " + dia + " Sábado");
                break;

            default:
                System.out.println("Dia " + dia + " Dia invalido");
                break;
        }
    }
}
