package calculadora;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        char operador;
        float operandoUm, operandoDois, resultado = 0;
        boolean isOperadorValido = true;
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
            case '+': System.out.println(calculadora.somar(operandoUm, operandoDois)); break;
            case '-': System.out.println(calculadora.subtrair(operandoUm, operandoDois)); break;
            case '*': System.out.println(calculadora.multiplicar(operandoUm, operandoDois)); break;
            case '/': System.out.println(calculadora.dividir(operandoUm, operandoDois)); break;
            default: System.out.println("Operador inválido!");
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
                    case '+': System.out.println(calculadora.somar(operandoUm, operandoDois)); break;
                    case '-': System.out.println(calculadora.subtrair(operandoUm, operandoDois)); break;
                    case '*': System.out.println(calculadora.multiplicar(operandoUm, operandoDois)); break;
                    case '/': System.out.println(calculadora.dividir(operandoUm, operandoDois)); break;
                    default: System.out.println("Operador inválido!");
                }
            }
        } while (isExecutando);
    }
}