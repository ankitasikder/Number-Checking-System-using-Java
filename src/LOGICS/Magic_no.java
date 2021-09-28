package LOGICS;

public class Magic_no
{
    public int sumofdigitformagic( int n)
    {
        int sum=0,r;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public boolean ismagic(int n)
    {
        while(n>9)
        {
            n=sumofdigitformagic(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
}
