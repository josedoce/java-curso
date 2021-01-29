package exercicios.abstracao;

public class Mercadoria extends Produto {
	private boolean promocao;
	
	public Mercadoria(String produtos, String validade, double preco, int quantidade, boolean promocao) {
		super(produtos, validade, preco, quantidade);
		this.promocao = promocao;
	}
	public Mercadoria() {
		
	}
	public String getProduto() {
		 return super.getProduto()+" | promoção: "+this.promocao;
	}
	public void setProduto(String produto, String validade, double preco, int quantidade, boolean promocao) {
		super.setProduto(produto, validade, preco, quantidade);
		this.promocao = promocao;
	}
}
