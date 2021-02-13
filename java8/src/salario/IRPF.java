package salario;

public class IRPF extends TemplateDeImpostoCondicional {

	private double irpf;
	private double inss;
	private double valor;

	public IRPF(Double inss) {
		if(inss == null) {
			this.inss = 0.0;
		}else {
			this.inss = inss;
		}
	}

	public double getInss() {
		return inss;
	}
	
	private double getValor(Salario salario) {
		 this.valor = (salario.getSalario() - this.inss);
		 return valor;
	}
	
	@Override
	public boolean deveUserFaixaUm(Salario salario) {
		this.valor = getValor(salario);
		return valor < 1903.98;
	}


	@Override
	public double faixa1(Salario salario) {
		irpf = 0;
		return irpf;
	}

	@Override
	public boolean deveUsarFaixaDois(Salario salario) {
		this.valor = getValor(salario);
		return valor <= 2826.65;
	}

	@Override
	public double faixa2(Salario salario) {
		this.valor = getValor(salario);
		irpf = (valor * 0.075) - 142.80;
		return irpf;
	}

	@Override
	public boolean deveUsarFaixaTres(Salario salario) {
		this.valor = getValor(salario);
		return valor <= 3751.05;
	}

	@Override
	public double faixa3(Salario salario) {
		this.valor = getValor(salario);
		irpf = (valor * 0.15) - 354.80;
		return irpf;
	}

	@Override
	public boolean deveUsarFaixaQuatro(Salario salario) {
		this.valor = getValor(salario);
		return valor <= 4664.68;
	}

	@Override
	public double faixa4(Salario salario) {
		this.valor = getValor(salario);
		irpf = (valor * 0.225) - 636.13;
		return irpf;
	}

	@Override
	public double faixa5(Salario salario) {
		this.valor = getValor(salario);
		irpf = (valor * 0.275) - 869.36;
		return irpf;
	}

//	@Override
//	public double calcular(Salario salario) {
//		double valor = (salario.getSalario() - this.inss.getInss());
//		if(valor < 1903.98) {
//			irpf = 0;
//		} else if(valor <= 2826.65) {
//			irpf = (valor * 0.075) - 142.80;
//		} else if(valor <= 3751.05) {
//			irpf = (valor * 0.15) - 354.80;
//		} else if(valor <= 4664.68) {
//			irpf = (valor * 0.225) - 636.13;
//		} else {
//			irpf = (valor * 0.275) - 869.36;
//		}
//		return irpf;
//	}
	
}
