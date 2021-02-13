package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		
		LocalDate meuAniversario = LocalDate.of(1978, Month.AUGUST, 23);
		LocalDate minhaSaida = LocalDate.of(1993, Month.AUGUST, 18);
		
		LocalDate exercicio = LocalDate.of(2099, Month.JANUARY, 25);
		
		
		Period difDatas = Period.between(hoje, exercicio);
		
		System.out.println(difDatas.getYears()+ ", "+ difDatas.getMonths()+ ", " + difDatas.getDays());
		
		Period periodo = Period.between(meuAniversario, minhaSaida);
		
		System.out.println(periodo.getYears()+" anos " + periodo.getMonths() + " meses e "+ periodo.getDays() + " dias.");
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
		
		
		LocalDateTime agora = LocalDateTime.now();
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(agora.format(formatadorComHoras));
		
		
	}

}
