package io.joan.unitpower;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCalcOneTwoEmpty {

    @Test
    public void Suma_vacio_calculadora () {
        Calc suma = new Calc();
        String numberEnt = "";
        String resultado1 = suma.AddStrings(numberEnt);
        String expected = "";
        Assert.assertEquals(resultado1, expected);

    }

}
