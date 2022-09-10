import java.util.Scanner;

public class L2E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		char sair = 'n';
		
		while(sair == 'n' || sair == 'N') {
			
			int qntdNums;
			int[] sequenciaFibonacci;
			
			System.out.println("Quantos Números da Sequência de Fibonacci Você Deseja Ver?");
			qntdNums = tc.nextInt();
			sequenciaFibonacci = new int[qntdNums];			
			
			while(qntdNums <= 0) {
				System.out.println("Quantidade Impossível! Tente Novamente");
				System.out.println("Quantos Números da Sequência de Fibonacci Você Deseja Ver?)");
				qntdNums = tc.nextInt();
			}
			
			sequenciaFibonacci[0] = 1;
			sequenciaFibonacci[1] = 1;
						
			for (int i = 2; i < sequenciaFibonacci.length; i++) {
				sequenciaFibonacci[i] = sequenciaFibonacci[i - 1] + sequenciaFibonacci[i - 2];
			}
			
			System.out.println();
			System.out.println("Sequência Fibonacci");
			
			for (int i = 0; i < sequenciaFibonacci.length; i++) {
				System.out.println(sequenciaFibonacci[i]);
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

}
