package gaveta;

import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestaExpressao {

	public static void main(String[] args) throws ScriptException {

		String valor = "1+1+2+6+10+9+166+89+90+12+3+9+45+1+1+2+6+10+9+166+89+90+12+3+9+45";
		BigDecimal numero = new BigDecimal(retorna(valor));
		
		System.out.println(numero);
		
		}
	
	public static String retorna (String valor) throws ScriptException {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		Object obj = engine.eval(valor);
		return String.valueOf(obj);
		
		
		
	}

}
