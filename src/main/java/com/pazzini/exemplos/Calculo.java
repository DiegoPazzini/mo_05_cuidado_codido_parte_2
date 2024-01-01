package com.pazzini.exemplos;

public class Calculo {

    // Método para calcular o Máximo Divisor Comum (MDC) utilizando o algoritmo de Euclides
    public int calcularMDC(int n1, int n2) {
        // Caso base: Se n2 é zero, o MDC é n1
        if (n2 == 0) {
            return n1;
        } else {
            // Chamada recursiva para o próximo passo do algoritmo de Euclides
            return calcularMDC(n2, n1 % n2);
        }
    }

    // Método simples para somar dois números
    public int somarNumeros(int a, int b) {
        return a + b;
    }
}
