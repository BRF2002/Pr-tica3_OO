package ex2;

public class FProdutividade extends Funcionario {

	public FProdutividade(int matricula, String nome, double salario) {
		super(matricula, nome, salario);
	}
	private double valor;
	private int produçao;
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getProduçao() {
		return produçao;
	}
	public void setProduçao(int produçao) {
		this.produçao = produçao;
	}
	public double calcularProventos() {
		return getSalario();
	}
	public String toString() {
		return null;
	}
}
