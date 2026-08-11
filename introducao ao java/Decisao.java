public class Decisao {
	public static void main (String[] args) {
	//operadores logicos: && -> AND, || -> OR, ! -> NOT
	//relacionais: == -> igual, != -> diferente, >,<, <=, >=, = -> atribuicao
	//valores numericos se comparam com ==
	//Strings se comparam com "equals"
	
	if (args.length < 2) {
		
		
		System.out.println ("Precisa de 2 parâmetros");
		System.exit (0);
		
		
	}
	
	int val1 =  Integer.parseInt (args[0]); //converte String para int
	int val2 =  Integer.parseInt (args[1]);
	
	if ((val1 < 5) && (val2 != 2)) {
		
		System.out.println ("Entrou no if");
		
	}	
	
	else if (val2 < 5) {
	
		System.out.println ("Entrou no else if");
		
	}
	
	else {
	
	System.out.println ("Entrou no else");
		
	}
		
		
	
	}
	
}
