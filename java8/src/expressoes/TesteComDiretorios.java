package expressoes;

import java.io.File;

public class TesteComDiretorios {
	private static String caminho = "//Users/mario/Downloads/BRK";
	public static void main(String[] args) {
		File d = new File(caminho);

		if (d.exists()) {
			listarArquivos(d);

	}

}
	private static void listarArquivos(File d) {
		File[] files = d.listFiles();
		if (files.length > 0) {
			for (int i = 0; i < files.length; i++) {
				if(files[i].isDirectory()) {
					listarArquivos(files[i].getAbsoluteFile());
				}
					System.out.println(files[i]);
			}
		} else {
			
			System.out.println("Não há arquivos.");
		}
		
	}
}