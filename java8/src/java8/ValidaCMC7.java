package java8;

public class ValidaCMC7 {

	public static void main(String[] args) {

//		String linhaCheque = "070006790187002605206700864017";
//		String linhaCheque = "756423870330001855900052800109";
		String linhaCheque = "001347740188505735511011535959";
		
		boolean resultado = validaCMC7(linhaCheque);
	
		

	}

	private static boolean validaCMC7(String linhaCheque) {
		String campo1 = linhaCheque.substring(0, 7);
		String campo2 = linhaCheque.substring(8, 18);
		String campo3 = linhaCheque.substring(19, 29);

		String dv1 = linhaCheque.substring(17, 18);
		String dv2 = linhaCheque.substring(7, 8);
		String dv3 = linhaCheque.substring(29, 30);

		System.out.println(campo1);
		System.out.println(dv1);
		System.out.println(campo2);
		System.out.println(dv2);
		System.out.println(campo3);
		System.out.println(dv3);

		boolean c1 = validaDV(campo1, dv1);
		boolean c2 = validaDV(campo2, dv2);
		boolean c3 = validaDV(campo3, dv3);
		
		if(!c1 || !c2 || !c3) {
			System.out.println("Error");
			return false;
		}else {
			System.out.println("Sucesso");
			return true;
		}
	}

	private static boolean validaDV(String campo, String dv) {

		int pesoPar = 2;
		int total = 0;
		int valor = 0;

		for (int i = 0; i < campo.length(); i++) {
			int aux = 0;
			if ((i % 2) == 0) {

				valor = campo.charAt(i) - 48;
				aux += valor;

			} else {
				valor = campo.charAt(i) - 48;
				aux += pesoPar * valor;

			}

			if (aux > 9) {
				aux = aux - 9;
			}

			total += aux;

		}

		total = 10 - (total % 10);
		total = (total % 10);

		int dv2 = dv.charAt(0) - 48;

		return dv2 == total;

	}

}
