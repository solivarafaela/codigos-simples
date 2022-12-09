package calculadora;

public class Calculadora {

    public float somar (float operandoUm, float operandoDois) {
        return operandoUm + operandoDois;
    }

    public float subtrair (float operandoUm, float operandoDois) {
        return operandoUm - operandoDois;
    }

    public float multiplicar (float operandoUm, float operandoDois) {
        return operandoUm * operandoDois;
    }

    public float dividir (float operandoUm, float operandoDois) {
        return operandoUm / operandoDois;
    }

    public void retornarTabuada (float operandoUm, float operandoDois) {
        for (int i = 0; i <= operandoDois; i++) {
            System.out.println(operandoUm + " x " + i + " = " + (operandoUm * i));
        }
    }
}