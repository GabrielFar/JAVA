import java.util.Scanner;

public class L1E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		char calcular = 'n';
		double somaDeNotas = 0;
		double novaNota;
		int contaNotas = 0;
		
		while (calcular == 'n') {
			
			System.out.println("Digite a Nota:");
			
			novaNota = tc.nextDouble();
			
			somaDeNotas = somaDeNotas + novaNota;
			
			contaNotas++;
			
			System.out.println("Deseja Calcular a Média? (s/n)");
			
			calcular = tc.next().charAt(0);
			
			while(calcular != 'n' && calcular != 's') {
				System.out.println("Resposta Inválida!");
				
				System.out.println("Deseja Calcular a Média? (s/n)");
				
				calcular = tc.next().charAt(0);
			}
			
			if (calcular == 's') {
				double media = somaDeNotas/contaNotas;
				System.out.println("Média: " + media);
				
			}
			
		}
	}

}
