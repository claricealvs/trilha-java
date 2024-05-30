import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        int numero;
        String agencia, nomeCliente;
        Double saldo;

        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scan.next();

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scan.nextInt();

        System.out.print("Por favor, digite o seu saldo: ");
        saldo = scan.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, "
        + "sua agência é %s, conta %d e \nseu saldo %.2f já está disponível para saque!",
        nomeCliente, agencia, numero, saldo);

        scan.close();
    }
}
