package java8;

public class ValidadorCMC7Novo {
	
	public static void main(String[] args) {
		
		
//		String linhaCheque = "070006790187002605206700864017";
//		String linhaCheque = "756423870330001855900052800109";
//		String linhaCheque = "001347740188505735511011535959";
		String linhaCheque = "070001170180001505001100799574";
//		String linhaCheque = "070001120180008415001100799574";
		
		boolean resultado = validaCMC7(linhaCheque);
		
		System.out.println(resultado);
		
		/*
		BigInteger cheque = new BigInteger("70006790187002605206700864017");
		String cheque2 = cheque.toString().format("%030d", cheque);
		
		System.out.println(cheque2); 
		System.out.println(cheque2.length()); 
		*/
		
	
	}


	private static boolean validaCMC7(String linhaCheque) {

		String campo1 = linhaCheque.substring(0, 7);
		String campo2 = linhaCheque.substring(8, 18);
		String campo3 = linhaCheque.substring(19, 29);

		System.out.println(campo1);
		System.out.println(campo2);
		System.out.println(campo3);
		
		String dv1 = linhaCheque.substring(18, 19);
		String dv2 = linhaCheque.substring(7, 8);
		String dv3 = linhaCheque.substring(29, 30);
		
		//System.out.println(dv1);
		//System.out.println(dv2);
		//System.out.println(dv3);
		
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
		
		//return true;
	}

	private static boolean validaDV(String campo, String dv) {
		int peso = 2;
		int soma = 0;
		String y = new StringBuilder(campo).reverse().toString();

		for (int i = 0; i < y.length(); i++) {
			int aux = 0;
			int valor = y.charAt(i) - 48;
			
			aux = (peso * valor);
			
			if(aux > 9) {
				aux = (aux - 9);
			}
			soma += aux;
			peso++;
			peso = peso > 2 ? peso = 1 : peso; 
		
		}
		//System.out.println(soma);
		int digito = (soma % 10);
		if(digito != 0) {
			digito = 10 - digito; 
		}else {
			digito = 0;
		}

		int dv2 = Integer.parseInt(dv);
		System.out.println(digito);
		return digito == dv2;
	}

}
