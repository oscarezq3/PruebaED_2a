/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebaed_2a_oscar;

import java.time.LocalDate;
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
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test 1 of compareTo method, of class Persona.
     */
    @Test
    public void testCompareTo1() {
        Persona p1 = new Persona(45632986, "Oscar", 'H', 1, 3, 2003);
        Persona p2 = new Persona(45632987, "Vanesa", 'M', 1, 9, 2005);
        
        assertEquals(-1, p1.compareTo(p2));
    }
    
    /**
     * Test 2 of compareTo method, of class Persona.
     */
    @Test
    public void testCompareTo2() {
        Persona p1 = new Persona(45632987, "Oscar", 'H', 1, 3, 2003);
        Persona p2 = new Persona(45632987, "Vanesa", 'M', 1, 9, 2005);
        
        assertEquals(0, p1.compareTo(p2));
    }
    
    /**
     * Test 3 of compareTo method, of class Persona.
     */
    @Test
    public void testCompareTo3() {
        Persona p1 = new Persona(45632988, "Oscar", 'H', 1, 3, 2003);
        Persona p2 = new Persona(45632987, "Vanesa", 'M', 1, 9, 2005);
        
        assertEquals(1, p1.compareTo(p2));
    }

    
}
