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
 * Clase para mostrar datos
 */
public class Mostrar {
    
    /**
     * 
     * @param total recibe el total de caracteres de uan frase
     * @return devuelve una cadena de caracteres diciendo cuantos caracteres hay en una frase
     */
    public String textoCaracteresTotal(int total) {
	
		return "el numero de caracteres es "+total;
		
	}
    
    /**
     * 
     * @param total recibe el total de palabras que tiene una cadena de caracteres
     * @return devuelve un string diciendo el numero de palabras que tiene esa cadena de caracteres
     */

    public String textoNumeroPalabras (int total) {
		return "el numero de palabras es "+total;
	}
    
    /**
     * 
     * @param total recibe un array de enteros 
     * @return devuelve un string diciendo cuantas veces se repite cada caracter de una cadena de caracteres
     */
    public String textoTodosCaracteres (int total[]) {
		String resultado ="";
		
		for(int i=0;i<cadena.length();i++) {
		resultado+= "el caracter "+cadena.charAt(i)+" se repite "+total[i]+" veces \n";
		}
		return resultado;
	}

   
}
