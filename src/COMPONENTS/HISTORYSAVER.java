package COMPONENTS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/

import java.io.*;

public class HISTORYSAVER {
    HISTORYSAVER(String number,String n,boolean f) throws IOException
    {
        FETCHCURRENTDATEANDTIME fdt = new FETCHCURRENTDATEANDTIME();
        File fl = new File("user.txt");
        BufferedReader br = new BufferedReader(new FileReader(fl));
        String st;
        while ((st = br.readLine()) != null) {
            FileWriter fw = new FileWriter("history.txt",true);
            String hs=number+" Checked at "+fdt.Fetch()+" USERNAME : "+st+" "+" Input no:- "+n+" Result:- "+ (f?"true":"false")+"\n";
            fw.write(hs);
            fw.close();
        }

    }

    HISTORYSAVER(String number,int n1,int n2) throws IOException
    {
        FETCHCURRENTDATEANDTIME fdt = new FETCHCURRENTDATEANDTIME();
        File fl = new File("user.txt");
        BufferedReader br = new BufferedReader(new FileReader(fl));
        String st;
        while ((st = br.readLine()) != null) {
            FileWriter fw = new FileWriter("history.txt",true);
            String hs="====================================================================" +
                    "========================================================================" +
                    "==========================================================================" +
                    "\n"+number+" Range Checking Between "+n1+" & "+n2+" at "+fdt.Fetch()+" USERNAME : "+st+" "+"\n"+
                    "===================================================================="+
                    "===================================================================="+
                    "====================================================================\n";
            fw.write(hs);
            fw.close();
        }

    }
}
