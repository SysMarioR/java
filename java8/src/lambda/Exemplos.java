package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exemplos {

	
	public static void main(String[] args) {
		
//		List<Integer> numeros = Arrays.asList(1,3,5,8,2,4);
//		
//		Optional<Integer> reduce = numeros.stream()
//			.filter(e -> e % 2 == 0)
//			.reduce((n1, n2) -> (n1 + n2));
//		
//		
//		System.out.println(reduce.get());
//			
		
		
		String data = "23/09/2020 10:44:00 horario de hoje";
		String[] dataPreFormatada = data.replaceAll("/", "-").split(" ");
		String[]s = dataPreFormatada[0].split("-");
		
		//System.out.println( s[2] + "-" + s[1] + "-" + s[0]);
		
		
		int maximo = 60;
		String texto = "23/09/2020 10:44:00 horario de hoje";
		String textoFormatado = String.format("%-"+maximo+"s", texto);
		char[] letras = textoFormatado.toCharArray();
		letras[10] = new Character('|');
		letras[19] = new Character('|');
		letras[38] = new Character('|');
		letras[55] = new Character('|');
		
		
		String minhaString = new String(letras);
		
		System.out.println(minhaString);
		
		String[] nova = minhaString.split("[|]");
		
		System.out.println(nova[3]);
	}


}

