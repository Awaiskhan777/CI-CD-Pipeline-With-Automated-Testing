package com.devops; 
 
import org.junit.jupiter.api.*; 
import static org.junit.jupiter.api.Assertions.*; 
 
class UnitTest { 
    private Calculator calculator; 
 
    @BeforeEach 
    void setUp() { 
        calculator = new Calculator(); 
    } 
 
    @Test 
    void testAdd() { 
        assertEquals(15, calculator.add(10, 5)); 
    } 
} 
