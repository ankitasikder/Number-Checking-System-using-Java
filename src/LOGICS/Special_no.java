package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Special_no
{
    public int digit_factorial(int n)
    {
        if ((n==0)||(n==1))
            return 1;
        else
            return n * digit_factorial(n-1);
    }
    public boolean isspecial(int n)
    {
        int x,r,sum=0;
        x=n;
        while(x!=0)
        {
            r=x%10;
            sum=sum+digit_factorial(r);
            x=x/10;
        }
        if(sum==n)
            return true;
        else
            return false;
    }
}
