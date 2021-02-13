package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaAluno {

	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno(1L, "Ana", 11, true));
		alunos.add(new Aluno(2L, "Darlene", 31, true));
		alunos.add(new Aluno(3L, "Elvis", 40, true));
		alunos.add(new Aluno(4L, "Louise", 42, true));
		alunos.add(new Aluno(5L, "Lais", 28, true));
		
		Curso curso = new Curso(1L, "Java");
		curso.adicionaAluno(alunos.get(2));
		curso.adicionaAluno(alunos.get(1));
		
		Curso curso2 = new Curso(1L, "JavaScript");
		curso2.adicionaAluno(alunos.get(0));
		curso2.adicionaAluno(alunos.get(3));
		curso2.adicionaAluno(alunos.get(4));
		
		List<Aluno> listaAlunos = new ArrayList<>(curso2.getAlunos());
		
		listaAlunos.sort(Comparator.comparing(Aluno::getNome).reversed());
		
		System.out.println(listaAlunos);
		
		Turma turma = new Turma(1L, "1A-2020");
		turma.adicionaCurso(curso);
		turma.adicionaCurso(curso2);
		
//		System.out.println(turma);
	}
	
}
