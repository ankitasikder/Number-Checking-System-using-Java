package LOGICS;

public class Happy_no
{
    public int sumofsquaredigit (int n)
    {
        int sum,r;
        sum=0;
        while (n!=0)
        {
            r=n%10;
            sum = sum + (r*r);
            n=n/10;
        }
        return sum;
    }
    public boolean ishappy(int n)
    {
        while(n>9)
        {
            n = sumofsquaredigit(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
}

