package designPatterns;

public class TestesDeDescontos {
	
	public static void main(String[] args) {
		
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("CANETA", 250.00));
		orcamento.adicionaItem(new Item("LAPIS", 250.00));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
		
	}
}
