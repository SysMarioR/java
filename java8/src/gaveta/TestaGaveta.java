package gaveta;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class TestaGaveta {

	public static void main(String[] args) {
		
		Map<String, Object> gavetaNotas = new HashMap<String, Object>();

		TipoNumerario nrDois = new TipoNumerario(4L, "Dois Reais");
		TipoNumerario nrCinco = new TipoNumerario(5L, "Cinco Reais");
		TipoNumerario nrDez = new TipoNumerario(6L, "Dez Reais");
		TipoNumerario nrVinte = new TipoNumerario(7L, "Vinte Reais");
		TipoNumerario nrCinquenta = new TipoNumerario(8L, "Cinquenta Reais");
		TipoNumerario nrCem = new TipoNumerario(9L, "Cem Reais");
		TipoNumerario nrMoeda = new TipoNumerario(10L, "reais em moeda");

		Terminal terminal = new Terminal(1L, "Banco Teste", "10.0.0.29");
		Caixa caixa = new Caixa(1L, "caixa teste", terminal);

		GavetaDTO form = new GavetaDTO();
		form.setCem(4);
		form.setCinquenta(3);
		form.setVinte(2);
		form.setDez(3);
		form.setCinco(15);
		form.setDois(20);
		form.setMoeda(0.01);
		form.getVlTotal();

		if (form.getCem() != null && form.getCem() > 0) {
			Gaveta nota100 = new Gaveta();
			nota100.setCodigo(1L);
			nota100.setCaixa(caixa);
			nota100.setNrNumerario(100);
			nota100.setTipoNumerario(nrCem);
			nota100.setQtNotaNumerario(form.getCem());
			
			gavetaNotas.put("nrNumerario100", nota100.getNrNumerario());
			gavetaNotas.put("tipoNumerario100", nota100.getTipoNumerario());
			gavetaNotas.put("QtdNotas100", nota100.getQtNotaNumerario());

		}

		if (form.getCinquenta() != null && form.getCinquenta() > 0) {
			Gaveta nota50 = new Gaveta();
			nota50.setCodigo(1L);
			nota50.setCaixa(caixa);
			nota50.setNrNumerario(50);
			nota50.setTipoNumerario(nrCinquenta);
			nota50.setQtNotaNumerario(form.getCinquenta());
			
			gavetaNotas.put("nrNumerario50", nota50.getNrNumerario());
			gavetaNotas.put("tipoNumerario50", nota50.getTipoNumerario());
			gavetaNotas.put("QtdNotas50", nota50.getQtNotaNumerario());

		}

		if (form.getVinte() != null && form.getVinte() > 0) {
			Gaveta nota20 = new Gaveta();
			nota20.setCodigo(1L);
			nota20.setCaixa(caixa);
			nota20.setNrNumerario(20);
			nota20.setTipoNumerario(nrVinte);
			nota20.setQtNotaNumerario(form.getVinte());
			
			gavetaNotas.put("nrNumerario20", nota20.getNrNumerario());
			gavetaNotas.put("tipoNumerario20", nota20.getTipoNumerario());
			gavetaNotas.put("QtdNotas20", nota20.getQtNotaNumerario());

		}

		if (form.getDez() != null && form.getDez() > 0) {
			Gaveta nota10 = new Gaveta();
			nota10.setCodigo(1L);
			nota10.setCaixa(caixa);
			nota10.setNrNumerario(10);
			nota10.setTipoNumerario(nrDez);
			nota10.setQtNotaNumerario(form.getDez());
			
			gavetaNotas.put("nrNumerario10", nota10.getNrNumerario());
			gavetaNotas.put("tipoNumerario10", nota10.getTipoNumerario());
			gavetaNotas.put("QtdNotas10", nota10.getQtNotaNumerario());


		}

		if (form.getCinco() != null && form.getCinco() > 0) {
			Gaveta nota5 = new Gaveta();
			nota5.setCodigo(1L);
			nota5.setCaixa(caixa);
			nota5.setNrNumerario(5);
			nota5.setTipoNumerario(nrCinco);
			nota5.setQtNotaNumerario(form.getCinco());
			
			gavetaNotas.put("nrNumerario5", nota5.getNrNumerario());
			gavetaNotas.put("tipoNumerario5", nota5.getTipoNumerario());
			gavetaNotas.put("QtdNotas5", nota5.getQtNotaNumerario());

		}

		if (form.getDois() != null && form.getDois() > 0) {
			Gaveta nota2 = new Gaveta();
			nota2.setCodigo(1L);
			nota2.setCaixa(caixa);
			nota2.setNrNumerario(2);
			nota2.setTipoNumerario(nrDois);
			nota2.setQtNotaNumerario(form.getDois());
			
			gavetaNotas.put("nrNumerario2", nota2.getNrNumerario());
			gavetaNotas.put("tipoNumerario2", nota2.getTipoNumerario());
			gavetaNotas.put("QtdNotas2", nota2.getQtNotaNumerario());

		}

			if(form.getMoeda() > 0) {
				
				Gaveta moeda = new Gaveta();
				moeda.setCodigo(1L);
				moeda.setCaixa(caixa);
				moeda.setNrNumerario(1);
				moeda.setTipoNumerario(nrMoeda);
				moeda.setQtNotaNumerario(null);
				
				gavetaNotas.put("nrNumerarioM", moeda.getNrNumerario());
				gavetaNotas.put("tipoNumerarioM", moeda.getTipoNumerario());
				gavetaNotas.put("QtdNotasM", moeda.getQtNotaNumerario());

			}


		gavetaNotas.put("Data", LocalDateTime.now());
		gavetaNotas.put("Caixa", caixa.getCodigoCaixa());
		gavetaNotas.put("DataOperacao", LocalTime.now());


		
		System.out.println(form.getVlTotal());
		System.out.println(gavetaNotas);
		
		System.out.println(gavetaNotas.containsValue(caixa.getCodigoCaixa() == 1));

	}

}
