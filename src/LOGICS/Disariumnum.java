package LOGICS;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Disariumnum {
    public boolean isDisarium(int num){
        int copy = num, d = 0, sum = 0;
        String s = Integer.toString(num);
        int len = s.length();
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

        while(copy>0)
        {
            d = copy % 10;
            sum = sum + (int)Math.pow(d,len);
            len--;
            copy = copy / 10;
        }

        if(sum == num)
            return true;
        else
            return false;

    }

}
