
public class ex5app {

	public static void main(String[] args) {
		/*Programa java que declare cuatro variables enteras A,B,C y D y asígnale un valor a cada una. A continuación realiza las instrucciones necesarias para que:*/
		int A=10;
		int B=7;
		int C=15;
		int D=21;
		B=C;
		C=A;
		A=D;
		D=B;
		System.out.println("B toma el valor de C = "+B);
		System.out.println("C toma el valor de A = "+C);
		System.out.println("A toma el valor de D = "+A);
		System.out.println("D toma el valor de B = "+D);
		

	}

}
