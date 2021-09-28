package LOGICS;
import java.util.Scanner;
public class Buzznum {
    public boolean buzznumber(int a){

        if(a % 7 == 0 || (a % 10) == 7)
            return true;
        else
            return false;
    }
}
