package io.joan.unitpower;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    public String AddStrings(String numberEnt) {

     /*   String NumN []; */

        List<String> NumN;
        NumN = new ArrayList<String>();
        int Ext = 1;
        int x = 1;
        int y = 0;
        int z = 0;
        int t = 0;
        int zAct = 1;
        int zAnt = 2;
        int NumberSal = 0;


        boolean empty; if (numberEnt.isEmpty()) empty = true;
        else empty = false;

        if (empty) {
            return "";
        } else
            {
            while (x < numberEnt.length())
            {
                for (y=x; zAct < zAnt ; y++)
                {

                    z = y + 1;
                    if (!Character.isDigit(Integer.parseInt(numberEnt.substring(y, z))))
                    {
                        zAct = zAct + 1;
                    }
                }
                if (!Character.isDigit(Integer.parseInt(numberEnt.substring(x, y))))
                {
                   x = y + 1;
                   if (zAct > 1)
                   {
                        zAct = zAct - 1;
                   }

                } else
                    {
                      NumN.add(numberEnt.substring(x, y));
                      zAnt = zAct + 1;
                      x = y + 2;
                    }

            }

              
                for (t=0; t < zAct ; t++) {
                    NumberSal = Integer.valueOf(NumN.get(t)) + NumberSal;
                }
        }

        return String.valueOf(NumberSal);

    }


}


