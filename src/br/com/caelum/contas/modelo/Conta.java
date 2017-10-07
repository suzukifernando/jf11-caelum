package br.com.caelum.contas.modelo;
public abstract class Conta {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;
	
	public Conta(String titular, String agencia){
		setTitular(titular);
		setAgencia(agencia);
	}
	
	public Conta(){
		
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca (double valor){
		this.saldo -= valor;
	}
	
//	public abstract String getTipo();
	
	public void transfere (double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
	
}
