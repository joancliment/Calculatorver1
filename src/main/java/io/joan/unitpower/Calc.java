package io.joan.unitpower;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    public String AddStrings(String numberEnt) {

     /*   String NumN []; */

        List<String> NumN;
        NumN = new ArrayList<String>();

        int Ext = 1;
        int x = 0;
        int y = 0;
        int z = 0;
        int t = 0;
        int long1 = 0;
        int zAct = 1;
        int zAnt = 2;
        double NumberSal = 0;

        String[ ] lista1 = numberEnt.split("\\.");


        boolean empty; if (numberEnt.isEmpty()) empty = true;
        else empty = false;

        if (empty) {
            return "";
        } else
        {
            long1 = (numberEnt.length() - 1);

            while (x <= long1 )
            {
                for (y=x; (y <= long1 && zAct < zAnt) ; y++)
                {
                    z = y + 1;
                    if (!Character.isDigit(Integer.parseInt(numberEnt.substring(y, z))))
                    {
                        if (!((numberEnt.substring(y, z)).contains(".")))
                        {
                            zAct = zAct + 1;
                        }
                    }

                }

                NumN.add(numberEnt.substring(x, z));
                zAnt = zAct + 1;
                x = z + 1;

            }

                for (int i = 0; i <= NumN.size() - 1; i++) {
                    NumberSal = Double.valueOf(NumN.get(i)) + NumberSal;
                }
        }

        return String.valueOf(NumberSal);

    }


}


