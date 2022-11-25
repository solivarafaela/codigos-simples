package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char operador;
        float operandoUm, operandoDois;
        boolean isExecutando = true;

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Insira o primeiro número:");
        operandoUm = scanner.nextFloat();
        System.out.println("Insira o operador (+ - * /): ");
        operador = scanner.next().charAt(0);
        System.out.println("Insira o segundo número:");
        operandoDois = scanner.nextFloat();

        switch (operador) {
            case '+' -> System.out.println(calculadora.somar(operandoUm, operandoDois));
            case '-' -> System.out.println(calculadora.subtrair(operandoUm, operandoDois));
            case '*' -> System.out.println(calculadora.multiplicar(operandoUm, operandoDois));
            case '/' -> System.out.println(calculadora.dividir(operandoUm, operandoDois));
            default -> System.out.println("Operador inválido!");
        }

        do {
            System.out.println("Insira o primeiro número (01 para interromper):");
            operandoUm = scanner.nextFloat();

            if (operandoUm == 01) {
                System.out.println("\nPrograma encerrado!");
                isExecutando = false;
            } else {
                System.out.println("Insira o operador (+ - * /): ");
                operador = scanner.next().charAt(0);
                System.out.println("Insira o segundo número:");
                operandoDois = scanner.nextFloat();

                switch (operador) {
                    case '+' -> System.out.println(calculadora.somar(operandoUm, operandoDois));
                    case '-' -> System.out.println(calculadora.subtrair(operandoUm, operandoDois));
                    case '*' -> System.out.println(calculadora.multiplicar(operandoUm, operandoDois));
                    case '/' -> System.out.println(calculadora.dividir(operandoUm, operandoDois));
                    default -> System.out.println("Operador inválido!");
                }
            }
        } while (isExecutando);
    }
}