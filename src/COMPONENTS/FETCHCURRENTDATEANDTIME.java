package COMPONENTS;
import java.time.*;
import java.time.format.*;

public class FETCHCURRENTDATEANDTIME {
    public String Fetch(){
        DateTimeFormatter t = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
        LocalDateTime l = LocalDateTime.now();
        return t.format(l);

    }
}
