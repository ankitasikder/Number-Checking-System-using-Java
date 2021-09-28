package LOGICS;
import java.util.Scanner;

public class ISBNnum {
    public boolean isbnnum(int n){
        int d,rem,c,s1,s;
        s1=0;
        c=0;
        s=1;
        d=n;
        for(;n!=0;n=(n/10))
        {
            rem=n%10;
            c++;
            s=c*rem;
            s1=s1+s;
        }
        if(s1%11==0)
            return true;
        else
            return false;
    }
}
