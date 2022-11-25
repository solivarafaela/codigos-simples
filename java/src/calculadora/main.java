import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        char operador;
        float operandoUm, operandoDois, resultado = 0;
        int numeroFuncao;
        boolean isOperadorValido = true;
        boolean isExecutandoPrincipal = true;
        boolean isExecutandoSecundario = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma função:");
        System.out.println("1 - Calculadora Simples");
        System.out.println("2 - Raiz quadrada:");
        System.out.println("3 - Tabuada");

        numeroFuncao = scanner.nextInt();
    }
}