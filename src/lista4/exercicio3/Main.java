package lista4.exercicio3;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.Optional;


public class Main {

	public static void main(String[] args) {

		
		List<String> nomes = asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		Optional<String> testarChar = nomes.stream().filter(e -> e.startsWith("W")).findAny();	
		if (!testarChar.isPresent()) {
			System.out.println("Nomes com esta letra não consta na lista.");
		}else System.out.println(testarChar);		
		
	}
}
