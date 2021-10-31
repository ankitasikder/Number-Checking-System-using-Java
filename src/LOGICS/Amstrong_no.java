package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Amstrong_no {
    public  boolean isAmstrong(int n)
    {
        int a,rem,sum,t;
        t=n;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(rem*rem*rem);
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
}
