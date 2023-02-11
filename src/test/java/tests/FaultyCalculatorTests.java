package tests;

//import org.junit.Test;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// testscript voor testing calculator

public class FaultyCalculatorTests {

    FaultyCalculator faultyCalculator;

    @BeforeEach
    public void initTest(){
        faultyCalculator = new FaultyCalculator();
    }

    @Test
    public void CalcTest() {
        double number1 =  2;
        double number2 =  1;
        System.out.println("CalcTest gerund.");

        //FaultyCalculator faultyCalculator = new FaultyCalculator();

        double resultAverage = faultyCalculator.average(2,4);
        Assertions.assertEquals( 3, resultAverage,"Gemiddelde van heel getal");

        double resultDivide = faultyCalculator.divide(3,2);
        Assertions.assertEquals(1.5, resultDivide, "A gedeeld door B");
    }

    @Test
    public void CalcTestDivide() {
        double number1 =  2;
        double number2 =  1;
        System.out.println("CalcTestDivide gerund.");

        double resultDivide = faultyCalculator.divide(3,2);
        Assertions.assertEquals(1.5, resultDivide, "A gedeeld door B");
    }

    @Test
    public void CalcTestDivideBefore() {
        System.out.println("CalcTestDivideBefore gerund.");
        Assertions.assertEquals(1.5, faultyCalculator.divide(3,2), "A gedeeld door B");
    }

}
