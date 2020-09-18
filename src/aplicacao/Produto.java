package aplicacao;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	public double totalvaloremestoque() {
		return preco * quantidade;
	}

	public void adicionarproduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerproduto(int quantidade) {
		this.quantidade -= quantidade;
	}
}
