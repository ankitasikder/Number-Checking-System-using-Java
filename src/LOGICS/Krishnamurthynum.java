package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

import java.util.Scanner;
public class Krishnamurthynum {
    public boolean isKrishnamurthy(int a)
    {
        int rem,sum,t;
        t=a;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(factorialof(rem));//func calling
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
    static int factorialof(int m)//calculating factorial of a number
        {
            int j,fact;
            fact=1;
            for(j=1;j<=m;j++)
            {
                fact=fact*j;
            }
            return fact;
        }

}
