package br.com.caelum.contas.modelo;
public abstract class Conta implements Comparable<Conta>{
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
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou depositar " + "um valor negativo");
		} else {
			this.saldo += valor;
		}
		
	}
	
	public void saca (double valor){
		this.saldo -= valor;
	}
	
//	public abstract String getTipo();
	
	public void transfere (double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", titular=" + titular + ", numero="
				+ numero + ", agencia=" + agencia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
	
	
	
//	@Override
//	public String toString() {
//		return "A conta do " + titular + " tem " + saldo;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof Conta)){
//			return false;
//		}
//		Conta c = (Conta) obj;
//		return this.titular == c.titular;
//			
//	}
	
	
	
}
