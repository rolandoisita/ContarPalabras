/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerodam;

import static primerodam.inicioApp.cadena;

/**
 *
 * @author alumno
 */
public class Contador {
    public int contarPalabras(String a){
		int nPalabras=0;
		for (int i=0;i<a.length();i++) {
			if (contarCaracteresTotal(a)!=0 && nPalabras==0)
		 		nPalabras=1;
		 	
		 	 if(a.charAt(i)==32 && contarCaracteresTotal(a)!=0) {
				nPalabras++;	
			}
		
		}
		return nPalabras;
		
	}
	public int contarCaracteresTotal(String a) {
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
	
	public int[] ContarRepetidos(String a) {
		
		int nRepetido[];
		nRepetido =new int[cadena.length()];
		for (int i=0;i<a.length();i++) {
		for(int k=0;k<a.length();k++) {	
			if (a.charAt(i)==a.charAt(k)) {
				nRepetido[i]++;
			}					
		}
		}return nRepetido;
		}
}
