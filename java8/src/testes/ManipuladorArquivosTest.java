package testes;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import expressoes.Arquivo;
import expressoes.ManipuladorArquivos;

public class ManipuladorArquivosTest {

	@Test
	public void verificaQuantidadeDeArquivos() throws IOException {

		ManipuladorArquivos ma = new ManipuladorArquivos();
		File d = new File("//Users/mario/Documents/Anchieta");
		
		List<Arquivo> listarArquivo = ma.listarArquivos(d);

		long totalArquivos = listarArquivo.stream().filter(a -> !a.isDiretorio()).map(Arquivo::getNome).count();
		
		assertEquals(19, totalArquivos);
		
	}

}
