import java.util.Scanner;

public class Banco {
	private String nome;
	private String cnpj;
	private String agencia;
	private Endereco endereco;
	private Cliente[] clientes;
	
	Scanner tc = new Scanner(System.in);

	public Banco(String nome, String cnpj, String agencia, Endereco endereco) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.agencia = agencia;
		this.endereco = endereco;
		this.clientes = new Cliente[0];
	}
	
	public Cliente getCliente(String cpf) {
		for (int i = 0; i < clientes.length; i++) {
			if (cpf.equals(clientes[i].getCpf())) {
				return clientes[i];
			}
		}
		return null;
	}
	
	public String addCliente(Cliente cliente) {
		
		Cliente[] temp = new Cliente[clientes.length + 1]; 
		
		for (int i = 0; i < clientes.length; i++) {
			temp[i] = clientes[i]; 
		}
		
		temp[clientes.length] = cliente;
		clientes = temp;
		
		return "Cliente Adicionado com Sucesso";
	}
	
	// Getters e Setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	//--------------------------
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	//--------------------------
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAngencia(String agencia) {
		this.agencia = agencia;
	}
	//--------------------------
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	//--------------------------
	public Cliente[] getClientes() {
		return this.clientes;
	}
	
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
}