package expressoes;

import java.time.LocalDateTime;

public class Arquivo {

	private String nome;
	private String extensao;
	private LocalDateTime dataModificacao;
	private String caminho;
	private double tamanho;
	private Boolean diretorio;
	private byte[] conteudoArquivo;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getExtensao() {
		return extensao;
	}
	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}
	public LocalDateTime getDataModificacao() {
		return dataModificacao;
	}
	public void setDataModificacao(LocalDateTime dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public Boolean isDiretorio() {
		return diretorio;
	}
	public void setDiretorio(Boolean diretorio) {
		this.diretorio = diretorio;
	}
	public byte[] getConteudoArquivo() {
		return conteudoArquivo;
	}
	public void setConteudoArquivo(byte[] conteudoArquivo) {
		this.conteudoArquivo = conteudoArquivo;
	}

}
