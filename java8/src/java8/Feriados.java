package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Feriados {

	public static void main(String[] args) {

		LocalDateTime hoje = LocalDateTime.now();

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		System.out.println(hoje.format(formatador));

		int ano = 2020;
		int mes = 6;

		YearMonth anoMes = YearMonth.of(ano, mes);

		Set<LocalDate> listaDosDiasUteisDoMes = new HashSet<>();
		Set<LocalDate> feriados = new HashSet<>();
		feriados.addAll(getFeriadosMoveis(ano));
		feriados.addAll(getFeriadosFixos(ano));

		for (int dia = 1; dia <= anoMes.lengthOfMonth(); dia++) {
			LocalDate data = anoMes.atDay(dia);

			if (data.getDayOfWeek() != (DayOfWeek.SATURDAY) && data.getDayOfWeek() != (DayOfWeek.SUNDAY)
					&& !feriados.contains(data)) {

				listaDosDiasUteisDoMes.add(data);

			}
		}
		
		System.out.println("Feriados do ano" + feriados);

	
	}

	// calcula páscoa, carnaval, corpus christi e sexta-feira santa
	public static Set<LocalDate> getFeriadosMoveis(int year) {
		Set<LocalDate> dates = new HashSet<>();

		LocalDate pascoa;
		LocalDate carnaval;
		LocalDate corpusChristi;
		LocalDate sextaFeiraSanta;

		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (b + 8) / 25;
		int g = (b - f + 1) / 3;
		int h = (19 * a + b - d - g + 15) % 30;
		int i = c / 4;
		int k = c % 4;
		int l = (32 + 2 * e + 2 * i - h - k) % 7;
		int m = (a + 11 * h + 22 * l) / 451;
		int month = (h + l - 7 * m + 114) / 31;
		int day = ((h + l - 7 * m + 114) % 31) + 1;

		pascoa = LocalDate.of(year, month, day);

		// Carnaval 47 dias antes da pascoa (sempre cai na terça)
		carnaval = pascoa.minusDays(47);

		// CorpusChristi 60 dias apos a pascoa
		corpusChristi = pascoa.plusDays(60);

		sextaFeiraSanta = pascoa.minusDays(2);

		// páscoa cai sempre no domingo, entao não precisaria adicionar como feriado
		// dates.add(pascoa);

		// carnaval: adicionar um dia antes e depois (emenda de segunda e quarta-feira
		// de cinzas)
		dates.add(carnaval);
		//dates.add(carnaval.minusDays(1)); // emenda a segunda-feira
		//dates.add(carnaval.plusDays(1)); // quarta-feira de cinzas

		// corpus christi, emendar (adicionar a sexta)
		dates.add(corpusChristi);
		// if apenas para confirmar se é quinta-feira
		if (corpusChristi.getDayOfWeek() == DayOfWeek.THURSDAY) {
			dates.add(corpusChristi.plusDays(1)); // adicionar a sexta-feira
		}

		dates.add(sextaFeiraSanta);

		return dates;
	}
	
	public static Set<LocalDate> getFeriadosFixos(int year){
		Set<LocalDate> dates = new HashSet<>();
		
		//Confraternização Universal
		dates.add(LocalDate.of(year, 1, 1));
		
		//Tiradentes
		dates.add(LocalDate.of(year, 4, 21));
		
		//Dia do Trabalhador
		dates.add(LocalDate.of(year, 5, 1));
		
		// 7 de setembro
		dates.add(LocalDate.of(year, 9, 7));
		
		//12 de outubro
		dates.add(LocalDate.of(year, 10, 12));
		
		//2 de novembro Finados
		dates.add(LocalDate.of(year, 11, 2));

		//15 de novembro Proclamação da República
		dates.add(LocalDate.of(year, 11, 15));
		
		//25 de dezembro Natal
		dates.add(LocalDate.of(year, 12, 25));
		
		return dates;
	}
	
	
}
