
import java.util.Scanner;

public class olamundo 
{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("digite nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("digite nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("digite nota 3: ");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Olá, " + nome + "! Sua média é: " + media);
        if (media >= 7) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Infelizmente, você foi reprovado.");
        }
        






    }

}