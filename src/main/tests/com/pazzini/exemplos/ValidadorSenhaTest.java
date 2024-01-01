package com.pazzini.exemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A classe ValidadorSenhaTest contém testes para a classe ValidadorSenha.
 */
class ValidadorSenhaTest {

    /*
    1 - Adicionar um novo teste (esse teste tem que quebrar);
    2 - Executa o teste;
    3 - Refatorar (modificar) o código para fazer o código passar;
    4 - Executar o teste. Ele precisa passar.
     */

    /**
     * Testa o método validaSenha com uma senha que atende aos critérios.
     */
    @Test
    void testValidaSenha_HappyPath() {
        // Refatoramos o método validaSenha para 'static' para que não seja necessária a instância da classe
        final boolean isValida = ValidadorSenha.validaSenha("12345678");

        // Verifica se a senha é considerada válida
        assertTrue(isValida);
    }
}
