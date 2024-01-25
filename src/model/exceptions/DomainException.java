package model.exceptions;

public class DomainException extends RuntimeException {

	//Caso seja uma RunTimeException não há obrigação de tratar as exceções
	
	//declaração de uma classe serializable
	private static final long serialVersionUID = 1L;
	
	//para que se possa instanciar a exceção personalizada para passar uma mensagem(ficará armazenado dentro da exceção)
	public DomainException(String msg) {
		super(msg);
	}
}
