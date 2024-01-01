package com.pazzini.exemplos;

/**
 * A classe ValidadorSenha contém um método estático para validar senhas.
 */
public class ValidadorSenha {

    /**
     * Valida uma senha com base em critérios específicos.
     *
     * @param senha A senha a ser validada.
     * @return true se a senha atender aos critérios, false caso contrário.
     */
    public static boolean validaSenha(String senha) {
        // Verifica se a senha não é nula e possui pelo menos 8 caracteres
        return senha != null && senha.length() >= 8;
    }
}
