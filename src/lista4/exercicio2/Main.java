package lista4.exercicio2;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		String b = "9987";
		String c = "";
		
		System.out.println("Com valor usando orElseThrow :"
				+ verificarString(b).orElseThrow(() -> new NullPointerException("Valor vazio/incompatível para a convesão!")));
		System.out.println("Sem valor usando orElseThrow :"
				+ verificarString(c).orElseThrow(() -> new NullPointerException("Valor vazio/incompatível para a convesão!")));
		
	}

	public static Optional<Integer> verificarString(String verString) {
		try {
			Integer nconvert = Integer.valueOf(verString);
			return Optional.of(nconvert);
		} catch (Exception e) {
			return Optional.empty();
		}

	}

}
