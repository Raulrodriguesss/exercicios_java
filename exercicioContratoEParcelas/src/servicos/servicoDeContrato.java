package servicos;

import java.time.LocalDate;

import entidades.Contrato;
import entidades.Parcela;

public class servicoDeContrato {
	
	private metodosDePagamento  metodosDePagamentos;
	
	
	
	public servicoDeContrato(metodosDePagamento metodosDePagamentos) {
		
		this.metodosDePagamentos = metodosDePagamentos;
	}



	public void processaContrato(Contrato contrato,int meses){
		
		double parcelaBase= contrato.getValorTotal()/meses;
		
		for( int i=1;i <= meses;i++) {
			LocalDate vencimento= contrato.getData().plusMonths(i);
			
			double juros= metodosDePagamentos.juros(parcelaBase, i);
			
			double taxa= metodosDePagamentos.taxaDePagamento(parcelaBase+juros);
			
			double parcelaFinal =parcelaBase+juros+taxa;
			
			contrato.getParcelas().add(new Parcela(vencimento,parcelaFinal));
		}
	}
	
}

