package DevDojo.Iniciando;



/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <>. na data <data>.

*/
import java.util.Scanner;
import java.time.LocalDate;
public class Aula03TiposPrimitivosEx {
    public static void main(String[] args) {

        String myName;
        String address;
        float salary;
        LocalDate dateNow = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?\n");
        myName = scanner.nextLine();
        System.out.print("What is your address?\n");
        address = scanner.nextLine();
        System.out.print("Insert you salary\n");
        salary = Float.parseFloat(scanner.nextLine());
        //System.out.println("");
        System.out.println("I, " + myName + " living in the address: " + address +  ", confirm that I've received the salary of: R$" + salary + " on " + dateNow);


    }

}
