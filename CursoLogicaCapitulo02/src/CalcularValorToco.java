import java.util.Scanner;

public class CalcularValorToco {
	
		public static void main(String[] args) {
			
			// Faz a leitura da entrada do usuário
			Scanner scanner = new Scanner (System.in);	
			
			System.out.print("Digite o valor do produto: ");
			Double valorProduto = scanner.nextDouble();
			
			System.out.print("Digite quantidade passada pelo cliente: ");
			Double valorPassadoPeloCliente = scanner.nextDouble();
			
			Double resultado = valorPassadoPeloCliente - valorProduto;
			
			System.out.println("Troco: " + resultado);
			
			scanner.close();
			
			scanner.close();
			
					}

}
