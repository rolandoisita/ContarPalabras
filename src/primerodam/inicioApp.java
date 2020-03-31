package primerodam;

import java.util.Scanner;

public class inicioApp {
	//static int nCaracteres=0;
	//static int nPalabras=0;
	static Scanner teclado =new Scanner(System.in); 
	//static char letras[];
	//static int nRepetido[];
	static String cadena;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introduzca la cadena");
		cadena=teclado.nextLine();
                Mostrar m1 = new Mostrar();
                Contador c1 = new Contador();
		System.out.println(m1.textoNumeroPalabras(c1.contarPalabras(cadena)));
		System.out.println(m1.textoCaracteresTotal(c1.contarCaracteresTotal(cadena)));
		System.out.println(m1.textoTodosCaracteres(c1.ContarRepetidos(cadena)));
		
		          
	}
	
	//ContarTodosCaracteres
	
	/*static void mostrarResultado(String a){
		contarPalabras(a);
		System.out.println("el numero de caracteres es: "+contarCaracteresTotal(a));
		System.out.println("el numero de palabras es: "+contarPalabras(a));
		for(int i =0;i<ContarRepetidos(a).length;i++) {
			if (ContarRepetidos(a)[i]!=32)
		System.out.println("el caracter "+a.charAt(i)+" esta "+ContarRepetidos(a)[i]+" veces");
		}
	}*/
	
	
	
	
}