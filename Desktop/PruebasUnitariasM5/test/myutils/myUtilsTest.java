    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author justin
 */
public class myUtilsTest {
    
    public myUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inverteix method, of class myUtils.
     */
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "Hola";
        String expResult = "aloH";
        String result = myUtils.inverteix(cadena);
        assertEquals(expResult, result);
        
        
          String cadena2 = "Adios";
        String expResult2 = "soidA";
        String result2 = myUtils.inverteix(cadena2);
        assertEquals(expResult2, result2);
        
        
        
        
          String cadena3 = "Justin";
        String expResult3 = "nitsuJ";
        String result3 = myUtils.inverteix(cadena3);
        assertEquals(expResult3, result3);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of edat method, of class myUtils.
     */
    @Test
    public void testEdat() {
        System.out.println("edat");
        int day = 30;
        int month = 50;
        int year = 1800;
        int expResult = -2;
        int result = myUtils.edat(day, month, year);
        assertEquals(expResult, result);
        
        
        int day2 = 12;
        int month2 = 28;
        int year2 = 1800;
        int expResult2 = -2;
        int result2 = myUtils.edat(day2, month2, year2);
        assertEquals(expResult2, result2);
        
        
        int day3 = 25;
        int month3 = 45;
        int year3 = 2500;
        int expResult3 = -2;
        int result3 = myUtils.edat(day3, month3, year3);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class myUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = 5;
        double expResult = 120;
        double result = myUtils.factorial(numero);
        assertEquals(expResult, result, 0.0);
        
        //Test 2
        double numero2 = 6;
        double expResult2 = 720;
        double result2 = myUtils.factorial(numero2);
        assertEquals(expResult2, result2, 0.0);
        
        //Test3
         double numero3 = -30;
        double expResult3 = -1;
        double result3 = myUtils.factorial(numero3);
        assertEquals(expResult3, result3, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
