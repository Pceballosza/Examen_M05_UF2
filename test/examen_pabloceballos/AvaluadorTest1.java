/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_pabloceballos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

/**
 *
 * @author pceba
 */
public class AvaluadorTest1 {
    
        private Avaluador instance;
        private Estudiant instance2;
        private Estudiant instance3;
        private Estudiant array[] = new Estudiant[3];
        

      
          
        
    public AvaluadorTest1() {       
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando test...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests...");
    }
    
    @Before
    public void setUp() throws Exception {
        instance  =  new Avaluador(10, 0, 5);
        instance2 =  new Estudiant("Josep", 6, 10, 6);
        instance3 = new Estudiant("Pep", 10, 10, 10);
            array[0] = new Estudiant("Manin", 10, 9, 10);
            array[1] = new Estudiant("Sech", 7, 4, 6);
            array[2] = new Estudiant("Pablo", 5, 5, 6);        
    }
    
    @After
    public void tearDown() {
       instance = null;
       

    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(7.33, instance.mitjanaSiSupera(instance2), 1.0E-2);

        
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
  @Test
    public void testMitjana() throws Exception {
        assertEquals(8.33, instance.mitjana(instance2), 1.0E-2);
    }


    @Test
   // @Ignore
    public void testMillorEstudiantPerNotaMitjana() {
        assertEquals(array[0], instance.millorEstudiantPerNotaMitjana(array));
        
    }
    
}
