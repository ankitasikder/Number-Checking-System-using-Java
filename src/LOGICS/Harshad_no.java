package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Harshad_no
{
    public int sumofdigit_forharshad(int n)
    {
        int r,sum=0;
        while(n!=0)
        {
            r=n%10;
            sum= sum+r;
            n=n/10;
        }
        return sum;
    }
    public boolean isharshad(int n)
    {
        int a = sumofdigit_forharshad(n);
        if(n%a==0)
            return true;
        else
            return false;
    }
}
