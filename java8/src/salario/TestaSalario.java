package salario;

public class TestaSalario {

	public static void main(String[] args) {
		
		Salario salario = new Salario(8500.00);
		INSS inss = new INSS();
		
		CalculaImposto calcula = new CalculaImposto();
		double valorInss = calcula.calcularImposto(salario, inss);
		System.out.println("Valor INSS: " + valorInss);
		
		IRPF irpf = new IRPF(valorInss);
		double valorIRPF = calcula.calcularImposto(salario, irpf);
		
		System.out.println("Valor IRPF: " + valorIRPF);
		Double valorSalario = salario.getSalario();
		System.out.println("Valor plano de saúde: 350,00");
		System.out.println("Líquido: " + (valorSalario - valorInss - valorIRPF - 350));
		
	}
}
