package salario;

public class INSS extends TemplateDeImpostoCondicional {

	private double inss;

	public double getInss() {
		return inss;
	}

	@Override
	public boolean deveUserFaixaUm(Salario salario) {
		return salario.getSalario() <= 1100;
	}

	@Override
	public double faixa1(Salario salario) {
		return salario.getSalario() * 0.075;
	}

	@Override
	public boolean deveUsarFaixaDois(Salario salario) {
		return salario.getSalario() <= 2203.48;
	}

	@Override
	public double faixa2(Salario salario) {
		return (salario.getSalario() * 0.09) - 16.50;
	}

	@Override
	public boolean deveUsarFaixaTres(Salario salario) {
		return salario.getSalario() <= 3305.22;
	}

	@Override
	public double faixa3(Salario salario) {
		return (salario.getSalario() * 0.12) - 82.60;
	}

	@Override
	public boolean deveUsarFaixaQuatro(Salario salario) {
		return salario.getSalario() <= 6433.57;
	}

	@Override
	public double faixa4(Salario salario) {
		return (salario.getSalario() * 0.14) - 148.71;
	}

	@Override
	public double faixa5(Salario salario) {
		return 751.98;
	}

//@Override
//public double calcular(Salario salario) {
//	if(salario.getSalario() < 1045) {
//		inss = salario.getSalario() * 0.075;
//	}else if(salario.getSalario() <= 2089.60) {
//		inss = (salario.getSalario() * 0.09) - 15.684;
//	}else if(salario.getSalario() <= 3134.40) {
//		inss = (salario.getSalario() * 0.12) - 78.378;
//	}else if(salario.getSalario() <= 6101.06){
//		inss = (salario.getSalario() * 0.14) - 141.068;
//	}else {
//		inss = 713.08;
//	}
//	return inss;
//}

}
