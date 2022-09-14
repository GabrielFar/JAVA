import java.util.Scanner;

public class Cliente {
	private String nome;
	private String cpf;
	private String rg;
	private Endereco endereco;
	private Conta conta;
	
	Scanner tc = new Scanner(System.in);
	
	public Cliente(String nome, String cpf, String rg, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.conta = null;
	}
	
	public void abrirConta(String numConta, double saldo, double limite, String senha, char tipoConta){
		
		this.conta = new Conta(numConta, saldo, limite, senha, tipoConta);
	}
	
	//Getters e Setters
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	//-------------------	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	//-------------------	
	public String getRg() {
		return this.rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	//-------------------	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	//-------------------	
	public Conta getConta() {
		return this.conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
}