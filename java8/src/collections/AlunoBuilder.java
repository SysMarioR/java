package collections;

public class AlunoBuilder {

	private Long id;
	private String nome;
	private Integer idade;
	private boolean ativo = false;

	public AlunoBuilder comId (Long id) {
		this.id = id;
		return this;
	}
	
	public AlunoBuilder comNome (String nome) {
		if(nome.isEmpty()) {
			throw new RuntimeException("Nome precisa ser digitado");
		}
		this.nome = nome;
		return this;
	}
	
	public AlunoBuilder comIdade(Integer idade) {
		if(idade == null || idade < 0) {
			throw new RuntimeException("Idade não pode ser negativa ou nula.");
		}
		this.idade = idade;
		return this;
	}
	
	public AlunoBuilder comSituacao(boolean situacao) {
		this.ativo = situacao; 
		return this;
	}
	
	public Aluno constroi() {
		return new Aluno(id, nome, idade, ativo);
	}
	
}
