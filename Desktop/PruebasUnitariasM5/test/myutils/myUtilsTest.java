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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
