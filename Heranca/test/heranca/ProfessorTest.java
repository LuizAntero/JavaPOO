/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package heranca;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class ProfessorTest {
    
    public ProfessorTest() {
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
     * Test of getEspecialidade method, of class Professor.
     */
    @Test
    public void testGetEspecialidade() {
        System.out.println("getEspecialidade");
        Professor instance = new Professor();
        String expResult = "";
        String result = instance.getEspecialidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEspecialidade method, of class Professor.
     */
    @Test
    public void testSetEspecialidade() {
        System.out.println("setEspecialidade");
        String especialidade = "";
        Professor instance = new Professor();
        instance.setEspecialidade(especialidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalario method, of class Professor.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Professor instance = new Professor();
        double expResult = 0.0;
        double result = instance.getSalario();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalario method, of class Professor.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        double salario = 0.0;
        Professor instance = new Professor();
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receberAume method, of class Professor.
     */
    @Test
    public void testReceberAume() {
        System.out.println("receberAume");
        double valor = 0.0;
        Professor instance = new Professor();
        instance.receberAume(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
