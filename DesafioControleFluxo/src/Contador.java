import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();

		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();

        terminal.close();

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
       if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
       }

        int contagem = parametroDois - parametroUm;

        System.out.println();
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
}
