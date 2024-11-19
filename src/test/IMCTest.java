package test;

import main.IMC;
import org.junit.Test;
import static org.junit.Assert.*;


public class IMCTest {

    @Test
    public void test_IMC_calculus(){
        double result = IMC.calcularIMC(83, 1.77);
        assertEquals(26,49, result);
    }
}
