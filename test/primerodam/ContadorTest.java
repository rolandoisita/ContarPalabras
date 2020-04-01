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

/**
 *
 * @author roly
 */
public class ContadorTest {
    
    public ContadorTest() {
    }
    /**
     * Prueba de la clase contador
     */
    @Test
    public void testContarPalabras() {
        Contador c1 = new Contador();
        int a[]=new int[4];
        a[0]=1;
        a[1]=1;
        a[2]=1;
        a[3]=1;
        
        /**
         * Probamos el metodo contarPalabras para ver que devuelve los resultados esperados
         */
        assertTrue(c1.contarPalabras("hola")==1);
        assertFalse(c1.contarPalabras("hola")!=1);
        
        /**
         * Probamos el metodo contarCaracteresTotal para ver que devuelve los resultados esperados
         */
        assertTrue(c1.contarCaracteresTotal("hola")==4);
        assertFalse(c1.contarCaracteresTotal("hola")!=4);
        
        /**
         * Probamos el metodos ContarRepetidos para ver que devuelve los resultados esperados
         */
        assertTrue(c1.ContarRepetidos("hola")==a);
        assertFalse(c1.ContarRepetidos("hola")!=a);
    }

    
    
}
