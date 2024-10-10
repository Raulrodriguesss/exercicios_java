	package entidades;
	
	public class PessoaJuridica extends Pessoa{
	
		private int numFuncionarios;
		
		public PessoaJuridica(){
			super();
		}
		
		public PessoaJuridica(String nome, Double rendaAnual, int numFuncionarios) {
			super(nome, rendaAnual);
			this.numFuncionarios = numFuncionarios;
		}
	
		public int getNumFuncionario() {
			return numFuncionarios;
		}
	
	
	
		public void setNumFuncionario(int numFuncionario) {
			this.numFuncionarios = numFuncionario;
		}
	
		@Override
		public double calculaImposto() {
			if(numFuncionarios>10) {
				return getRendaAnual()*0.14;
			}
			else {
				return getRendaAnual()*0.16;
			}
		}
	
	}
