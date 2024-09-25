

public class Main {

	public static void main(String[] args) {
		
		
// Objeto referente a classe criada "Produto". 
		Produto produto1 = new Produto("Bicicleta", "Caloi", 1000.00 , 1500.00, 1);
		System.out.println(produto1.resultadoLucro());
		
//Objeto referente a classe criado "Pessoas".
		 try {
	            String dataNascimentoStr = "29/09/2004";
	            Pessoas p1 = new Pessoas("Lucas Yoshida", 1.78, dataNascimentoStr);
	            
	            System.out.println(p1.descricao());
	            
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
		 
		 try {
			 String dataNascimentoStr = "29/09/2025";
			 Pessoas p2 = new Pessoas("Irineu da Silva", 1.80, dataNascimentoStr);
		 } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
		
		

	}

}
