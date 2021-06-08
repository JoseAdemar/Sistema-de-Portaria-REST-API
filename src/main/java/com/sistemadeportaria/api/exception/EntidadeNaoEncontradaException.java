package com.sistemadeportaria.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class EntidadeNaoEncontradaException extends RuntimeException  {

	private static final long serialVersionUID = 1L;
	
	public EntidadeNaoEncontradaException(String mensagem) {
		
		super(mensagem);
	}

}