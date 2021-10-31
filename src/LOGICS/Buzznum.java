package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

import java.util.Scanner;
public class Buzznum {
    public boolean buzznumber(int a){

        if(a % 7 == 0 || (a % 10) == 7)
            return true;
        else
            return false;
    }
}
