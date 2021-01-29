package exercicios.main;
import exercicios.abstracao.*;

public class heranca {
	public static void main(String[] args) {
		Mercadoria mercadoria = new Mercadoria("coca cola", "03/04/2021", 3.50, 20, true);
		//mercadoria.setProduto();
		System.out.println(mercadoria.getProduto());
		
	}
}
