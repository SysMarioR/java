package java8;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws ScriptException {

//		String alunoRecebido = "Mário Robert ; alex.vieira@caelum.com.br; 15000";
//		
//		System.out.println(alunoRecebido.substring(0,4));
//		
//		String[] textoSeparado = alunoRecebido.split(";\\s|;");
//											
//		
//		System.out.println(Arrays.toString(textoSeparado));
//		
//		System.out.println(textoSeparado[0]);
//		
//		System.out.println(textoSeparado[1]);
//		
//		System.out.println(Integer.parseInt(textoSeparado[2]));
//		

//		String nota = "1+5-3-1";
//
//		String[] somaAlterada = nota.split("\\+|\\-");
//		String[] subAlterada = nota.split("\\-");
//
//		System.out.println(Arrays.toString(somaAlterada));
//		
//		int totalsoma = 0;
//		for (int i = 0; i < somaAlterada.length; i++) {
//			totalsoma += Integer.parseInt(somaAlterada[i]);
//		}
//		
//		int totalsub = 0;
//		for (int i = 0; i < subAlterada.length; i++) {
//			totalsub += Integer.parseInt(subAlterada[i]);
//		}
//		
//		System.out.println(totalsoma);
//		System.out.println(totalsub);
		
		
		ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        // evaluate JavaScript code from String
        String expressao = "(1+5)*2";
        Object obj = engine.eval(expressao);
        System.out.println( obj );
		
        List<String> teste = new ArrayList<>();
        teste.add("Mário");
        teste.add("Gabrielly");

        teste.forEach(pessoas -> {
        	System.out.println(pessoas);
        });
        
        
        BigDecimal valor = new BigDecimal(1250.98);
        NumberFormat nf = NumberFormat.getInstance(new Locale ("pt", "BR"));
        
        
        System.out.println(nf.format(valor));
        
        
        
	}
}