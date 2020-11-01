import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private static Fibonacci fibo  = null;

    @BeforeEach
    void setUp() {
        System.out.println("Before test...\n");
        int lengthSequence = 11;
        fibo = new Fibonacci(lengthSequence);
    }

    @AfterEach
    void tearDown() {
        System.out.println("\nAfter test...");
    }

//    @Test
//    void getN() {
//        int num = 11;
//        int expected = 89;
//        System.out.println("N-th number in Fibonacci's sequence = " + num);
//        System.out.println("Expected number in Fibonacci's sequence = " + expected);
//        assertEquals(expected, fibo.getN(num));
//    }

    @Test
    void generateSequence() {
        System.out.println("Length of Fibonacci's sequence = " + fibo.lengthSequence);
        System.out.println("Expected = 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ");
        int expected[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        assertArrayEquals(expected, fibo.generateSequence());
    }

    @Test()
    void getN() {
        int num = 11;
        int expected = 89;
        System.out.println("N-th number in Fibonacci's sequence = " + num);
        System.out.println("Expected number in Fibonacci's sequence = " + expected);
        assertEquals(expected, fibo.getN(num));
//        Assertions.assertThrows(ArithmeticException.class, () -> {
//            int num = -11;
//            int expected = 89;
//            System.out.println("N-th number in Fibonacci's sequence = " + num);
//            System.out.println("Expected number in Fibonacci's sequence = " + expected);
//            assertEquals(expected, fibo.getN(num));
//        });
    }
}