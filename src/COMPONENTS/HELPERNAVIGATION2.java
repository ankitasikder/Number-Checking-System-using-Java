package COMPONENTS;
import LOGICS.*;

import java.io.IOException;

public class HELPERNAVIGATION2
{
    RESULTS rs = new RESULTS();
    HELPER h =new HELPER();


    public void ranger (int n)
    {
        Amstrong_no amstrong= new Amstrong_no();
        Automorphicnum automorphic = new Automorphicnum();
        Buzznum buzznum = new Buzznum();
        Circularprime_no circularprime = new Circularprime_no();
        Composite_no composite = new Composite_no();
        Disariumnum disariumnum = new Disariumnum();
        Duck_no duck = new Duck_no();
        Emirp_no emirp=new Emirp_no();
        Evenodd_no evenodd = new Evenodd_no();
        Fibonaccinumseries fibonaccinumseries = new Fibonaccinumseries();
        Happy_no happy = new Happy_no();
        Harshad_no harshad = new Harshad_no();
        ISBNnum isbnum = new ISBNnum();
        Krishnamurthynum krishnamurthynum = new Krishnamurthynum();
        Magic_no magic = new Magic_no();
        Negativenum negativenum = new Negativenum();
        Neonnum neonnum = new Neonnum();
        Palindrome_no palindrome = new Palindrome_no();
        Perfect_no perfect = new Perfect_no();
        Prime_no prime = new Prime_no();
        Primepalindrome_no primepalindrome = new Primepalindrome_no();
        Pronicnum pronicnum = new Pronicnum();
        Smith_no smith = new Smith_no();
        Special_no special = new Special_no();

        DEFINITIONS df = new DEFINITIONS();
        MENU menu = new MENU();

        if(n==25)
            menu.mainmenu();

        else if(n==26)
            System.exit(0);


        else if((n>=1)&&(n<=24))
        {

            h.set_lower_upper_limit();



            for(int i=h.ll; i<= h.ul; i++)
            {
                switch(n)
                {
                    case 1:
                        try {
                            rs.amstrong_result(amstrong.isAmstrong(i),i);
                            new HISTORYSAVER("Amstrong no.",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 2 :
                        try {
                            rs.automorphic_result(automorphic.isAutomorphic(i),i );
                            new HISTORYSAVER("Automorphic no.",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 3 :
                        try {
                            rs.buzz_result(buzznum.buzznumber(i),i );
                            new HISTORYSAVER("Buzz no.",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 4 :
                        try {
                            rs.circularprime_result(circularprime.iscircularprime(i),i );
                            new HISTORYSAVER("Circular Prime",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 5 :
                        try {
                            rs.composite_result(composite.iscomposite(i),i );
                            new HISTORYSAVER("Composite no.",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 6 :
                        try {
                            rs.disarium_result(disariumnum.isDisarium(i),i );
                            new HISTORYSAVER("Disarium no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 7 :
                        try {
                            rs.duck_result(duck.isduck(i),i );
                            new HISTORYSAVER("Duck no.",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 8 :
                        try {
                            rs.emirp_result(emirp.isemirp(i),i );
                            new HISTORYSAVER("Emirp no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 9 :
                        try {
                            rs.evenodd_result(evenodd.isevenodd(i),i );
                            new HISTORYSAVER("Even Odd no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 10 :
                        try {
                            rs.fibonacci_result(fibonaccinumseries.fibonacci(i),i);
                            new HISTORYSAVER("Fibonacci no.",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 11:
                        try {
                            rs.happy_result(happy.ishappy(i),i );
                            new HISTORYSAVER("Happy no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 12 :
                        try {
                            rs.harshad_result(harshad.isharshad(i),i );
                            new HISTORYSAVER("Harshad no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 13 :
                        try {
                            rs.isbn_result(isbnum.isbnnum(i),i );
                            new HISTORYSAVER("ISBN no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 14 :
                        try {
                            rs.krishnamurthy_result(krishnamurthynum.isKrishnamurthy(i),i );
                            new HISTORYSAVER("Krisnamurthy no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 15 :
                        try {
                            rs.magic_result(magic.ismagic(i),i );
                            new HISTORYSAVER("Magic no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 16 :
                        try {
                            rs.negative_result(negativenum.negative(i),i );
                            new HISTORYSAVER("Negative no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 17 :
                        try {
                            rs.neon_result(neonnum.neon(i),i );
                            new HISTORYSAVER("Neon no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 18 :
                        try {
                            rs.palindrome_result(palindrome.ispalindrome(i),i );
                            new HISTORYSAVER("Palindrome no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 19 :
                        try {
                            rs.perfect_result(perfect.isperfect(i),i );
                            new HISTORYSAVER("Perfect no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 20 :
                        try {
                            rs.prime_result(prime.isprime(i),i );
                            new HISTORYSAVER("Prime no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 21 :
                        try {
                            rs.primepalindrome_result(primepalindrome.isprimepalindrome(i),i );
                            new HISTORYSAVER("Prime Palindrome no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 22 :
                        try {
                            rs.pronic_result(pronicnum.isPronic(i),i );
                            new HISTORYSAVER("Pronicum no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 23 :
                        try {
                            rs.smith_result(smith.issmith(i),i );
                            new HISTORYSAVER("Smith no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 24 :
                        try {
                            rs.special_result(special.isspecial(i),i );
                            new HISTORYSAVER("Special no. ",h.ll,h.ul);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }
        }

        else
        {
            System.out.println("Please make a valid choice");
            NAVIGATOR navigator = new NAVIGATOR();
            navigator.rfMenu();
        }

        }




}


class HELPER
{
    TAKEINPUTS t = new TAKEINPUTS();
    int ll,ul;

    public void set_lower_upper_limit()
    {
        System.out.println("Plz enter the lower limit");
        ll=t.takenumber();
        System.out.println("Plz enter the upper limit");
        ul=t.takenumber();
    }

}
