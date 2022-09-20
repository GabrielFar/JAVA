import java.util.Calendar;

import Exceptions.*;

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
	
	public void depositar(double deposito) throws depositoInvalidoException, horarioDoBancoException{
		if (bancoEstaAberto()) {
			if (deposito > 0) {
				this.saldo += deposito;
			} else {
				throw new depositoInvalidoException("Depósito Inváildo, Informe Um Valor Superior à R$0,00"); 
			}	
			
		} else {
			throw new horarioDoBancoException ("Banco Fora do Horário de Funcionamento");
		}
	}
	
	public void sacar(double saque) throws saqueAlemDoLimiteExecption, horarioDoBancoException{
		if (bancoEstaAberto()) {
			if (saque > (this.limite + this.saldo)) {
				throw new saqueAlemDoLimiteExecption ("Saque Excede o Limite! Saque máximo de " + (this.limite + this.saldo));
			} else {
				saldo -= saque;
			}	
			
		} else {
			throw new horarioDoBancoException ("Banco Fora do Horário de Funcionamento");
		}
	}
	
	public boolean bancoEstaAberto() {
		Calendar data = Calendar.getInstance();
		int hora = data.get(Calendar.HOUR_OF_DAY); 
		System.out.println(hora);
		if (hora <= 22 && hora >= 6) {
			return false;
		} else {
			return true;
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
