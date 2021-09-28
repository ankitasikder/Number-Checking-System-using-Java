package LOGICS;
import java.util.Scanner;
public class Automorphicnum {
    public boolean isAutomorphic(int a){

        if ((a*a)%10==a)
            return true;
        else
            return false;
    }
}
