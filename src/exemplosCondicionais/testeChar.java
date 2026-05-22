package exemplosCondicionais;
import java.util.Scanner;

public class testeChar {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            char num;
            System.out.println("Digite uma letra:");
            num = teclado.next().charAt(4);
            System.out.println(num);

            
        }

    }

