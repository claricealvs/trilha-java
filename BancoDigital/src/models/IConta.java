package models;

public interface IConta {

	void sacar(double valor);
	public void consultarSaldo(Cliente cliente);
	void depositar(double valor);
	void transferir(double valor, IConta contaDestino);
	void imprimirExtrato();    
}
