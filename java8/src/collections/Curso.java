package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Curso {
	
	private Long id;
	private String nome;
	private List<Aluno> alunos;
	
	public Curso(Long id, String nome) {
		this.id = id;
		this.nome = nome;
		this.alunos = new ArrayList<>();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	public void adicionaAluno(Aluno aluno) {
		if(aluno == null) {
			throw new RuntimeException("Necessário um aluno.");
		}
		alunos.add(aluno);
	}
	
	public List<Aluno> getAlunos() {
		return Collections.unmodifiableList(alunos);
	}
	
	@Override
	public String toString() {
		return "[Curso: "+ nome + " Alunos: " + this.alunos + "]";
	}

}
