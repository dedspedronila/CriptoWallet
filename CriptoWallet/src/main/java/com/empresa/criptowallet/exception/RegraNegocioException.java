package com.empresa.criptowallet.exception;

// Estender RuntimeException é comum para exceções de regra de negócio,
// pois evita a necessidade de declarar 'throws' em todos os métodos do Controller.
//Andre
public class RegraNegocioException extends RuntimeException {

    // Construtor que recebe a mensagem de erro
    public RegraNegocioException(String message) {
        super(message);
    }
}