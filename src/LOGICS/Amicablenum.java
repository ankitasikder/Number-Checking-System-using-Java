package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

//import java.util.Scanner;
public class Amicablenum {
    public boolean isAmicable(int num1,int num2){
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0)
                sum1 += i;
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0)
                sum2 += i;
        }
        if (sum1 == sum2)
            return true;
        else
            return false;
    }
}
