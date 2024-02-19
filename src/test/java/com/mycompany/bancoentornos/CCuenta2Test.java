/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.bancoentornos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno Tarde
 */
public class CCuenta2Test {
    
    public CCuenta2Test() {
    }



    @Test
    public void testIngresar() {
        System.out.println("ingresar");
        double cantidad = 5.0;
        CCuenta instance = new CCuenta();
        int expResult = 95;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

   
}
