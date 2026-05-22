package exercícios_condicionais;
import java.util.Scanner;
public class notasFrequencia {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a nota 1 ");
    float nota1 = sc.nextFloat();

    System.out.print("Digite a nota 2 ");
    float nota2 = sc.nextFloat();

    System.out.print("Digite a quantidade de aulas ministradas: ");
    float aulasMinistradas = sc.nextFloat();

    System.out.print("Digite a quantidade de aulas assistidas: ");
    float aulasAssist = sc.nextFloat();

    double notaFinal = (nota1+nota2)/2;
    float frequencia = (aulasAssist/aulasMinistradas)*100;
        if (notaFinal>6 && frequencia>=75) {
        System.out.println("Aprovado! Sua Nota:"+ notaFinal +" Frequencia: "+ frequencia+"%");
    }
        else{
        System.out.println("Reprovado! Sua Nota:"+ notaFinal +" Frequencia: "+ frequencia+"%");
        }
    }
}





