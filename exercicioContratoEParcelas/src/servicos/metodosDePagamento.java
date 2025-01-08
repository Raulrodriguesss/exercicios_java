package servicos;

public interface metodosDePagamento {
	
	public double taxaDePagamento(double quantia);
	public double juros(double quantia, int numParcelas);
	
}
