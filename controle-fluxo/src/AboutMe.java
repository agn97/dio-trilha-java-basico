import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
   
   public static void main(String[] args) {

    try{
         // criando o objeto Scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome");
    String nome = scanner.nextLine();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.nextLine();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura");
    Double altura = scanner.nextDouble();

    System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome );
    System.out.println("Tenho " + idade + " Anos.");
    System.out.println("Minha altura é " + altura + " cm");
    scanner.close();
    } 
    catch (InputMismatchException e){
        System.out.println("os campos idade e altura precisam ser numericos");
    }



}

   
}
