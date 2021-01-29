package exercicios.abstracao;

public class Produto {
	
	private String produto;
	private String validade;
	private double preco;
	protected int quantidade;
	
	public Produto(String produtos, String validade, double preco, int quantidade) {
		this.produto = produtos;
		this.validade = validade;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto() {
		
	}
	
	public String getProduto() {
		return "item: "+this.produto+" | validade: "+this.validade+" | preco: R$ "+this.preco+" | qtd un: "+(this.quantidade>0?this.quantidade:"estoque vazio");
	}
	
	public void setProduto(String produtos, String validade, double preco, int quantidade) {
		this.produto = produtos;
		this.validade = validade;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public int getCompra() {
		return this.quantidade;
	}
	
	public void setCompra(int quantidade) {
		if(this.quantidade > 0) {
			this.quantidade -= quantidade;
		}
	}
	
}
