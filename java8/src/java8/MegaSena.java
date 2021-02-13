package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MegaSena {

	public static void main(String[] args) {

		int numeros1[] = new int[6];

		for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = new Random().nextInt(60) + 1;
		}

		Arrays.sort(numeros1);
		System.out.println("***************************************************");
		System.out.println(Arrays.toString(numeros1));
		System.out.println("");

		System.out.println("***************************************************");
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		while(numeros.size() < 6) {
			int numero = new Random().nextInt(60) + 1;
			if(!numeros.contains(numero)) {
				numeros.add(numero);
			}
		}
		Collections.sort(numeros);
		System.out.println(numeros);

	}

}
