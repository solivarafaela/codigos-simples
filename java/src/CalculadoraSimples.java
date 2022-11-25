import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        float operandoUm, operandoDois, resultado = 0;
        char operador;
        boolean isOperadorValido = true;
        boolean isExecutandoValido = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        operandoUm = scanner.nextFloat();
        System.out.println("Insira o operador (+ - * /): ");
        operador = scanner.next().charAt(0);
        System.out.println("Insira o segundo número:");
        operandoDois = scanner.nextFloat();

        switch (operador) {
            case '+' -> resultado = operandoUm + operandoDois;
            case '-' -> resultado = operandoUm - operandoDois;
            case '*' -> resultado = operandoUm * operandoDois;
            case '/' -> resultado = operandoUm / operandoDois;
            default -> isOperadorValido = false;
        }

        if (isOperadorValido) {
            System.out.println(resultado);
        }

        do {
            System.out.println("Insira o primeiro número (01 para interromper):");
            operandoUm = scanner.nextFloat();


            if (operandoUm == 01) {
                isExecutandoValido = false;
            } else {
                System.out.println("Insira o operador (+ - * /): ");
                operador = scanner.next().charAt(0);
                System.out.println("Insira o segundo número:");
                operandoDois = scanner.nextFloat();

                switch (operador) {
                    case '+' -> resultado = operandoUm + operandoDois;
                    case '-' -> resultado = operandoUm - operandoDois;
                    case '*' -> resultado = operandoUm * operandoDois;
                    case '/' -> resultado = operandoUm / operandoDois;
                    default -> isOperadorValido = false;
                }

                if (isOperadorValido) {
                    System.out.println(resultado);
                }
            }
        } while (isExecutandoValido);
    }
}