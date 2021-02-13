package salario;

public class TestaSalario {

	public static void main(String[] args) {
		
		Salario salario = new Salario(9000.00);
		INSS inss = new INSS();
		
		CalculaImposto calcula = new CalculaImposto();
		double valorInss = calcula.calcularImposto(salario, inss);
		System.out.println("INSS: " + valorInss);
		
		IRPF irpf = new IRPF(valorInss);
		double valorIRPF = calcula.calcularImposto(salario, irpf);
		
		System.out.println("IRPF: " + valorIRPF);
		Double valorSalario = salario.getSalario();
		System.out.println("Liquido: " + (valorSalario - valorInss - valorIRPF - 350));
		
	}
}
