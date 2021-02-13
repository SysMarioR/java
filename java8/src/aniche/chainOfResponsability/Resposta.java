package aniche.chainOfResponsability;

public interface Resposta {
	
	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta resposta);

}
