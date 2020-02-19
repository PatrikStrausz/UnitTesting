package sk.itsovy.strausz.project.unit.testing.test;

import sk.itsovy.strausz.project.unit.testing.MyMath;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

class MyMathTest {

    private MyMath myMath;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myMath = new MyMath();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isPrimeNumber() {
        assertTrue(myMath.isPrimeNumber(5));
        assertTrue(myMath.isPrimeNumber(2));
        assertTrue(myMath.isPrimeNumber(3));
        assertTrue(myMath.isPrimeNumber(47));
        assertTrue(myMath.isPrimeNumber(7));
        assertTrue(myMath.isPrimeNumber(997));
        assertTrue(myMath.isPrimeNumber(89));
        assertTrue(myMath.isPrimeNumber(31));

        assertFalse(myMath.isPrimeNumber(0));
        assertFalse(myMath.isPrimeNumber(1));
        assertFalse(myMath.isPrimeNumber(4));
        assertFalse(myMath.isPrimeNumber(9));
        assertFalse(myMath.isPrimeNumber(999));



    }

    @org.junit.jupiter.api.Test
    void getMinValue() {
        int []a ={1,2,3};
        int []b ={30,19,55,87,20};
        int []c ={101,999,1000000,65,78};
        int []d={10000, 10200,10300,10400};
        int []e={-8, -10,10,5};

        assertEquals(1, myMath.getMinValue(a));
        assertEquals(19, myMath.getMinValue(b));
        assertEquals(65, myMath.getMinValue(c));
        assertEquals(10000, myMath.getMinValue(d));
        assertEquals(-10, myMath.getMinValue(e));


    }

    @org.junit.jupiter.api.Test
    void existTriangle() {

        assertTrue(myMath.existTriangle(3,3,5));
        assertTrue(myMath.existTriangle(2,3,2));
        assertTrue(myMath.existTriangle(6,6,6));
        assertTrue(myMath.existTriangle(2,2,3));
        assertTrue(myMath.existTriangle(5,3,7));
        assertTrue(myMath.existTriangle(7,8,9));


        assertFalse(myMath.existTriangle(2,2,8));
        assertFalse(myMath.existTriangle(1,2,4));
        assertFalse(myMath.existTriangle(3,4,10));
        assertFalse(myMath.existTriangle(3,9,3));
        assertFalse(myMath.existTriangle(7,2,5));
        assertFalse(myMath.existTriangle(-3,-7,100));

    }
}