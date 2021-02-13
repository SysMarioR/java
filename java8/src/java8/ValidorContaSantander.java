package java8;

public class ValidorContaSantander {
	
	public static void main(String[] args) {
		String agencia = "0189";
		String conta = "01017417-9";

	
		String contaTratada = agencia.concat("00").concat(conta.replace("-", ""));
		verificaSeContaEhValida(contaTratada);
		
	}

	private static void verificaSeContaEhValida(String contaTratada) {
		int peso[] = {9,7,3,1,0,0,9,7,1,3,1,9,7,3};
		int total = 0;

		
		for (int i = 0; i < contaTratada.length()-1; i++) {
			int num = contaTratada.charAt(i) - 48;
			
			int auxiliar = num * peso[i];
			if(auxiliar > 10) {
				auxiliar = desprezaDezena(auxiliar);
				
			}
			total += auxiliar;
		}
		
		int sobra = desprezaDezena(total);
		int digito = calculaDigitoDaConta(sobra);
		
		System.out.println("Digito da conta:  "+digito);
		String valida = contaTratada.substring(0,14);
		
		
		if(contaTratada.equals(valida+digito)) {
			System.out.println("Conta válida: "+ valida+digito);
		}else {
			System.out.println("Conta inválida");
		}
		
	}

	private static int calculaDigitoDaConta(int sobra) {
		int digito = 0;
		int dv = 10 - sobra;
		if(dv == 10 || dv == 0) {
			digito = 0;
		}else {
			digito = dv;
		}
		return digito;
	}

	private static Integer desprezaDezena(int valor) {
		String st = String.valueOf(valor).substring(1,2);
		return valor = Integer.parseInt(st);
		
	}

}
