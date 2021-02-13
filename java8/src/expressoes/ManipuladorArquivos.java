package expressoes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ManipuladorArquivos {
	
	List<Arquivo> listaArquivo = new ArrayList<>();
	
	public List<Arquivo> listarArquivos(File d) throws IOException {
		File[] files = d.listFiles();
		if (files.length > 0) {
			for (int i = 0; i < files.length; i++) {
				
				Arquivo arquivo = new Arquivo();
				if (!files[i].isDirectory()) {
					arquivo.setNome(nomeArquivo(files[i].getName()));
					arquivo.setDiretorio(false);
					arquivo.setConteudoArquivo(Files.readAllBytes(files[i].toPath()));
					
				} else {
					arquivo.setNome(files[i].getName());
					arquivo.setDiretorio(true);
					listarArquivos(files[i].getAbsoluteFile());
				}
				arquivo.setExtensao(extensaoDoArquivo(files[i].getName()));
				arquivo.setCaminho(files[i].getAbsolutePath());
				arquivo.setDataModificacao(dataArquivo(files[i].getAbsolutePath()));
				arquivo.setTamanho(files[i].length());
				listaArquivo.add(arquivo);
				listaArquivo.sort(Comparator.comparing(Arquivo::getNome));
				
			}
		} else {
			
			System.out.println("Não há arquivos.");
		}
		return listaArquivo;
	}
	
	public String nomeArquivo(String name) {
		if (name.startsWith(".") || !name.contains(".")) {
			return name.substring(0);
		}
		return name.substring(0, name.lastIndexOf("."));
	}

	private LocalDateTime dataArquivo(String d) throws IOException {
		Path file = new File(d).toPath();
		BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
		return UtilDatas.converteFileTimeParaLocalDate(attr);
	}

	
	private static String extensaoDoArquivo(String nomeArquivo) {
		if (nomeArquivo.contains(".")) {
			return nomeArquivo.substring(nomeArquivo.lastIndexOf(".") + 1);
		}
		return "";
	}
	
	public void copiarArquivoParaOutroDiretorio(String origem, String destino) {
		File origin = new File(origem);
		File destin = new File(destino);
		try {
			FileUtils.copyFileToDirectory(origin, destin);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void moverArquivoParaOutroDiretorio(String arquivo, String diretorioDestino) {
		File file = new File(arquivo);
		if (!file.exists()) {
			System.out.println("Arquivo não encontrado.");
		} else {
			File destino = new File(diretorioDestino);
			boolean sucesso = file.renameTo(new File(destino, file.getName()));
			if (sucesso) {
				System.out.println("Arquivo movido para:  '" + destino.getAbsolutePath() + "'");
			} else {
				System.out.println("Erro ao mover arquivo: '" + file.getAbsolutePath() + " para "
						+ destino.getAbsolutePath() + "'");
			}
		}
	}
	
	public String visualizarConteudo(String nome, List<Arquivo> arquivos) {
		for (Arquivo arquivo : arquivos) {
			try {
				if(arquivo.getNome().equals(nome)) {
					return new String(arquivo.getConteudoArquivo());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null ;
	}

	public List<Arquivo> filtrados (String parametro, List<Arquivo> arquivos){
		List<Arquivo> retorno = new ArrayList<>();
		for (Arquivo arquivo : arquivos) {
			try {
				if(arquivo.getExtensao().equals(parametro)) {
					retorno.add(arquivo);
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}
		return retorno;
	}

}
