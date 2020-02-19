package sk.itsovy.strausz.project.unit.testing.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.strausz.project.unit.testing.Information;
import static junit.framework.TestCase.assertEquals;

class InformationTest {
    private Information info;

    @BeforeEach
    void setUp() {
        info = new Information();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToBinary() {

        assertEquals("1", info.convertToBinary(1));
        assertEquals("10", info.convertToBinary(2));
        assertEquals("11", info.convertToBinary(3));
        assertEquals("100", info.convertToBinary(4));
        assertEquals("101", info.convertToBinary(5));
        assertEquals("110", info.convertToBinary(6));
        assertEquals("1100101", info.convertToBinary(101));
        assertEquals("100101111", info.convertToBinary(303));
        assertEquals("1000101011", info.convertToBinary(555));
        assertEquals("10100001110111", info.convertToBinary(10359));


    }
}