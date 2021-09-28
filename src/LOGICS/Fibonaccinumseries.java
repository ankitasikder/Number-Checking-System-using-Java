package LOGICS;
import java.util.Scanner;
public class Fibonaccinumseries {
    public boolean fibonacci(int n) {
        int a, b, i;
        int c=0,f=0;
        a = 0;
        b = 1;
        for (i = 1; i < 9999; i++)
        {
            c = a + b;

            //-------------------
            if(a==n)
            {
                f++;
                break;
            }
            else if(b==n)
            {
                f++;
                break;
            }
            else if(c==n)
            {
                f++;
                break;
            }

            else if(c>n)
            {
                f=0;
                break;
            }
            //--------------------

            a = b;
            b = c;
        }

        if(f>=1)
            return true;
        else
            return false;
    }
}