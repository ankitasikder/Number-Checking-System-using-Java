package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

import java.util.Scanner;
public class Pronicnum {
    public boolean isPronic(int num){
        int f = 0;
        int i;
        for(i=0;i<=num;i++)
        {
            if((i*(i+1))==num)
            f=1;
        }
        if (f==1)
                return true;
        else
            return false;
    }
}
