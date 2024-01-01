package com.pazzini.exercicios;

import com.pazzini.exercicio.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A classe FibonacciTest contém testes para o método estático Fibonacci.fibonacci.
 */
class FibonacciTest {

    /**
     * Testa o método Fibonacci.fibonacci com um valor válido (6).
     */
    @Test
    void testFibonacci_HappyPath() {
        // Calcula o valor Fibonacci para n = 6
        int resultado = Fibonacci.fibonacci(6);

        // Verifica se o resultado é igual a 8
        assertEquals(8, resultado);
    }

    /**
     * Testa o método Fibonacci.fibonacci com o valor 1.
     */
    @Test
    void testFibonacci_NumOne() {
        // Calcula o valor Fibonacci para n = 1
        int resultado = Fibonacci.fibonacci(1);

        // Verifica se o resultado é igual a 1
        assertEquals(1, resultado);
    }

    /**
     * Testa o método Fibonacci.fibonacci com o valor 0.
     */
    @Test
    void testFibonacci_NumZero() {
        // Calcula o valor Fibonacci para n = 0
        int resultado = Fibonacci.fibonacci(0);

        // Verifica se o resultado é igual a 0
        assertEquals(0, resultado);
    }

    /**
     * Testa o método Fibonacci.fibonacci com um valor negativo.
     */
    @Test
    void testFibonacci_NumNegativo() {
        // Verifica se uma exceção IllegalArgumentException é lançada ao calcular Fibonacci para n = -1
        assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
    }
}
