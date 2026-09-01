package com.javanauta.usuario.infrastructure.exceptions;

public class IlegalArgumentException extends RuntimeException {
    public IlegalArgumentException(String mensagem) {
        super(mensagem);
    }

    public IlegalArgumentException(String mensagem, Throwable throwable) {
        super(mensagem,  throwable);
    }
}
