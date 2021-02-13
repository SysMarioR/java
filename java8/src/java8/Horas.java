package java8;

import java.util.Calendar;
import java.util.Date;

public class Horas {
	
	public static void main(String[] args) {
		
		Date hoje = new Date();
		
//		System.out.println(hoje);
		Calendar hora = Calendar.getInstance();
		
		hora.setTime(hoje);
		hora.set(1970,0,1);
		
		System.out.println(hora.getTime());
		
		
	}

}
