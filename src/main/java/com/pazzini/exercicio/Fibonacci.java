package com.pazzini.exercicio;

public class Fibonacci {
    
    /**
     * Imprime o valor da posição na sequência Fibonacci.
     *
     * @param n A posição desejada na sequência Fibonacci.
     */
    private static void imprimeFibonacci(int n) {
        System.out.printf("A posição %d na sequência Fibonacci é %d", n, fibonacci(n));
    }

    /**
     * Calcula o valor na posição n da sequência Fibonacci.
     *
     * @param n A posição desejada na sequência Fibonacci.
     * @return O valor na posição n da sequência Fibonacci.
     */
    public static int fibonacci(int n) {
        Integer n1 = valido(n);
        if (n1 != null) return n1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Verifica se o número é válido para a sequência Fibonacci.
     *
     * @param n O número a ser verificado.
     * @return O próprio número se for 0 ou 1, ou null se for negativo.
     * @throws IllegalArgumentException Se o número for negativo.
     */
    private static Integer valido(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 0.");
        } else if (n <= 1) {
            return n;
        }
        return null;
    }

    /**
     * Método principal que imprime o valor na posição negativa da sequência Fibonacci.
     *
     * @param args Argumentos de linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        int n = -1;
        imprimeFibonacci(n);
    }
}
