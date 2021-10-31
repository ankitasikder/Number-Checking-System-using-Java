package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Perfect_no
{
    public boolean isperfect(int n)
    {
        int i,sum=0;
       for(i=1;i<=n;i++)
       {
           if(n%i==0)
               sum=sum+i;
       }

        if(sum==n)
            return true;
        else
            return false;
    }
}
