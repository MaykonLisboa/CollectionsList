import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasOnline {
	
	private List<Item> itens;
	
	public CarrinhoDeComprasOnline() {
		this.itens = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item novoItem = new Item(nome, preco, quantidade);
		itens.add(novoItem);
	}
	
	public void removerItem(String nome) {
	    boolean removed = itens.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
	    if (removed) {
	    	System.out.println("Item \""+ nome + "\" removido com sucesso");
	    }
	}
	public double calcularValorTotal() {
		double valorTotal = 0;
	    for (Item item : itens) {
	    	valorTotal += item.getPreco() * item.getQuantidade();
	        }
	    return valorTotal;
	}
	public void exibirItens() {
		for (Item item : itens) {
			System.out.println("Nome: " + item.getNome());
			System.out.println("Preço: " + item.getPreco());
			System.out.println("Quantidade: " + item.getQuantidade());
			System.out.println("-------------------------------");
		}
	}
	public static void main(String[] args) {
		CarrinhoDeComprasOnline carrinho = new CarrinhoDeComprasOnline();
		carrinho.adicionarItem("Jaqueta TheSims", 59.90, 1);
		carrinho.adicionarItem("Calça Jeans", 89.90, 1);
		carrinho.adicionarItem("Tenis da Adidas", 229.90, 1);
		carrinho.adicionarItem("Mochila Escolar", 30.90, 1);
		carrinho.adicionarItem("Memoria RAM DDR4 16gb 3200mhz", 200.00, 2);
		carrinho.exibirItens();
		
		System.out.println("Valor Total: "+ String.format("%.2f", carrinho.calcularValorTotal())+" Reais");
	
		carrinho.removerItem("Memoria RAM DDR4 16gb 3200mhz");
		System.out.println("Valor Total: "+ String.format("%.2f", carrinho.calcularValorTotal())+" Reais");	
	}
}
