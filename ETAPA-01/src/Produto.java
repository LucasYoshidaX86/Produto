//Classe representando produto, contendo informações dos atributos pedidos. 
public class Produto {  
	String nome;
	String marca;
	double custo;
	double PrecoVenda;
	double lucro;
	int vendauni;
	
//Constructor para iniciar atributos criados.	
	public Produto(String nome, String marca, double custo, double PrecoVenda, int vendauni){
		this.nome = nome;
		this.marca = marca;
		this.custo = custo;
		this.PrecoVenda = PrecoVenda;
		this.lucro = PrecoVenda - custo;
		this.vendauni = vendauni;
		
	}
	
//Exibição das informações quando puxadas ao main. 
	String resultadoLucro() {
		return
				"Nome:  " + this.nome + "\n" +
				"Marca:  " + this.marca + "\n" +
				"Preço de custo:  " + this.custo + "\n" +
				"Preço de venda:  " + this.PrecoVenda + "\n" +
				"Lucro:  " + this.lucro * this.vendauni + "\n" +
				"Quantidade de vendas:  " +this.vendauni + "\n";
	}
	

}
