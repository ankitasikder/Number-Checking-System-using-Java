package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Emirp_no
{
    public int reverseano_foremirp(int n)
    {
        int r,sum=0;
        while(n!=0)
        {
            r=n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        return sum;
    }
    public boolean isemirp(int n)
    {
        int i,c=0;
        int x=reverseano_foremirp(n);
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                c++;
        }
        for(i=2;i<x;i++)
        {
            if(x%i==0)
                c++;
        }
        if(c>1)
            return false;
        else
            return true;
    }
}
