package expressoes;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainTeste {
	
	private static String caminho = "//Users/mario/Downloads/BRK";
	private final static float tamanhoEmBytes = 1024;

	public static void main(String[] args) throws IOException {

		ManipuladorArquivos ma = new ManipuladorArquivos();
		File d = new File(caminho);

		if (d.exists()) {
			List<Arquivo> listarArquivo = ma.listarArquivos(d);

			long totalArquivos = listarArquivo.stream().filter(a -> a.isDiretorio()).map(Arquivo::getNome).count();
			System.out.println("Total de arquivos: " + totalArquivos);

			listarArquivo.stream().forEach(a -> System.out.println(a.getCaminho()));
			
//			listarArquivo.stream().forEach(a -> {
//				System.out.println(a.getNome() + " - " + UtilDatas.formatadorComHoras(a.getDataModificacao()) + " - "
//						+ Math.ceil(a.getTamanho() / tamanhoEmBytes) + " KB ");
//			});
//			
			//System.out.println(visualizarConteudo("query_padrao_pso",listaArquivo));
			System.out.println("======================================");
//			List<Arquivo> filtrados = ma.filtrados("sql",listarArquivo);
//			listarArquivo.stream()
//					.filter(f -> f.isDiretorio())
//					.map(Arquivo::getNome)
//					.forEach(System.out::println);
			
		} else {
			System.out.println("Diretório não existe.");
		}

		// moverArquivoParaOutroDiretorio(caminho+"//hosts",
		// "//Users/mario/Documents/BRB");
		// copiarArquivoParaOutroDiretorio(caminho+"//hosts",
		// "//Users/mario/Documents/BRB");
	}

	
	
	
//	String url = "DF/Brasilia";
//	String[] param = url.split("/");
//	Map<String, String> params = new HashMap<>();
//	params.put("uf", param[0]);
//	params.put("cidade", param[1]);
//	
//	for (Entry<String, String> key : params.entrySet()) {
//		System.out.println(key);
//	}
}
