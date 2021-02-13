package reflections;

public class Teste {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<Controle> controleClasse1 = Controle.class;
		
		Controle controle = new Controle();
		Class<? extends Controle> controleClasse2 = controle.getClass();
		
		
		Class<?> controleClasse3 = Class.forName("reflections.Controle");
		
		Object objControle = controleClasse3.newInstance();
		
		System.out.println(objControle instanceof Controle);
			
	
		
		Controle objetoControle = controleClasse1.newInstance();
		
		System.out.println(objetoControle instanceof Controle);
		
		
		String url = "/produto/1";
		
		String[] path = url.replaceFirst("/", "").split("/");
		
		String caminho = Character.toUpperCase(path[0].charAt(0))+path[0].substring(1);
		
		
		System.out.println(caminho + path[1]);
	}
}
