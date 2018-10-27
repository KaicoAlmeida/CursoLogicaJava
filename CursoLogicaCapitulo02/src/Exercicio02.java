import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
	
	// Faz a leitura da entrada do usuário
	Scanner scanner = new Scanner (System.in);	

	System.out.print("Digite seu peso em quilos:");
	Double meuPeso = scanner.nextDouble();

	System.out.print("Digite sua altura em metros:");
	Double minhaAltura = scanner.nextDouble();

	Double IMC = meuPeso / (minhaAltura * minhaAltura);

	System.out.println("O IMC é igual a: " + IMC);

	scanner.close();

}
}
