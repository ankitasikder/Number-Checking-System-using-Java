package LOGICS;

public class Smith_no
{
    public int sumofdigitforsmith( int n)
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
    public boolean issmith(int n)
    {
       int temp,sum=0,i;
       temp= sumofdigitforsmith(n);
       for(i=1;i<=n;i++)
       {
           if(n%i==0)
           {
               sum=sum+sumofdigitforsmith(i);
           }
       }
       if(sum==temp)
            return true;
        else
            return false;
    }
}
