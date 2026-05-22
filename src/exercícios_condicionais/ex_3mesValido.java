package exercícios_condicionais;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class ex_3mesValido {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do mês do ano: ");
        int mes = sc.nextInt();

        switch (mes){
            case 1: System.out.println(mes+" Mês de Janeiro"); break;
            case 2: System.out.println(mes+" Mês de Fevereiro"); break;
            case 3: System.out.println(mes+" Mês de Março"); break;
            case 4: System.out.println(mes+" Mês de Abril"); break;
            case 5: System.out.println(mes+" Mês de Maio"); break;
            case 6: System.out.println(mes+" Mês de Junho"); break;
            case 7: System.out.println(mes+" Mês de Julho"); break;
            case 8: System.out.println(mes+" Mês de Agosto"); break;
            case 9: System.out.println(mes+" Mês de Setembro"); break;
            case 10: System.out.println(mes+" Mês de Outubro"); break;
            case 11: System.out.println(mes+" Mês de Novembro"); break;
            case 12: System.out.println(mes+" Mês de Novembro"); break;
            default: System.out.println(mes+" Mês invalido"); break;
        }

    }
}
