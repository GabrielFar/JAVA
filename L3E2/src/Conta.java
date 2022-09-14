
public class Conta {
	private String numConta;
	private double saldo;
	private double limite;
	private String senha;
	private char tipoConta;
	
	public Conta(String numConta, double saldo, double limite, String senha, char tipoConta) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.limite = limite;
		this.senha = senha;
		this.tipoConta = tipoConta;
		
	}
	
	public String depositar(double deposito) {
		if (deposito > 0) {
			this.saldo += deposito;
			return "Depósito Realizado Com Sucesso";
		} else {
			return "Valor Inválido, Insira um Valor Superior à R$0,00";
		}
	}
	
	public String sacar(double saque) {
		if (saque > (this.limite + this.saldo)) {
			return "Saque Excede o Limite! Saque máximo de " + (this.limite + this.saldo);
		} else {
			saldo -= saque;
			return "Saque Realizado Com Sucesso";
		}
	}
	
	// Getters e Setters
	public String getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	//-------------------------
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//-------------------------
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	//-------------------------
	public String getSenha() {
		return this.senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	//-------------------------
	public char getTipoConta() {
		return this.tipoConta;
	}
	
	public void setTipoConta(char tipoConta) {
		this.tipoConta = tipoConta;
	}
}
