import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Insira o valor inicial e o final");
            int inicio;
            while (true) {
                try {
                    inicio = sc.nextInt();
                    break; // Sai do loop se um número inteiro for lido
                } catch (InputMismatchException e) {
                    sc.next(); // Descarte a entrada inválida
                    System.out.println("Digite apenas números inteiros. Tente novamente:");
                }
            }

            int fim;
            while (true) {
                try {
                    fim = sc.nextInt();
                    break; // Sai do loop se um número inteiro for lido
                } catch (InputMismatchException e) {
                    sc.next(); // Descarte a entrada inválida
                    System.out.println("Digite apenas números inteiros. Tente novamente:");
                }
            }

            Contador.contar(inicio, fim);

        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());;
        }
        finally {
            sc.close();
        }
    }
}