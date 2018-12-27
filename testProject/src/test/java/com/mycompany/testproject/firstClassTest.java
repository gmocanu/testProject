/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gh
 */
public class firstClassTest {
    
    public firstClassTest() {
    }

    /**
     * Test of main method, of class firstClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        firstClass.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of generateString method, of class firstClass.
     */
    @Test
    public void testGenerateString() {
        System.out.println("generateString");
        String expResult = "Premier salut!!!!";
        String result = firstClass.generateString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
