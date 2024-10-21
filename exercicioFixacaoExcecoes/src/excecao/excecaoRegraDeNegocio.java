package excecao;

public class excecaoRegraDeNegocio extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public excecaoRegraDeNegocio(String msg) {
		super(msg);
	}
}
