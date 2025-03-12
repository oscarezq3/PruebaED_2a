/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebaed_2a_oscar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 34687
 */
public class CursoTest {
    
    public CursoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /**
     * Test 1 of aniadirAlumno method, of class Curso.
     */
    @Test
    public void testAniadirAlumno1() {
        Persona oscar = new Persona(17498869);
        Curso entornos = new Curso("entornos");
        
        entornos.aniadirAlumno(oscar);
    
        assertEquals(true, entornos.toString().contains("17498869-D"));
        
    }

    /**
     * Test 2 of aniadirAlumno method, of class Curso.
     */
    @Test
    public void testAniadirAlumno2() {
        Persona oscar = new Persona(17498869);
        Curso entornos = new Curso("entornos");
        
        entornos.aniadirAlumno(oscar);
    
        assertEquals(false, entornos.toString().contains("11111111-H"));
        
    }

}
