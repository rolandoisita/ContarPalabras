/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerodam;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static primerodam.inicioApp.cadena;

/**
 *
 * @author roly
 */
public class MostrarTest {
    
    public MostrarTest() {
    }
    
    

   
    @Test
    public void testTextoCaracteresTotal() {
        Mostrar m1 = new Mostrar();
        String cadena ="hola";
        
        assertEquals("el numero de caracteres es 4",m1.textoCaracteresTotal(cadena.length()));
        
        
        assertEquals("el numero de palabras es 1",m1.textoNumeroPalabras(1));
        
        
        
        
        
    }

    
}
