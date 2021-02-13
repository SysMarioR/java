package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum ProgramasEventos {
	AUXILIO_FUNERAL("00003", "Auxilio Funeral"),
	AUXILIO_NATALIDADEL("00005", "Auxilio Natalidade"),
	AUXILIO_VULNERABILIDADE("00006", "Auxilio Vulnerabilidade");
	
	private String codigo;
	private String descricao;
	
	static List<ProgramasEventos> listaEnum = Arrays.asList(ProgramasEventos.values());	
	private static final Map<String, ProgramasEventos> MAP = new HashMap<>();
	
	static {
		listaEnum.forEach(e -> MAP.put(e.getCodigo(), e));
	}
	
	private ProgramasEventos(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	/*
	public static ProgramasEventos get(String codigo) {
		return MAP.get(codigo);
	}
	*/
	public static List<Object> listaProgramas(){
		return listaEnum.stream().map(r -> {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("codigo", MAP.get(r.getCodigo()).getCodigo());
			map.put("descricao", MAP.get(r.getCodigo()).getDescricao());
			return map;
		}).collect(Collectors.toList());
	}
	
	@Override
	public String toString() {
		return getCodigo() + " - " + getDescricao();
	}

	
public static class Principal {
	public static void main(String[] args) {
		
		listaProgramas().forEach(lista -> {
			System.out.println(lista.toString());
		});
		
	}
	
}
}