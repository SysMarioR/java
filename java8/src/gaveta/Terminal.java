package gaveta;

public class Terminal {

	private Long codigo;
	private String descricao;
	private String ipTerminal;
	private Integer numero;

	public Terminal() {
	}

	public Terminal(Long codigo, String descricao, String ipTerminal) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.ipTerminal = ipTerminal;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIpTerminal() {
		return ipTerminal;
	}

	public void setIpTerminal(String ipTerminal) {
		this.ipTerminal = ipTerminal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Terminal [descricao=" + descricao + ", ipTerminal=" + ipTerminal + "]";
	}
	
	

}
