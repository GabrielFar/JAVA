import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
				
		for (byte i = 0; i < 150; i++) {
			
			double num1;
			double num2;
			String operação;
			
			System.out.println("Digite O Primeiro Número:");
					
			num1 = tc.nextDouble();
						
			System.out.println("");
			System.out.println("Digite O Segundo Número:");
			
			num2 = tc.nextDouble();
						
			System.out.println("");
			System.out.println("Digite A Operação:");
			
			operação = tc.next();
			
			
			System.out.println("");
			if (operação.equals("+")) {
				System.out.println("Resultado: " + (num1 + num2));
				
			} else if(operação.equals("-")){
				System.out.println("Resultado: " + (num1 - num2));
				
			} else if(operação.equals("*")){
				System.out.println("Resultado: " + num1 * num2);
				
			} else if(operação.equals("/")){
				System.out.println("Resultado: " + num1 / num2);
				
			} else{
				System.out.println("Operação Inexistente");
				System.out.println("");
				System.out.println("Operações Existentes:");
				System.out.println("Adição: +");
				System.out.println("Subtração: -");
				System.out.println("Multiplicação: *");
				System.out.println("Divisão:");
			}
			
			System.out.println("");
			System.out.println("Próxima Operação!");
		}
	}

}
