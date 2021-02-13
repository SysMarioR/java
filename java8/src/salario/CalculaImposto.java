package salario;

public class CalculaImposto {
	
	public double calcularImposto(Salario salario, Imposto imposto) {
		double valor = imposto.calcular(salario);
//		System.out.println(valor);
		return valor;
	}

}
