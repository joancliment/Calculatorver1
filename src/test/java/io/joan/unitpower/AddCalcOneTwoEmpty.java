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

    @Test
    public void Suma_dos_numeros_calculadora () {
        Calc suma = new Calc();
        String numberEnt = "5.0    3.1  ";
        String resultado1 = suma.AddStrings(numberEnt);
        String expected = "8.1";
        Assert.assertEquals(resultado1, expected);

    }

    @Test
    public void Suma_dos_numeros_sin_dec_calculadora () {
        Calc suma = new Calc();
        String numberEnt = "5    3  ";
        String resultado1 = suma.AddStrings(numberEnt);
        String expected = "8";
        Assert.assertEquals(resultado1, expected);

    }


    @Test
    public void Suma_N_numeros_calculadora () {
        Calc suma = new Calc();
        String numberEnt = "5.0    3.1  6.1  9.1  111.12  3000.10";
        String resultado1 = suma.AddStrings(numberEnt);
        String expected = "3134.52";
        Assert.assertEquals(resultado1, expected);

    }

    @Test
    public void Suma_N_numeros_separados_comas_calculadora () {
        Calc suma = new Calc();
        String numberEnt = "5.0,3.1,6.1,9.1,111.12,3000.10";
        String resultado1 = suma.AddStrings(numberEnt);
        String expected = "3134.52";
        Assert.assertEquals(resultado1, expected);

    }
}
