package lista4.exercicio1b;

import java.util.Optional;
import java.util.OptionalInt;

public class Main {

	public static void main(String[] args) {
		String b = "56";
		String c = "";
		Optional<Integer> n = verificarString(b);
		Optional<Integer> n2 = verificarString(c);	
		System.out.println("Com valor usando orElse: " + n.orElse(22));
		System.out.println("Sem valor usando orElse: " + n2.orElse(22));
		System.out.println("Com valor usando orElseGet: " + n.orElseGet(() -> 22));
		System.out.println("Sem valor usando orElseGet: " + n2.orElseGet(() -> 22));
		
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
