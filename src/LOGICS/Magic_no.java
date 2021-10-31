package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Magic_no
{
    public int sumofdigitformagic( int n)
    {
        int sum=0,r;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public boolean ismagic(int n)
    {
        while(n>9)
        {
            n=sumofdigitformagic(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
}
