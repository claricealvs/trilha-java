package models;

public class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else
			System.out.printf("\nNão foi possível sacar %.2f, pois o saldo está abaixo do valor de" 
			+ " saque!", valor);	
	}

	@Override
	public void consultarSaldo(Cliente cliente) {
		System.out.println("\nSaldo do(a) cliente " + cliente.getNome() + ": " + saldo);	
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.printf("\nValor depositado: %.2f ", valor);
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("na conta destinatária!");
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s, portador do CPF: %s",
		                   this.cliente.getNome(), this.cliente.getCpf()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

    @Override
    public void imprimirExtrato() {
        throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
    } 
}
