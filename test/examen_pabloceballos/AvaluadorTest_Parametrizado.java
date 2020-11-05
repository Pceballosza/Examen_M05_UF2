/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_pabloceballos;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author pceba
 */
@RunWith (Parameterized.class)
public class AvaluadorTest_Parametrizado {
    
    private Avaluador instance;
    private Estudiant instance2;
        
        
    @Parameterized.Parameter(0)
    public Estudiant alumne;

    @Parameterized.Parameter(1)
    public double media;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        Object[][] data = new Object[][] {

            {new Estudiant ("Pablo", 10, 10, 10), 10},
            {new Estudiant ("Manin", 5, 5, 5), 5},
            {new Estudiant ("Pepe", 6, 6, 6), 6},
            {new Estudiant ("Sech", 7, 7, 7), 7}, 
            {new Estudiant ("Joan", 8, 8, 8), 8},
            {new Estudiant ("Zhoila", 9, 9, 9), 9}, 
            {new Estudiant ("Maria", 5, 6, 7), 6},
            {new Estudiant ("Mariluz", 5, 5, 5), 5}, 
            {new Estudiant ("Fachiluz", 5, 6, 5), 5,33},
            {new Estudiant ("Poblo", 9, 9, 9), 9}, 
            {new Estudiant ("David", 8, 8, 8), 8},
            {new Estudiant ("Aurelio", 6, 6, 6), 6}, 
            {new Estudiant ("Lluc", 9, 9, 10), 9.33},
            {new Estudiant ("Joel", 8, 8, 8), 8}, 
            {new Estudiant ("Yoila", 5, 5, 5), 5} 
        };
        return Arrays.asList(data);
    }
            
       
    public AvaluadorTest_Parametrizado() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando test...");
    }
    
    @Before
    public void setUp() throws Exception {
        instance  =  new Avaluador(10, 0, 5);
        instance2 =  new Estudiant("Pablo", 10, 10, 10);
    }
    
    @After
    public void tearDown() {
        instance = null;
        instance2 = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        
        assertEquals(media, instance.mitjanaSiSupera(alumne), 1.0E-2);

    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
        public void testMitjana() throws Exception {
            assertEquals(media, instance.mitjana(alumne), 1.0E-2);}

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    @Ignore
    public void testMillorEstudiantPerNotaMitjana() {

    }
    
}
