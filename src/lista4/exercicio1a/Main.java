package lista4.exercicio1a;

import java.util.OptionalInt;

public class Main {

	public static void main(String[] args) {

		String teste = " ";
		System.out.println("Teste com orElse: " + verificarString(teste).orElse(22));

	}

	public static OptionalInt verificarString(String verString) {
		try {
			Integer nconvert = Integer.parseInt(verString);
			return OptionalInt.of(nconvert);
		} catch (Exception e) {
			return OptionalInt.empty();
		}
	}

}
