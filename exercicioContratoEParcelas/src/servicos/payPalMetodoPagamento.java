package servicos;

public class payPalMetodoPagamento implements metodosDePagamento{
	private static final double porcentagemTaxa=0.02;
	private static final double jurosMensais=0.01;

	@Override
	public double taxaDePagamento(double quantia) {
		
		return quantia*porcentagemTaxa;
	}

	@Override
	public double juros(double quantia, int numParcelas) {
		
		return quantia*jurosMensais*numParcelas;
	}

}
