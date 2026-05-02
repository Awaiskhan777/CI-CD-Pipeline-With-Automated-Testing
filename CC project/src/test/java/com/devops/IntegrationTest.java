package com.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegrationTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @DisplayName("Integration: Multiple Operations Chain")
    void testMultipleOperations() {
        // Test a chain of operations
        int result = calculator.add(10, 5);      // 15
        result = calculator.multiply(result, 2);  // 30
        result = calculator.subtract(result, 10); // 20
        result = calculator.divide(result, 5);    // 4
        
        assertEquals(4, result);
    }
    
    @Test
    @DisplayName("Integration: Complex Business Logic")
    void testComplexCalculation() {
        // Simulate a real-world calculation
        int price = 100;
        int tax = calculator.multiply(price, 10);
        tax = calculator.divide(tax, 100);  // 10% tax = 10
        int total = calculator.add(price, tax);  // Total = 110
        
        assertEquals(110, total);
    }
    
    @Test
    @DisplayName("Integration: Batch Processing")
    void testBatchProcessing() {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        
        for (int num : numbers) {
            sum = calculator.add(sum, num);
        }
        
        assertEquals(150, sum);
        
        int product = 1;
        for (int num : numbers) {
            product = calculator.multiply(product, num);
        }
        
        assertEquals(12000000, product);
    }
}