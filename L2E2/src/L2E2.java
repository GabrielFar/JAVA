import java.util.Scanner;

public class L2E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		char sair = 'n';
		
		while(sair == 'n' || sair == 'N') {
			
			int qntdNums;
			int[] sequenciaFibonacci;
			int numsGerados = 0;
			int novoNum;
			int ultimoNum = 1;
			int penultimoNum = 0;
			
			System.out.println("Quantos Números da Sequência de Fibonacci Você Deseja Ver?");
			qntdNums = tc.nextInt();
			sequenciaFibonacci = new int[qntdNums];
			
			while(qntdNums <= 0) {
				System.out.println("Quantidade Impossível! Tente Novamente");
				System.out.println("Quantos Números da Sequência de Fibonacci Você Deseja Ver?)");
				qntdNums = tc.nextInt();
			}
			
			sequenciaFibonacci[0] = 1;
			
			while (qntdNums - 1 > numsGerados) {
				novoNum = ultimoNum + penultimoNum;
				penultimoNum = ultimoNum;
				ultimoNum = novoNum;
					
				sequenciaFibonacci[numsGerados + 1] = novoNum;
				numsGerados++;
			}
			System.out.println();
			System.out.println("Sequência Fibonacci");
			
			for (int i = 0; i < sequenciaFibonacci.length; i++) {
				System.out.println(i + " - " + sequenciaFibonacci[i]);
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
