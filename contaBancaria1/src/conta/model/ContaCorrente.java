package conta.model;

public class ContaCorrente extends Conta{
//extends de conta, pois conta corrente herda as caracteristicas de conta
	
		private float limite;

		//Atributo gerador - Source
		public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
			super(numero, agencia, tipo, titular, saldo);
			this.limite = limite;
		}

		//Atributos Get and Set - Source
		public float getLimite() {
			return limite;
		}

		public void setLimite(float limite) {
			this.limite = limite;
		}
		
		//polimorfismo de sobrescrita - reescreve a função visualizar da super classe
		@Override //indica que foi reescrito
		public void visualizar() {
			super.visualizar();
			System.out.println("Limite de Crédito: " + this.limite);
		}
		
		@Override //indica que foi reescrito
		public boolean sacar(float valor) {
			if (this.getSaldo() + this.getLimite() < valor) {
				System.out.println("Saldo insuficiente!");
				return false;
			}
			else {
				this.setSaldo(this.getSaldo() - valor);
				return true;
			}
			
		}
}
