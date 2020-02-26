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
		System.out.println(textoNumeroPalabras(contarPalabras(cadena)));
		System.out.println(textoCaracteresTotal(contarCaracteresTotal(cadena)));
		
			System.out.println(textoTodosCaracteres(ContarRepetidos(cadena)));
		
		
	}
	
	static int contarPalabras(String a){
		int nPalabras=0;
		int pepe;
		for (int i=0;i<a.length();i++) {
			if (contarCaracteresTotal(a)!=0 && nPalabras==0)
		 		nPalabras=1;
		 	
		 	 if(a.charAt(i)==32 && contarCaracteresTotal(a)!=0) {
				nPalabras++;	
			}
		
		}
		return nPalabras;
		
	}
	static int contarCaracteresTotal(String a) {
		char letras[];
		letras =new char[a.length()];
		
		int nCaracteres=0;
		for (int i=0;i<a.length();i++) {
		 	int nCaracterRepeticion=0;
		 	letras[i]=a.charAt(i);
		 	
			if(a.charAt(i)!=32) {
				nCaracteres++;
			}
			}
		return nCaracteres;
		
		
	}
	
	static int[] ContarRepetidos(String a) {
		
		int nRepetido[];
		nRepetido =new int[cadena.length()];
		for (int i=0;i<a.length();i++) {
		for(int k=0;k<a.length();k++) {	
			if (a.charAt(i)==a.charAt(k)) {
				nRepetido[i]++;
			}					
		}
		}return nRepetido;
		}//ContarTodosCaracteres
	
	

	/*static void mostrarResultado(String a){
		contarPalabras(a);
		System.out.println("el numero de caracteres es: "+contarCaracteresTotal(a));
		System.out.println("el numero de palabras es: "+contarPalabras(a));
		for(int i =0;i<ContarRepetidos(a).length;i++) {
			if (ContarRepetidos(a)[i]!=32)
		System.out.println("el caracter "+a.charAt(i)+" esta "+ContarRepetidos(a)[i]+" veces");
		}
	}*/
	
	
	static String textoCaracteresTotal(int total) {
	
		return "el numero de caracteres es "+total;
		
	}

	static String textoNumeroPalabras (int total) {
		return "el numero de palabras es "+total;
	}
	static String textoTodosCaracteres (int total[]) {
		String resultado ="";
		
		for(int i=0;i<cadena.length();i++) {
		resultado+= "el caracter "+cadena.charAt(i)+" se repite "+total[i]+" veces \n";
		}
		return resultado;
	}
	
}