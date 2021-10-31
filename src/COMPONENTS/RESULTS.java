package COMPONENTS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RESULTS

{
    public void amicable_result(boolean f, int n1,int n2) throws IOException
    {
        String s= f? "\n"+n1+"&"+n2+" are amicable no.": "\n"+n1+"&"+n2+" are not amicable no.";
        System.out.println(s);
        new HISTORYSAVER("Amicable Number",Integer.toString(n1)+","+Integer.toString(n2),f);   // Type Casting................>>>>>>>>
    }
    public void amstrong_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is amstrong no.": "\n"+n+" is not amstrong no.";
        System.out.println(s);
        new HISTORYSAVER("Amstrong Number",Integer.toString(n),f);
    }
    public void automorphic_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is automorphic no.": "\n"+n+" is not automorphic no.";
        System.out.println(s);
        new HISTORYSAVER("Automorphic Number",Integer.toString(n),f);
    }
    public void buzz_result(boolean f, int n) throws IOException
    {
        String s= f?"\n"+n+" is buzz no.": "\n"+n+" is not buzz no.";
        System.out.println(s);
        new HISTORYSAVER("Buzz Number",Integer.toString(n),f);
    }
    public void circularprime_result (boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is circular prime no.": "\n"+n+" is not circular prime no.";
        System.out.println(s);
        new HISTORYSAVER("CircularPrime Number",Integer.toString(n),f);
    }
    public void composite_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is composite no.": "\n"+n+" is not composite no.";
        System.out.println(s);
        new HISTORYSAVER("Composite Number",Integer.toString(n),f);
    }
    public void disarium_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is disarium no.": "\n"+n+" is not disarium no.";
        System.out.println(s);
        new HISTORYSAVER("Disarium Number",Integer.toString(n),f);
    }
    public void duck_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is duck no.": "\n"+n+" is not duck no.";
        System.out.println(s);
        new HISTORYSAVER("Duck Number",Integer.toString(n),f);
    }
    public void emirp_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is emirp no.": "\n"+n+" is not emirp no.";
        System.out.println(s);
        new HISTORYSAVER("Emirp Number",Integer.toString(n),f);
    }
    public void evenodd_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is even no.": "\n"+n+" is not odd no.";
        System.out.println(s);
        new HISTORYSAVER("EvenOddd Number",Integer.toString(n),f);
    }
    public void fibonacci_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is fibonacci no.": "\n"+n+" is not fibonacci no.";
        System.out.println(s);
        new HISTORYSAVER("Fibonacci Number",Integer.toString(n),f);
    }
    public void happy_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is happy no.": "\n"+n+" is not happy no.";
        System.out.println(s);
        new HISTORYSAVER("Happy Number",Integer.toString(n),f);
    }
    public void harshad_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is harshad no.": "\n"+n+" is not harshad no.";
        System.out.println(s);
        new HISTORYSAVER("Harshad Number",Integer.toString(n),f);
    }
    public void isbn_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is ISBN no.": "\n"+n+" is not ISBN no.";
        System.out.println(s);
        new HISTORYSAVER("ISBN Number",Integer.toString(n),f);
    }
    public void krishnamurthy_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is krishnamurthy no.": "\n"+n+" is not krishnamurthy no.";
        System.out.println(s);
        new HISTORYSAVER("Krishnamurthy Number",Integer.toString(n),f);
    }
    public void magic_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is magic no.": "\n"+n+" is not magic no.";
        System.out.println(s);
        new HISTORYSAVER("Magic Number",Integer.toString(n),f);
    }
    public void negative_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is negative no.": "\n"+n+" is not negative no.";
        System.out.println(s);
        new HISTORYSAVER("Negative Number",Integer.toString(n),f);
    }
    public void neon_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is neon no.": "\n"+n+" is not neon no.";
        System.out.println(s);
        new HISTORYSAVER("Neon Number",Integer.toString(n),f);
    }
    public void palindrome_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is palindrome no.": "\n"+n+" is not palindrome no.";
        System.out.println(s);
        new HISTORYSAVER("Palindrome Number",Integer.toString(n),f);
    }
    public void perfect_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is perfect no.": "\n"+n+" is not perfect no.";
        System.out.println(s);
        new HISTORYSAVER("Perfect Number",Integer.toString(n),f);
    }
    public void prime_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is prime no.": "\n"+n+" is not prime no.";
        System.out.println(s);
        new HISTORYSAVER("Prime Number",Integer.toString(n),f);
    }
    public void primepalindrome_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is primepalindrome no.": "\n"+n+" is not primepalindrome no.";
        System.out.println(s);
        new HISTORYSAVER("PrimePalindrome Number",Integer.toString(n),f);
    }
    public void pronic_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is pronic no.": "\n"+n+" is not pronic no.";
        System.out.println(s);
        new HISTORYSAVER("Pronic Number",Integer.toString(n),f);
    }
    public void smith_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is smith no.": "\n"+n+" is not smith no.";
        System.out.println(s);
        new HISTORYSAVER("Smith Number",Integer.toString(n),f);
    }
    public void special_result(boolean f, int n) throws IOException
    {
        String s= f? "\n"+n+" is special no.": "\n"+n+" is not special no.";
        System.out.println(s);
        new HISTORYSAVER("Special Number",Integer.toString(n),f);
    }
}
