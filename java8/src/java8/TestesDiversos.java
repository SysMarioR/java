package java8;

import java.math.BigInteger;

public class TestesDiversos {
	
	public static void main(String[] args) {
		
		BigInteger cmc7 = new BigInteger("070001170180001505001100799574");
		
		System.out.println(cmc7);
		
		cmc7.toString();
		String nvCmc7 = String.format("%030d", cmc7);
		
		System.out.println(nvCmc7);
		
		
	}

}
