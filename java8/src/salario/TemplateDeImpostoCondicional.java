package salario;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcular(Salario salario) {
		
		if(deveUserFaixaUm(salario)) {
			return faixa1(salario);
			
		}else if(deveUsarFaixaDois(salario)){
			return faixa2(salario);
			
		}else if(deveUsarFaixaTres(salario)){
			return faixa3(salario);
			
		}else if (deveUsarFaixaQuatro(salario)){
			return faixa4(salario);
			
		}else {
			return faixa5(salario);
		}
	}


	public abstract boolean deveUserFaixaUm(Salario salario);
	public abstract double faixa1(Salario salario);

	public abstract boolean deveUsarFaixaDois(Salario salario);
	public abstract double faixa2(Salario salario);

	public abstract boolean deveUsarFaixaTres(Salario salario);
	public abstract double faixa3(Salario salario);

	public abstract boolean deveUsarFaixaQuatro(Salario salario);
	public abstract double faixa4(Salario salario);
	
	public abstract double faixa5(Salario salario);

	
	

	
	

	

}
