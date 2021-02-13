package gaveta;

public class Caixa {

	private Long codigoCaixa;
	private String descricao;
	private Terminal terminal;

	public Caixa() {
	}

	public Caixa(Long codigoCaixa, String descricao, Terminal terminal) {
		this.codigoCaixa = codigoCaixa;
		this.descricao = descricao;
		this.terminal = terminal;
	}

	public Long getCodigoCaixa() {
		return codigoCaixa;
	}

	public void setCodigoCaixa(Long codigoCaixa) {
		this.codigoCaixa = codigoCaixa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	@Override
	public String toString() {
		return "Caixa [codigoCaixa=" + codigoCaixa + ", descricao=" + descricao + ", terminal=" + terminal + "]";
	}
	
	
}
