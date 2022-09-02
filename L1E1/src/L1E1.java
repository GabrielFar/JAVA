import java.util.Scanner;

public class L1E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		char finalizar = 'n';
		char addMaisNotas = 's';
		
		while (finalizar == 'n' || finalizar == 'N') {
			
			double somaDeNotas = 0;
			double novaNota;
			int contaNotas = 0;
			
			while (addMaisNotas == 's' || addMaisNotas == 'S') {
				
				System.out.println("Digite a Nota:");
				
				novaNota = tc.nextDouble();
				
				while(novaNota < 0 || novaNota > 10) {
					System.out.println("Nota Inválida! Digite Novamente");
					novaNota = tc.nextDouble();
				}
				
				somaDeNotas = somaDeNotas + novaNota;				
				contaNotas++;
				
				System.out.println("Deseja Adicionar Mais Notas? (s/n)");
				addMaisNotas = tc.next().charAt(0);
				
				while(addMaisNotas != 'n' && addMaisNotas != 's' && addMaisNotas != 'N' && addMaisNotas != 'S') {
					System.out.println("Resposta Inválida!");
					
					System.out.println("Deseja Adicionar Mais Notas? (s/n)");
					
					addMaisNotas = tc.next().charAt(0);
				}
				
			}
			if(addMaisNotas == 'n' || addMaisNotas == 'N') {
				
				double media = somaDeNotas/contaNotas;
				System.out.println("Média: " + media);
				
				System.out.println("Deseja Finalizar o Programa?");
				finalizar = tc.next().charAt(0);
				
				addMaisNotas = 's';
				
			}
		}
	}

}
