package java8;

public class ValidarCnpj {
	
	public static void main(String[] args) {
		
		
		String cnpjInformado ="14.572.457/0001-85";
		
		String cnpjTratatado = cnpjInformado.replace(".", "");
		cnpjTratatado = cnpjTratatado.replace("-", "");
		cnpjTratatado = cnpjTratatado.replace("/", "");
		String primeiroDigito = cnpjTratatado.substring(0, 12);
		
		String x = new StringBuilder(primeiroDigito).reverse().toString();
		int aux = 2;
		int valor=0;;
		
		for (int i = 0; i < x.length(); i++) {
			int num = x.charAt(i)-48;
			
			valor += num * aux;
			aux++;
			
			if(aux >= 10) {
				aux = 2;
			}
		}
		
		int resto = valor % 11;
		int d1 = 0;
		
		if(resto == 0 || resto == 1) {
			d1 = 0;
		}else {
			d1 = 11 - resto;
		}
		
		System.out.println(d1);
		
		String segundoDigito = primeiroDigito+d1;
		
		String y = new StringBuilder(segundoDigito).reverse().toString();
		int aux2 = 2;
		int valor2 = 0;
		
		for (int i = 0; i < y.length(); i++) {
			int num = y.charAt(i)-48;
			
			valor2 += num * aux2;
			aux2++;
			
			if(aux2 >= 10) {
				aux2 = 2;
			}
		}
		
		int resto2 = valor2 % 11;
		int d2 = 0;
		
		if(resto2 == 0 || resto2 == 1) {
			d2 = 0;
		}else {
			d2 = 11 - resto2;
		}
		System.out.println(d2);
		

	}

}
