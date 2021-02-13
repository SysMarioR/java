package aniche.chainOfResponsability;

public class RespostaEmCsv implements Resposta {

	private Resposta outraReposta;

	public RespostaEmCsv(Resposta outraReposta) {
		this.outraReposta = outraReposta;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		}else {
			outraReposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraReposta = resposta;
		
	}

}
