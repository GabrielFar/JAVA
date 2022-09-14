import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		Endereco enderecoBanco = new Endereco(0, "89790-00", "Dom Pedro I", 001, "Costa Azul", "Ipumirim", "SC");
		Banco banco = new Banco("XPTO", "00.000.000.000/0001-00", "01", enderecoBanco);

		char sair = 'n';
				
		while(sair == 'n') {
			
			char operacao;
			
			msgOperações();
			
			operacao = tc.next().charAt(0);
			
			while ( operacao != 'c' && operacao != 'C' && operacao != 'g' 
					&& operacao != 'G' && operacao != 's' && operacao != 'S') {
				System.out.println("Operação Inexistente");
				System.out.println();
				
				msgOperações();
				
				operacao = tc.next().charAt(0);
				System.out.println();
			}
			
			
			if (operacao == 's' || operacao == 'S') {				
				sair = 's';
				
			} else if(operacao == 'c' || operacao == 'C') {//Menu Caixa Eletronico
				caixaEletronico(tc, banco);
				
			} else if(operacao == 'g' || operacao == 'G') {//Menu Gerencial
				menuGerencial(tc, banco);
			}

		}
	}

	//----------------------------------------------------------------------------------------------------------------------
	
	public static void msgOperações() {
		System.out.println("Digite a Operação desejada:");
		System.out.println("Menu Gerencial: g");
		System.out.println("Caixa Eletrônico: c");
		System.out.println("Sair do Sistema: s");
		System.out.println();
	}
	
	//----------------------------------------------------------------------------------------------------------------------
	
	public static void menuGerencial(Scanner tc, Banco banco) {
		char sairMenu = 'n';
		char operacao;
		
		do {
			System.out.println("Menu Gerencial");
			System.out.println();
			System.out.println("Digite a Operação Desejada:");
			System.out.println("Cadastrar Endereço: 1");
			System.out.println("Cadastrar Cliente: 2");
			System.out.println("Abrir Conta: 3");
			System.out.println("Sair do Sistema: 9");
			operacao = tc.next().charAt(0);
			
			if (operacao == '1') {//Cadastrar Endereço				
				String cpf;
				System.out.println("Digite o CPF do Cliente");
				cpf = tc.next();
				
				Cliente cliente = banco.getCliente(cpf);
				
				if (banco.getCliente(cpf) == null) {
					System.out.println("CPF Não Cadastrado");
					
				} else {
					
					int id;
					System.out.println("Digite o Id do Endereço");
					id = tc.nextInt();
					
					String cep;
					System.out.println("Digite o CEP do Endereço");
					cep = tc.next();
					
					String rua;
					System.out.println("Digite a Rua do Endereço");
					rua = tc.next();
					
					int numero;
					System.out.println("Digite o Número do Endereço");
					numero = tc.nextInt();
					
					String bairro;
					System.out.println("Digite o Bairro do Endereço");
					bairro = tc.next();
					
					String cidade;
					System.out.println("Digite a Cidade do Endereço");
					cidade = tc.next();
					
					String uf;
					System.out.println("Digite a UF do Endereço");
					uf = tc.next();
					
					Endereco endereco = new Endereco(id, cep, rua, numero, bairro, cidade, uf);
					
					cliente.setEndereco(endereco);
				}				
				
			} else if(operacao == '2'){//Cadastrar Cliente	
				String nome;
				System.out.println("Digite o Nome do Cliente");
				nome = tc.next();
				
				String cpf;
				System.out.println("Digite o CPF do Cliente");
				cpf = tc.next();
				
				String rg;
				System.out.println("Digite o RG do Cliente");
				rg = tc.next();
				
				Cliente cliente = new Cliente(nome, cpf, rg, null);
								
				System.out.println(banco.addCliente(cliente));
				
			} else if(operacao == '3'){//Abrir Conta	
				String cpf;
				System.out.println("Digite o CPF do Cliente");
				cpf = tc.next();
				
				Cliente cliente = banco.getCliente(cpf);
				
				if (cliente == null) {
					System.out.println("CPF Não Cadastrado");
					
				} else {
					String numConta;
					System.out.println("Digite o Número da Conta");
					numConta = tc.next();
					
					double saldo = 0;
					
					double limite;
					System.out.println("Digite o Limite da Conta");
					limite = tc.nextDouble();
					
					String senha;
					System.out.println("Digite a Senha da Conta");
					senha = tc.next();
					
					char tipoConta;
					System.out.println("Digite o Tipo da Conta");
					tipoConta = tc.next().charAt(0);
					
					cliente.abrirConta(numConta, saldo, limite, senha, tipoConta);
				}
				
			} else if(operacao == '9'){//Sair do Menu Gerencial
				sairMenu = 's';
				
			} else {
				System.out.println("Operação Inexistente!");
				System.out.println();
			}	
			
		} while (sairMenu != 's' && sairMenu != 'S');
	}
	
	//----------------------------------------------------------------------------------------------------------------------
	
	public static void caixaEletronico(Scanner tc, Banco banco) {
		char sairCaixa = 'n';
		char operacao;
		
		do {
			System.out.println("Caixa Eletrônico");
			System.out.println();
			System.out.println("Digite a Operação Desejada:");
			System.out.println("Depositar: 1");
			System.out.println("Sacar: 2");
			System.out.println("Consultar saldo: 3");
			System.out.println("Sair do Sistema: 9");
			operacao = tc.next().charAt(0);
			
			if (operacao == '1') {// Depósito
				System.out.println();
				
				String cpf;
				System.out.println("Digite o CPF do Cliente");
				cpf = tc.next();
				
				if (banco.getCliente(cpf) == null) {
					System.out.println("CPF Não Cadastrado");
					
				} else {
					double deposito;
					System.out.println("Digite a Quantidade a Ser Depositada");
					deposito = tc.nextDouble();
					
					System.out.println(banco.getCliente(cpf).getConta().depositar(deposito)); 
				}
				
			} else if(operacao == '2'){// Saque
				System.out.println();
				
				String cpf;
				System.out.println("Digite o CPF do Cliente");
				cpf = tc.next();
				
				if (banco.getCliente(cpf) == null) {
					System.out.println("CPF Não Cadastrado");
					
				} else {					
					double saque;
					System.out.println("Digite a Quantidade a Ser Sacada");
					saque = tc.nextDouble();
					
					System.out.println(banco.getCliente(cpf).getConta().sacar(saque));
				}
												
				
			} else if(operacao == '3'){// Saldo
				System.out.println();
				
				String cpf;
				System.out.println("Digite o CPF do Cliente");
				cpf = tc.next();
								
				if (banco.getCliente(cpf) == null) {
					System.out.println("CPF Não Cadastrado");
					
				} else {					
					System.out.println(banco.getCliente(cpf).getConta().getSaldo());
				}
				
			} else if(operacao == '9'){// Sair do Caixa Eletronico
				sairCaixa = 's';
				
			} else {
				System.out.println("Operação Inexistente!");
				System.out.println();
			}		
			
		} while (sairCaixa != 's' && sairCaixa != 'S');
	}
}
