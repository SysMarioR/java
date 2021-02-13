package expressoes;

import java.util.Arrays;

public class Aluno {
	
	private String nome;
	private String sobrenome;
	private String email;
	private Integer pontos;
	private String telefone;
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getPontos() {
		return pontos;
	}


	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}


	public static boolean valida(Aluno aluno) {
		
		String nome = aluno.getNome();
		
		return nome.matches("[A-Z][a-z]{2,}");
							
		
//		if(nome.length() < 3) {return false;}
//		
//		for (int i = 0; i < nome.length(); i++) {
//			
//			if(!Character.isAlphabetic((nome.charAt(i)))) {
//				return false;
//			}
//		}
//		return true;
	}
	

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.setNome("Alex2016");
		
		if(valida(a)) {
			System.out.println("aluno "+ a.getNome() + " é válido.");
		}else {
			System.out.println("aluno "+ a.getNome() + " é inválido.");
		}
		
		String alunoRecebido = "Alex; alex.vieira@caelum.com.br;15000";
		
		Aluno aluno = new Aluno();
		
		String [] textoSeparado = alunoRecebido.split(";|;\\s");
		
		System.out.println(Arrays.toString(textoSeparado));
		
		aluno.setNome(textoSeparado[0]);
		aluno.setEmail(textoSeparado[1]);
		aluno.setPontos(Integer.parseInt(textoSeparado[2]));
		
		System.out.println(aluno.getNome() + " - " + aluno.getEmail() 
			+ " - "+ aluno.getPontos());
	}

}
