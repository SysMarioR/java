package aniche;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste {

	public static void main(String[] args) {
		
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("[yyyy-MM-dd HH:mm:ss]");
		String horaAtual = LocalDateTime.now().format(format).toString();
		System.out.println(horaAtual);
		
	}
	
}
