package COMPONENTS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

import java.time.*;
import java.time.format.*;

public class FETCHCURRENTDATEANDTIME {
    public String Fetch(){
        DateTimeFormatter t = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
        LocalDateTime l = LocalDateTime.now();
        return t.format(l);

    }
}
