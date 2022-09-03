import java.util.Scanner;

public class L1E2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		String forma;
		char sair = 'n';
		
		while(sair == 'n' || sair == 'N') {
			double area = -1;
			
			System.out.println("Selecione Um Forma:");
			System.out.println();
			System.out.println("Círculo (C ou 1)");
			System.out.println("Retângulo (R ou 2)");
			System.out.println("Triângulo Retângulo (TR ou 3)");
			System.out.println("Triângulo Equilátero (TE ou 4)");
			
			forma = tc.next();
			System.out.println();
			
			if (forma.equals("C") || forma.equals("c") || forma.equals("1")) {
				area = calcularCirculo(tc);

			} else if (forma.equals("R") || forma.equals("r") || forma.equals("2")){
				area = calcularRetangulo(tc);
				
			} else if (forma.equals("TR") || forma.equals("tr") || forma.equals("Tr") || forma.equals("tR") || forma.equals("3")){
				area = calcularTrianguloRetangulo(tc);
				
			} else if (forma.equals("TE") || forma.equals("te") || forma.equals("Te") || forma.equals("tE") || forma.equals("4")){
				area = calcularTrianguloEquilatero(tc);
				
			} else {
				System.out.println("Forma Não Cadastrada! Selecione um das Opções Disponíveis!");
			}
			
			if(area != -1) {
				System.out.println("Área: " + area);
			}
			
			sair = mensagemSair(sair, tc);
		}		
	}
	
	public static double calcularCirculo(Scanner tc) {

		double raio;
		double pi = Math.PI;
		
		System.out.println("Informe o Raio");
		raio = tc.nextDouble();
		
		return pi * raio*raio;
	}
	
	public static double calcularRetangulo(Scanner tc) {

		double base;
		double altura;
		
		System.out.println("Informe a Base");
		base = tc.nextDouble();
		
		System.out.println();
		System.out.println("Informe a Altura");
		altura = tc.nextDouble();
		
		return base * altura;
	}
	
	public static double calcularTrianguloRetangulo(Scanner tc) {

		double base;
		double altura;
		
		System.out.println("Informe a Base");
		base = tc.nextDouble();
		
		System.out.println();
		System.out.println("Informe a Altura");
		altura = tc.nextDouble();
		
		return (base * altura)/2;
	}
	
	public static double calcularTrianguloEquilatero(Scanner tc) {

		double lado;
		double raizDe3 = Math.sqrt(3);
		
		System.out.println("Informe a Medida do Lado");
		lado = tc.nextDouble();		
		
		return (lado*lado*raizDe3)/4;
	}
	
	public static char mensagemSair(char sair, Scanner tc) {
		System.out.println();
		System.out.println("Deseja sair do Programa? (s/n)");
		sair = tc.next().charAt(0);
		
		while(sair != 'n' && sair != 'N' && sair != 's' && sair != 'S') {
			System.out.println("Comando Incorreto! Tente Novamente");
			System.out.println("Deseja sair do Programa? (s/n)");
			sair = tc.next().charAt(0);
		}
		
		return sair;
	}
	
}
