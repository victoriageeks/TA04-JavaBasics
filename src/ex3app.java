
public class ex3app {

	public static void main(String[] args) {
		/*Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. A continuació´n muestra por pantalla:*/
		int X = 10;
		int Y = 7;
		double N = 5.50;
		double M = 2.70;
		System.out.println("Valor X = "+X);
		System.out.println("Valor Y = "+Y);
		System.out.println("Valor N = "+N);
		System.out.println("Valor M = "+M);
		
		System.out.println("Operaciones con las variables X y Y");
		System.out.println(X+" + "+Y+" = "+(X+Y));
		System.out.println(X+" - "+Y+" = "+(X-Y));
		System.out.println(X+" * "+Y+" = "+(X*Y));
		System.out.println(X+" / "+Y+" = "+(X/Y));
		System.out.println(X+" % "+Y+" = "+(X%Y));
		
		System.out.println("Operaciones con las variables N y M");
		System.out.println(N+" + "+M+" = "+(N+M));
		System.out.println(N+" - "+M+" = "+(N-M));
		System.out.println(N+" * "+M+" = "+(N*M));
		System.out.println(N+" / "+M+" = "+(N/M));
		System.out.println(N+" % "+M+" = "+(N%M));
		
		System.out.println("El valor doble de X es = "+(X*2));
		System.out.println("El valor doble de Y es = "+(Y*2));
		System.out.println("El valor doble de N es = "+(N*2));
		System.out.println("El valor doble de M es = "+(M*2));
		
		System.out.println("La suma de todas las variables es = "+(X+Y+N+M));
		System.out.println("El producto de todas las variables es = "+(X*Y*N*M));
		
	}

}
