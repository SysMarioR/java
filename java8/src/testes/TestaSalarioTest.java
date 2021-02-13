package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import salario.CalculaImposto;
import salario.INSS;
import salario.Salario;

public class TestaSalarioTest {

	@Test
	public void verificaValorInss() {
		Salario salario = new Salario(8500.00);
		INSS inss = new INSS();
		
		CalculaImposto calcula = new CalculaImposto();
		double valorInss =  calcula.calcularImposto(salario, inss);
		
		assertEquals(valorInss, 751,98);
		
	
	}

	
}
