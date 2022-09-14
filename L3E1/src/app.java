import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		char sair = 'n';
		
		Calculadora calculadora = new Calculadora();
		double resul = 0;
		
		System.out.println("Calculadora");
		
		while(sair == 'n' || sair == 'N') {
			
			char operacao;
			double num1;
			double num2;
			
			msgOperações();
			
			operacao = tc.next().charAt(0);
			
			while (operacao != '+' && operacao != '-' && operacao != '/' && operacao != '*' && operacao != 'c' 
					&& operacao != 'C' && operacao != 'm' && operacao != 'M' && operacao != 'g' && operacao != 'G'
					&& operacao != 's' && operacao != 'S') {
				System.out.println("Operação Inexistente");
				System.out.println();
				
				msgOperações();
				
				operacao = tc.next().charAt(0);
				System.out.println();
			}
			
			
			if (operacao == '+') {
				System.out.println("Digite os Números para a Operação:");
				num1 = tc.nextDouble();
				num2 = tc.nextDouble();
				resul = calculadora.somar(num1, num2);
				System.out.println();
				System.out.println("Resultado: " + resul);
				
			} else if (operacao == '-'){
				System.out.println("Digite os Números para a Operação:");
				num1 = tc.nextDouble();
				num2 = tc.nextDouble();
				resul = calculadora.subtrair(num1, num2);
				System.out.println();
				System.out.println("Resultado: " + resul);
				
			} else if (operacao == '*'){
				System.out.println("Digite os Números para a Operação:");
				num1 = tc.nextDouble();
				num2 = tc.nextDouble();
				resul = calculadora.multiplicar(num1, num2);
				System.out.println();
				System.out.println("Resultado: " + resul);
				
			} else if (operacao == '/'){
				System.out.println("Digite os Números para a Operação:");
				num1 = tc.nextDouble();
				num2 = tc.nextDouble();
				resul = calculadora.dividir(num1, num2);
				System.out.println();
				System.out.println("Resultado: " + resul);
				
			} else if (operacao == 'm' || operacao == 'M'){
				System.out.println("Adicionado à Menmória");
				calculadora.addMemoria(resul);
				
			} else if (operacao == 'c' || operacao == 'C'){
				calculadora.clrMemoria();
				
			} else if (operacao == 'g' || operacao == 'G'){
				System.out.println("Memória: " + calculadora.getMemoria());
				
			} else if (operacao == 's' || operacao == 'S') {
				
				sair = 's';
			}

		}
	}
	
	public static void msgOperações() {
		System.out.println();
		System.out.println("Digite a Operação desejada:");
		System.out.println("Adição: +");
		System.out.println("Subtração: -");
		System.out.println("Multiplicação: *");
		System.out.println("Divisão: /");
		System.out.println("Limpar Memória: c");
		System.out.println("Adicionar à Memória: m");
		System.out.println("Ver Memória: g");
		System.out.println("Sair da Calculadora: s");
		System.out.println();
	}

}
