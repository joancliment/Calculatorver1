package io.joan.unitpower;

import java.util.ArrayList;
import java.util.List;

public class Calc {


    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public String AddStrings(String numberEnt) {

        /*   String NumN []; */

        List<String> NumN;
        NumN = new ArrayList<String>();

        int Ext = 1;
        int x = 0;
        int y = 0;
        int z = 0;
        int yok = 0;
        int zok = 0;
        int t = 0;
        int long1 = 0;
        int zAct = 1;
        int zAnt = 2;
        double NumberSal = 0;
        boolean hay_numero = false;
        String Salida1 = "";

        String[ ] lista1 = numberEnt.split("\\.");


        boolean empty; if (numberEnt.isEmpty()) empty = true;
        else empty = false;

        if (empty) {
            return "";
        } else
        {
            long1 = (numberEnt.length());
            x = 0;

            while (x < long1 )
            {
                hay_numero = false;
                y = x;
                yok = x;
                zok = x;

                while (y < long1 && zAct < zAnt ) {

                    z = y + 1;
                    
                    if (isNumeric((numberEnt.substring(y, z))) == true) {
                        hay_numero = true;
                        zok = z;
                        y = y + 1;
                    } else {
                        if (((numberEnt.substring(y, z)).contains(".")) == true)
                        {
                          zok = z;
                          y = y + 1;
                        } else {
                                zAct = zAnt + 1;
                               }

                        }

                }

                if (hay_numero == true) {
                    NumN.add(numberEnt.substring(yok, zok));
                    zAnt = zAct + 1;
                    x = z;
            
                } else {
            
                    zAnt = zAct + 1;
                    x = z;
                }
            }

            for (int i = 0; (i <= NumN.size() - 1); i++) {
                NumberSal = Double.valueOf(NumN.get(i)) + NumberSal;
            }
        }

        Salida1 = String.valueOf(NumberSal);

        return Salida1;

    }


}

