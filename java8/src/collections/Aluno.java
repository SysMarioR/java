package collections;

public class Aluno {

	private Long id;
	private String nome;
	private Integer idade;
	private boolean ativo;

	public Aluno(Long id, String nome, Integer idade, boolean ativo) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.ativo = ativo;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public boolean isAtivo() {
		return ativo;
	}
	
	@Override
	public String toString() {
		return "[ Id: "+ id + ", Nome: "+ nome + " ]";
	}
}
