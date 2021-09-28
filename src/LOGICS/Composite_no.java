package LOGICS;

public class Composite_no
{
    public boolean iscomposite(int n)
    {
        int i,c=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c>1)
            return true;
        else
            return false;
    }
}
