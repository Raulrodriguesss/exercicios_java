package entidades;

public class PessoaFisica extends Pessoa {

	
		private double gstSaude;
		
		public PessoaFisica(){
			super();
		}
		
		
	public PessoaFisica(String nome, Double rendaAnual, double gstSaude) {
			super(nome, rendaAnual);
			this.gstSaude = gstSaude;
		}

	

	public double getGstSaude() {
		return gstSaude;
	}


	public void setGstSaude(double gstSaude) {
		this.gstSaude = gstSaude;
	}


	@Override
	public double calculaImposto() {
		if(getRendaAnual()<20000) {
			return (getRendaAnual()*0.15)-(gstSaude*0.50);
		}
		else {
			return (getRendaAnual()*0.25)-(gstSaude*0.50);
		}
	}

}
