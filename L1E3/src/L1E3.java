import java.util.Scanner;

public class L1E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		char sair = 'n';
		
		while(sair == 'n' || sair == 'N') {
			double peso = -1;
			double altura = -1;
			double imc;
		
			System.out.println("Insira seu Peso");
			peso = tc.nextDouble();
			
			while (peso <= 0) {
				System.out.println();
				System.out.println("Peso Inválido! Insira Novamente");
				peso = tc.nextDouble();
			}
			
			System.out.println();
			System.out.println("Insira sua Altura");
			altura = tc.nextDouble();
			
			while (altura <= 0) {
				System.out.println();
				System.out.println("Altura Inválida! Insira Novamente");
				altura = tc.nextDouble();
			}
			
			System.out.println();
			imc = peso/(altura*altura);
			System.out.println("IMC: " + imc);
			
			if (imc < 17) {
				System.out.println("Muito abaixo do peso");
				
			} else if (imc >= 17 && imc < 18.5){
				System.out.println("Abaixo do peso");
				
			} else if (imc >= 18.5 && imc < 25){
				System.out.println("Peso normal");
				
			} else if (imc >= 25 && imc < 30){
				System.out.println("Acima do peso");
				
			} else if (imc >= 30 && imc < 35){
				System.out.println("Obesidade grau I");
				
			} else if (imc >= 35 && imc <= 40){
				System.out.println("Obesidade grau II");
				
			} else if (imc > 40){
				System.out.println("Obesidade grau III");
				
			}
			
			System.out.println("Deseja sair do Programa? (s/n)");
			sair = tc.next().charAt(0);
			
			while(sair != 'n' && sair != 'N' && sair != 's' && sair != 'S') {
				System.out.println("Comando Incorreto! Tente Novamente");
				System.out.println("Deseja sair do Programa? (s/n)");
				sair = tc.next().charAt(0);
			}
		}
	}

}
