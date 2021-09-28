package LOGICS;
import java.util.Scanner;
public class Pronicnum {
    public boolean isPronic(int num){
        int f = 0;
        int i;
        for(i=0;i<=num;i++)
        {
            if((i*(i+1))==num)
            f=1;
        }
        if (f==1)
                return true;
        else
            return false;
    }
}
