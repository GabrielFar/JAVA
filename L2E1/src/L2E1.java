import java.util.Scanner;

public class L2E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		char sair = 'n';
		
		while(sair == 'n' || sair == 'N') {
			
			double[] temps;
			int quantidadeTemp;
			int indexador = 0;
			int diaComparado;
			double media;
			char compararMais = 's';
			
			System.out.println("Quantas Temperaturas Você Deseja Digitar?");
			quantidadeTemp = tc.nextInt();
			temps = new double[quantidadeTemp];
			
			while(indexador < quantidadeTemp) {
				System.out.println();
				System.out.println("Digite As Temperaturas:");
				for (indexador = 0; indexador < quantidadeTemp; indexador++) {
					
					double temp = tc.nextDouble();
					
					temps[indexador] = temp;
				}
			}
			
			media = calcularMedia(temps);
			
			while(compararMais == 's' ||compararMais == 'S') {
			
				System.out.println();
				System.out.print("Digite um Dia para ser Comparado: ");
				diaComparado = tc.nextInt();
				
				while(diaComparado > temps.length) {
					System.out.println("Dia Não Cadastrdo! Tente Novamente");
					System.out.print("Digite um Dia para ser Comparado: ");
					diaComparado = tc.nextInt();
				}
				
				System.out.println("A Temperatura do Dia " + diaComparado + " (" + temps[(diaComparado - 1)] + ")" +
						" é " + compararTemperaturas(media, diaComparado, temps) + " à Média (" + media +")");
				
				System.out.println();
				System.out.println("Deseja Consultar Outro Dia?(s/n)");
				compararMais = tc.next().charAt(0);
			}
			
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

	private static String compararTemperaturas(double media, int diaComparado, double[] temps) {
		// TODO Auto-generated method stub
		
		double tempPesquisado = temps[(diaComparado - 1)];
		
		if (tempPesquisado > media) {
			return "Maior";
		} else if(tempPesquisado < media){
			return "Menor";
		} else {
			return "Igual";
		}
	}

	private static double calcularMedia(double[] temps) {
		// TODO Auto-generated method stub
		double somaTemps = 0;
		for (int i = 0; i < temps.length; i++) {
			somaTemps = somaTemps + temps[i];
		}
		return somaTemps/temps.length;
	}

}
