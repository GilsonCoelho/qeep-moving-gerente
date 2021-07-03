package br.com.qm.gerente.exception;

public class GerenteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5756239499842595944L;
	
	
	private String mensagemDeErro;

	public GerenteException(String mensagemDeErro) {
		super();
		this.mensagemDeErro = mensagemDeErro;
	}

	public String getMensagemDeErro() {
		return mensagemDeErro;
	}
	
}
