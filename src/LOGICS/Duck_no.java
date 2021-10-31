package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Duck_no
{
    public boolean isduck(int n)
    {
        int r,sum=0,temp;
        temp=n;
        int rem;
        while(n!=0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if((sum%10)==0)
            return false;
        else
        {
            while(temp!=0)
            {
                if((temp%10)==0)
                    return true;
                temp=temp/10;
            }
            return false;
        }


    }
}
