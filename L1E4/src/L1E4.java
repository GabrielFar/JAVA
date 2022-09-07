import java.util.Scanner;

public class L1E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		char sair = 'n';
		
		while(sair == 'n' || sair == 'N') {
			char sexo;
			double altura = -1;
			double pesoIdeal;
		
			System.out.println("Insira seu Sexo (M/F)");
			sexo = tc.next().charAt(0);
			
			while (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
				System.out.println();
				System.out.println("Sexo Inválido! Insira Novamente");
				sexo = tc.next().charAt(0);
			}
			
			System.out.println();
			System.out.println("Insira sua Altura");
			altura = tc.nextDouble();
			
			while (altura <= 0) {
				System.out.println();
				System.out.println("Altura Inválida! Insira Novamente");
				altura = tc.nextDouble();
			}
			
			pesoIdeal = calcularPesoIdeal(sexo, altura);
			System.out.println("Peso Ideal: " + pesoIdeal);
			
			System.out.println();
			System.out.println("Deseja sair do Programa? (s/n)");
			sair = tc.next().charAt(0);
			
			while(sair != 'n' && sair != 'N' && sair != 's' && sair != 'S') {
				System.out.println("Comando Incorreto! Tente Novamente");
				System.out.println("Deseja sair do Programa? (s/n)");
				sair = tc.next().charAt(0);
			}
		}
	}

	private static double calcularPesoIdeal(char sexo, double altura) {
		// TODO Auto-generated method stub
		if (sexo == 'm' || sexo == 'M') {
			return (72.7*altura) - 58;
		} else {
			return (62.1*altura) - 44.7;
		}
	}

}
