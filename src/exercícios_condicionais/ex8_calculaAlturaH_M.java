package exercícios_condicionais;

import java.util.Scanner;

public class ex8_calculaAlturaH_M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite H para Homens e M para Mulheres: ");
        char sex = sc.next().toUpperCase().charAt(0);
        System.out.print("Digite sua altura em M: ");
        float altura = sc.nextFloat();

        if (sex =='H') {
           float pesoIdeal = (float) (72.7*altura)-58;
            System.out.println("Masculino, seu peso ideal é:"+pesoIdeal+"Kg");
        } else if (sex =='M') {
            float pesoIdeal =  (float)(62.1*altura-44.7);
            System.out.println("Feminino, seu peso ideal é:" +pesoIdeal+"Kg");
        } else {
            System.out.println("Digito invalido"+sex);
        }
    }
}
