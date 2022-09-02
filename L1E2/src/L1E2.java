import java.util.Scanner;

public class L1E2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		String forma;
		
		while(true) {
			System.out.println("Selecione Um Forma:");
			System.out.println();
			System.out.println("Círculo (C ou 1)");
			System.out.println("Retângulo (R ou 2)");
			System.out.println("Triângulo Retângulo (TR ou 3)");
			System.out.println("Triângulo Equilátero (TE ou 4)");
			
			forma = tc.next();
			System.out.println();
			
			if (forma.equals("C") || forma.equals("c") || forma.equals("1")) {
				calcularCirculo();
				System.out.println();

			} else if (forma.equals("R") || forma.equals("r") || forma.equals("2")){
				calcularRetangulo();
				System.out.println();
				
			} else if (forma.equals("TR") || forma.equals("tr") || forma.equals("Tr") || forma.equals("tR") || forma.equals("3")){
				calcularTrianguloRetangulo();
				System.out.println();
				
			} else if (forma.equals("TE") || forma.equals("te") || forma.equals("Te") || forma.equals("tE") || forma.equals("4")){
				calcularTrianguloEquilatero();
				System.out.println();
				
			} else {
				System.out.println("Forma Não Cadastrada! Selecione um das Opções Disponíveis!");
			}
		}		
	}
	
	public static void calcularCirculo() {
		Scanner tc = new Scanner(System.in);

		double raio;
		double pi = Math.PI;
		
		System.out.println("Informe o Raio");
		raio = tc.nextDouble();
		
		double area = pi * raio*raio;
		System.out.println("Área: " + area);
	}
	
	public static void calcularRetangulo() {
		Scanner tc = new Scanner(System.in);

		double base;
		double altura;
		
		System.out.println("Informe a Base");
		base = tc.nextDouble();
		
		System.out.println();
		System.out.println("Informe a Altura");
		altura = tc.nextDouble();
		
		double area = base * altura;
		System.out.println("Área: " + area);
	}
	
	public static void calcularTrianguloRetangulo() {
		Scanner tc = new Scanner(System.in);

		double base;
		double altura;
		
		System.out.println("Informe a Base");
		base = tc.nextDouble();
		
		System.out.println();
		System.out.println("Informe a Altura");
		altura = tc.nextDouble();
		
		double area = (base * altura)/2;
		System.out.println("Área: " + area);
	}
	
	public static void calcularTrianguloEquilatero() {
		Scanner tc = new Scanner(System.in);

		double lado;
		double raizDe3 = Math.sqrt(3);
		
		System.out.println("Informe a Medida do Lado");
		lado = tc.nextDouble();		
		
		double area = (lado*lado*raizDe3)/4;
		System.out.println("Área: " + area);
	}
	
}
