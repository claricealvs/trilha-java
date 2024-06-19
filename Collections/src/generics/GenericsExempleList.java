package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
	public static void main(String[] args) {

		// Exemplo com Generics
		List<String> listaGenerics = new ArrayList<>();
		listaGenerics.add("Elemento 1");
		listaGenerics.add("Elemento 2");

		// Iterando sobre a lista com Generics
		for (String elemento : listaGenerics) {
			System.out.println(elemento);
		}

		System.out.println();

		// Imprimindo a lista com números na frente
        for (int i = 0; i < listaGenerics.size(); i++) {
            System.out.println((i + 1) + ". " + listaGenerics.get(i));
        }
	}
}
