package teste;
import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {
	public static void main(String[] args) {

		// instanciando clientes e seus respectivos nomes e cpf's
		Cliente clarice = new Cliente();
		clarice.setNome("Clarice");
		clarice.setCpf("123456789-10");

		Cliente camila = new Cliente();
		camila.setNome("Camila");
		camila.setCpf("987654321-01");
		
		// instanciando uma conta de cada tipo para cada cliente
		Conta corrente = new ContaCorrente(clarice);
		Conta poupanca = new ContaPoupanca(camila);

		// depositando, sacando e consultando saldo da conta corrente
		corrente.depositar(300);
		corrente.sacar(200);
		corrente.consultarSaldo(clarice);

		corrente.transferir(100, poupanca);

		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}