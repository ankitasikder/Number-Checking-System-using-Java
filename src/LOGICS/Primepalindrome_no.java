package LOGICS;
import LOGICS.Prime_no;
import LOGICS.Palindrome_no;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

public class Primepalindrome_no
{
    public boolean isprimepalindrome(int n)
    {
        Prime_no pr = new Prime_no();
        Palindrome_no pl = new Palindrome_no();

        if(pr.isprime(n) && pl.ispalindrome(n))
            return true;
        else
            return false;
    }
}
