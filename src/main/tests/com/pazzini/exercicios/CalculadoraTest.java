package com.pazzini.exercicios;

import com.pazzini.exercicio.Calculadora;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A classe CalculadoraTest contém testes para os métodos privados da classe Calculadora,
 * utilizando reflexão para acessar métodos privados.
 */
class CalculadoraTest {

    @Test
    void testAdicionar_HappyPath() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        // Cria uma instância da Calculadora
        Calculadora calculadora = new Calculadora();
        
        // Obtém o método privado "adicionar" utilizando reflexão
        Method adicionar = Calculadora.class.getDeclaredMethod("adicionar", int.class, int.class);
        adicionar.setAccessible(true); // Permite acesso ao método privado

        // Invoca o método privado com argumentos 5 e 8
        int resultado = (int) adicionar.invoke(calculadora, 5, 8);

        // Verifica se o resultado é igual a 13
        assertEquals(13, resultado);
    }

    @Test
    void testSubtrair_HappyPath() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        // Cria uma instância da Calculadora
        Calculadora calculadora = new Calculadora();

        // Obtém o método privado "subtrair" utilizando reflexão
        Method subtrair = Calculadora.class.getDeclaredMethod("subtrair", int.class, int.class);
        subtrair.setAccessible(true); // Permite acesso ao método privado

        // Invoca o método privado com argumentos 5 e 8
        int resultado = (int) subtrair.invoke(calculadora, 5, 8);

        // Verifica se o resultado é igual a -3
        assertEquals(-3, resultado);
    }

    @Test
    void testMultiplicar_HappyPath() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        // Cria uma instância da Calculadora
        Calculadora calculadora = new Calculadora();

        // Obtém o método privado "multiplicar" utilizando reflexão
        Method multiplicar = Calculadora.class.getDeclaredMethod("multiplicar", int.class, int.class);
        multiplicar.setAccessible(true); // Permite acesso ao método privado

        // Invoca o método privado com argumentos 5 e 8
        int resultado = (int) multiplicar.invoke(calculadora, 5, 8);

        // Verifica se o resultado é igual a 40
        assertEquals(40, resultado);
    }

    @Test
    void testDividir_HappyPath() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        // Cria uma instância da Calculadora
        Calculadora calculadora = new Calculadora();

        // Obtém o método privado "dividir" utilizando reflexão
        Method dividir = Calculadora.class.getDeclaredMethod("dividir", int.class, int.class);
        dividir.setAccessible(true); // Permite acesso ao método privado

        // Invoca o método privado com argumentos 40 e 8
        int resultado = (int) dividir.invoke(calculadora, 40, 8);

        // Verifica se o resultado é igual a 5
        assertEquals(5, resultado);
    }

    @Test
    void testDividir_ByZero() throws NoSuchMethodException {
        // Cria uma instância da Calculadora
        Calculadora calculadora = new Calculadora();

        // Obtém o método privado "dividir" utilizando reflexão
        Method dividir = Calculadora.class.getDeclaredMethod("dividir", int.class, int.class);
        dividir.setAccessible(true); // Permite acesso ao método privado

        // Verifica se ao dividir por zero ocorre uma exceção do tipo ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            try {
                dividir.invoke(calculadora, 40, 0);
            } catch (InvocationTargetException e) {
                throw e.getTargetException(); // Lança a exceção original
            }
        });
    }
}
