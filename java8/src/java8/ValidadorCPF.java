package java8;

public class ValidadorCPF {

	public static void main(String[] args) {



//		String cpfInformado = "614.245.873-87";
//		String cpfInformado = "546.471.429-49";
		String cpfInformado = "290.872.320-47";

		validaCPF(cpfInformado);

	}

	private static void validaCPF(String cpfInformado) {
		String cpfTratado = cpfInformado.replace(".", "");
		cpfTratado = cpfTratado.replace("-", "");

		String primeiroDigito = cpfTratado.substring(0, 9);
		String segundoDigito = cpfTratado.substring(0, 10);
		int total = 0;
		int total2 = 0;
		int d1 = 0;
		int d2 = 0;

		total = calculo(primeiroDigito);
		d1 = calculaResto(total);


		total2 = calculo(segundoDigito);

		d2 = calculaResto(total2);
		String cpfVerificado = primeiroDigito + d1 + d2;
		if(ehValido(cpfTratado, cpfVerificado)) {
			System.out.println("O CPF: " + cpfVerificado.substring(0,3)+ "."
										 + cpfVerificado.substring(3,6)+ "."
										 + cpfVerificado.substring(6,9)+ "-"
										 + cpfVerificado.substring(9,11)+" é válido.");
		}else{
			System.out.println("CPF inválido.");
		};
		
	}

	
	private static boolean ehValido(String informado, String verificado) {
		if (informado.equals(verificado)) {
			return true;
		} else {
			return false;
		}

	}

	private static int calculo(String cpf) {
		int aux = 0;
		int total = 0;
		if (cpf.length() == 9) {
			aux = 10;
		} else {
			aux = 11;
		}

		for (int i = 0; i < cpf.length(); i++) {
			int valor = cpf.charAt(i) - 48;
			total += valor * aux;
			aux--;
		}
		return total;
	}

	public static int calculaResto(int valor) {
		int resto = 11 - (valor % 11);

		if (resto == 10 || resto == 11) {
			return 0;
		} else {
			return resto;
		}

	}

}
