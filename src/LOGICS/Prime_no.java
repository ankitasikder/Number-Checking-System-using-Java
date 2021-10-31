package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Prime_no
{
    public boolean isprime(int n)
    {
        int i,c=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c>1)
            return false;
        else
            return true;
    }
}
