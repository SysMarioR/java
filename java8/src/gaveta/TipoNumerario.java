package gaveta;

public class TipoNumerario {

	private Long codigo;
	private String descricao;

	public TipoNumerario() {
		
	}
	
	TipoNumerario(Long codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
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

	@Override
	public String toString() {
		return "TipoNumerario [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
	
	

}
