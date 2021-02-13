package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
	
	private Long id;
	private String nome;
	private List<Curso> cursos;
	
	public Turma(Long id, String nome) {
		this.id = id;
		this.nome = nome;
		this.cursos = new ArrayList<>();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	public void adicionaCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public List<Curso> getCursos() {
		return Collections.unmodifiableList(cursos);
	}
	
	@Override
	public String toString() {
		return "Turma: "+ nome+ ", Cursos: "+ this.cursos;
	}
}
