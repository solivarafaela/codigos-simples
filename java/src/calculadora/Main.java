package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroFuncao;
        boolean isExecutandoFuncaoPrincipal = true;
        boolean isExecutandoFuncaoUm = true;
        char operador;
        float operandoUm, operandoDois = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEscolha uma função:");
        System.out.println("1 - Calculadora simples (+ - * / ¬)");
        System.out.println("2 - Exibição de tabuada");
        numeroFuncao = scanner.nextInt();

        do {
            switch (numeroFuncao) {
                case 1: {
                    Calculadora calculadora = new Calculadora();

                    System.out.println("Insira o primeiro número:");
                    operandoUm = scanner.nextFloat();
                    System.out.println("Insira o operador (+ | - | * | / | r - (radiciacão):");
                    operador = scanner.next().charAt(0);

                    if (operador != 'r') {
                        System.out.println("Insira o segundo número:");
                        operandoDois = scanner.nextFloat();
                    }

                    switch (operador) {
                        case '+' -> System.out.println(calculadora.somar(operandoUm, operandoDois));
                        case '-' -> System.out.println(calculadora.subtrair(operandoUm, operandoDois));
                        case '*' -> System.out.println(calculadora.multiplicar(operandoUm, operandoDois));
                        case '/' -> System.out.println(calculadora.dividir(operandoUm, operandoDois));
                        case 'r' -> System.out.println(Math.sqrt(operandoUm));
                        default -> System.out.println("Operador inválido!");
                    }

                    do {
                        System.out.println("Insira o primeiro número (01 para interromper):");
                        operandoUm = scanner.nextFloat();

                        if (operandoUm == 01) {
                            System.out.println("\nCalculadora encerrada!");
                            isExecutandoFuncaoUm = false;
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
                    } while (isExecutandoFuncaoUm);
                }

                // inserção de mais funções a partir daqui
            }

            System.out.println("\nEscolha uma função (0 para interromper):");
            System.out.println("1 - Calculadora simples (+ - * / ¬)");
            System.out.println("2 - Exibição de tabuada");
            numeroFuncao = scanner.nextInt();

            if (numeroFuncao == 0) {
                System.out.println("\nAplicação encerrada!");
                isExecutandoFuncaoPrincipal = false;
            }

        } while (isExecutandoFuncaoPrincipal);
    }
}