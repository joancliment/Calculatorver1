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

    @Test
    public void Suma_un_numero_calculadora () {
        Calc suma = new Calc();
        String numberEnt = "5.0";
        String resultado1 = suma.AddStrings(numberEnt);
        String expected = "5.0";
        Assert.assertEquals(resultado1, expected);

    }

}
