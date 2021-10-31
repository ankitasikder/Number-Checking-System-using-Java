package LOGICS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Palindrome_no
{
    public boolean ispalindrome(int n)
    {
        int r,sum=0,temp;
        temp=n;
        while(n!=0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        if(sum==temp)
            return true;
        else
            return false;
    }
}
