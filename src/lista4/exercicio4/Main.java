package lista4.exercicio4;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<String> nomes = asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		Optional<String> ver = Optional.of(nomes.stream().filter(e -> e.startsWith("W")).findAny()
				.orElseThrow(() -> new NullPointerException("Nomes com esta letra não consta na lista.")));
		System.out.println(ver.get());
	}
}
