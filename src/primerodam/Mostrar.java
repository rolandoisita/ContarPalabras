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
public class Mostrar {
    public String textoCaracteresTotal(int total) {
	
		return "el numero de caracteres es "+total;
		
	}

	public String textoNumeroPalabras (int total) {
		return "el numero de palabras es "+total;
	}
	public String textoTodosCaracteres (int total[]) {
		String resultado ="";
		
		for(int i=0;i<cadena.length();i++) {
		resultado+= "el caracter "+cadena.charAt(i)+" se repite "+total[i]+" veces \n";
		}
		return resultado;
	}
}
