package br.edu.infnet.appfrota.model.exceptions;

public class VeiculoInvalidoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public VeiculoInvalidoException(String mensagem) {
		super(mensagem);
	}
}
