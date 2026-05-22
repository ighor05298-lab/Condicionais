package exemplosCondicionais;
import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;
public class testeBoleano {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            boolean verificador;
            int num;
            System.out.println("Digite sua idade:");
            num = teclado.nextInt();


            if (num >= 18)  {
                System.out.println("Sua idade é maior que 18 anos e pode dirigir!");
                verificador = true;
            }
            else{
                System.out.println("Menor de idade e não pode dirigir");
                verificador = false;
            }
            System.out.println(verificador);
        }

    }

