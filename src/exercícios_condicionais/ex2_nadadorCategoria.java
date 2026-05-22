package exercícios_condicionais;

import java.util.Scanner;

public class ex2_nadadorCategoria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite a idade do nadador: ");
        int idade = sc.nextInt();

        if (idade>=5 && idade<=7) {
            System.out.println("Nadador categoria infantil A: "+ idade +" anos ");
        }
        else if(idade>=8 && idade<=10){
            System.out.println("Nadador categoria infantil B: "+idade+" anos");
        }
        else if(idade>=11 && idade<=13){
            System.out.println("Nadador categoria Juvenil A: "+idade+" anos");
        }
        else if(idade>=14 && idade<=17){
            System.out.println("Nadador categoria Juvenil B: "+idade+" anos");
        }
        else if(idade>=18){
            System.out.println("Nadador Sênior: "+idade+" anos");
        }
        else{
            System.out.println("Nenhuma categoria: "+idade+" anos");
        }

    }
}
