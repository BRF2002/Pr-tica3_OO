package ex2;

public class FComissionado extends Funcionario {
	
	public FComissionado(int matricula, String nome, double salario) {
		super(matricula, nome, salario);
	}
	private double percentual;
	private double vendas;
	
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	public double calcularProventos() {
		return getSalario() + (this.vendas*this.percentual/100);
	}

	public String toString() {
		return null;
	}
}
