package aniche.chainOfResponsability;

public class RespostaEmXml implements Resposta{

	private Resposta outraReposta;

	public RespostaEmXml(Resposta outraReposta) {
		this.outraReposta = outraReposta;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() +"</saldo></conta>");
		}else {
			outraReposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraReposta = resposta;
		
	}

}
