package COMPONENTS;
import LOGICS.*;

import java.io.IOException;
import java.util.concurrent.Callable;

public class HELPERNAVIGATION {


    public void amicable() {
        int num1,num2;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num1 = t.takenumber();
        System.out.println("Enter the no.");
        num2 = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Amicablenum ai = new Amicablenum();//amicable
        df.defamicable();
        try {
            rs.amicable_result(ai.isAmicable(num1,num2),num1,num2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void  armstrong() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Amstrong_no am = new Amstrong_no();//armstrong
        df.defamstrong();
        try {
            rs.amstrong_result(am.isAmstrong(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void automorphic() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Automorphicnum at = new Automorphicnum();//automorphic
        df.defautomorphic();
        try {
            rs.automorphic_result(at.isAutomorphic(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void buzz() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Buzznum bz = new Buzznum();//buzz
        df.defbuzz();
        try {
            rs.buzz_result(bz.buzznumber(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void circularprime() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Circularprime_no cr = new Circularprime_no();//circularprime
        df.defcircularprime();
        try {
            rs.circularprime_result(cr.iscircularprime(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void composite() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Composite_no co = new Composite_no();//composite
        df.defcomposite();
        try {
            rs.composite_result(co.iscomposite(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void  disarium() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Disariumnum di = new Disariumnum();//disarium
        df.defdisarium();
        try {
            rs.disarium_result(di.isDisarium(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void duck() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Duck_no du = new Duck_no();//duck
        df.defduck();
        try {
            rs.duck_result(du.isduck(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void emirp() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Emirp_no em = new Emirp_no();//emirp
        df.defemirp();
        try {
            rs.emirp_result(em.isemirp(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void evenodd() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Evenodd_no ev = new Evenodd_no();//evenodd
        df.defevenodd();
        try {
            rs.evenodd_result(ev.isevenodd(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fibonacci() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Fibonaccinumseries fb = new Fibonaccinumseries();//fibobacci
        df.deffibonacci();
        try {
            rs.fibonacci_result(fb.fibonacci(num),num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void happy() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Happy_no hp = new Happy_no();//happy
        df.defhappy();
        try {
            rs.happy_result(hp.ishappy(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void harshad() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Harshad_no ha = new Harshad_no();//harshad
        df.defharshad();
        try {
            rs.harshad_result(ha.isharshad(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void isbn() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        ISBNnum is = new ISBNnum();//isbn
        df.defisbn();
        try {
            rs.isbn_result(is.isbnnum(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void krishnamurthy() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Krishnamurthynum kr = new Krishnamurthynum();//krishnamurthy
        df.defkrishnamurthy();
        try {
            rs.krishnamurthy_result(kr.isKrishnamurthy(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void magic() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Magic_no ma = new Magic_no();//magic
        df.defmagic();
        try {
            rs.magic_result(ma.ismagic(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void negative() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Negativenum ng = new Negativenum();//negative
        df.defnegative();
        try {
            rs.negative_result(ng.negative(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void neon() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Neonnum ne = new Neonnum();//neon
        df.defneon();
        try {
            rs.neon_result(ne.neon(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void palindrome() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Palindrome_no pa = new Palindrome_no();//palindrome
        df.defpalindrome();
        try {
            rs.palindrome_result(pa.ispalindrome(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void perfect() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Perfect_no pe = new Perfect_no();//perfect
        df.defperfect();
        try {
            rs.perfect_result(pe.isperfect(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void prime() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Prime_no pn = new Prime_no();//prime
        df.defprime();
        try {
            rs.prime_result(pn.isprime(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void primepalindrome() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Primepalindrome_no pp = new Primepalindrome_no();//primepalindrome
        df.defprimepalindrome();
        try {
            rs.primepalindrome_result(pp.isprimepalindrome(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void pronic() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Pronicnum pr = new Pronicnum();//pronic
        df.defpronic();
        try {
            rs.pronic_result(pr.isPronic(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void smith() {
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Smith_no sm = new Smith_no();//smith
        df.defsmith();
        try {
            rs.smith_result(sm.issmith(num), num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void special(){
        int num;
        TAKEINPUTS t = new TAKEINPUTS();
        System.out.println("Enter the no.");
        num = t.takenumber();
        DEFINITIONS df = new DEFINITIONS();
        RESULTS rs = new RESULTS();
        Special_no sp = new Special_no();//sepcial
        df.defspecial();
        try {
            rs.special_result(sp.isspecial(num),num );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
