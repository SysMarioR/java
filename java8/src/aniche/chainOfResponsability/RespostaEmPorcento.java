package aniche.chainOfResponsability;

public class RespostaEmPorcento implements Resposta{

	private Resposta outraReposta;

	public RespostaEmPorcento(Resposta outraReposta) {
		this.outraReposta = outraReposta;
	}
	
	public RespostaEmPorcento() {
		this.outraReposta = null;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		}else if(outraReposta != null){
			outraReposta.responde(req, conta);
		}else {
			throw new RuntimeException("Formato de resposta não encontrado.");
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraReposta = resposta;
		
	}

}
