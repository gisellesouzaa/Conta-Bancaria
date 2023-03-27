package conta.model;

public class ContaPoupanca extends Conta {
	
	private int aniversario;

	//Atributo gerador - Source 
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	//Atributos Get and Set - Source
	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	//polimorfismo de sobrescrita
	@Override 
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversáio no dia: " + this.aniversario);
	}
	
	
	

}
