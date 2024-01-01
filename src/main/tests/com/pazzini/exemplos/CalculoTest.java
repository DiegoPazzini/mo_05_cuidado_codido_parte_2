package com.pazzini.exemplos;

import com.pazzini.exemplos.Calculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoTest {

    // Testa a criação de uma instância da classe Calculo
    @Test
    void testConstructor() {
        final Calculo calculo = new Calculo();
        assertNotNull(calculo);
    }

    // Testa o método somarNumeros com valores válidos
    @Test
    void testSomarNumeros_HappyPath() {
        final Calculo calculo = new Calculo();
        final int soma = calculo.somarNumeros(10, 10);

        // Verifica se a soma está correta
        assertEquals(20, soma);
    }

    // Testa o método calcularMDC com valores válidos
    @Test
    void testCalcularMDC_HappyPath() {
        final Calculo calculo = new Calculo();
        final int mdc = calculo.calcularMDC(8, 4);

        // Verifica se o MDC está correto
        assertEquals(4, mdc);
    }

    // Testa o método calcularMDC quando o primeiro número é zero
    @Test
    void testCalcularMDC_N1IsZero() {
        final Calculo calculo = new Calculo();
        final int mdc = calculo.calcularMDC(0, 5);

        // Verifica se o MDC é igual ao segundo número quando o primeiro é zero
        assertEquals(5, mdc);
    }

    // Testa o método calcularMDC quando o segundo número é zero
    @Test
    void testCalcularMDC_N2IsZero() {
        final Calculo calculo = new Calculo();
        final int mdc = calculo.calcularMDC(5, 0);

        // Verifica se o MDC é igual ao primeiro número quando o segundo é zero
        assertEquals(5, mdc);
    }
}
