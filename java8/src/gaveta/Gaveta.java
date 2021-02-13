package gaveta;

import java.time.LocalDateTime;

public class Gaveta {

	private Long codigo;
	private LocalDateTime data = LocalDateTime.now();
	private Integer nrNumerario;
	private Integer qtNotaNumerario;
	private TipoNumerario tipoNumerario;
	private Caixa caixa;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Integer getNrNumerario() {
		return nrNumerario;
	}

	public void setNrNumerario(Integer nrNumerario) {
		this.nrNumerario = nrNumerario;
	}

	public Integer getQtNotaNumerario() {
		return qtNotaNumerario;
	}

	public void setQtNotaNumerario(Integer qtNotaNumerario) {
		this.qtNotaNumerario = qtNotaNumerario;
	}

	public TipoNumerario getTipoNumerario() {
		return tipoNumerario;
	}

	public void setTipoNumerario(TipoNumerario tipoNumerario) {
		this.tipoNumerario = tipoNumerario;
	}

	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	@Override
	public String toString() {
		return "Gaveta [codigo=" + codigo + ", data=" + data + ", nrNumerario=" + nrNumerario + ", qtNotaNumerario="
				+ qtNotaNumerario + ", tipoNumerario=" + tipoNumerario + ", caixa=" + caixa + "]";
	}
	
	

}
