import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import COMPONENTS.*;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/


import javax.imageio.IIOException;

public class Main
{
    static boolean flag ;
    static Scanner sc = new Scanner(System.in);



    static
    {

        try {
            current_user();
            password_check();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void current_user() throws IOException {

        String st;
        System.out.println("Enter the Name::");
        st = sc.nextLine();
        File f = new File("user.txt");
        FileWriter fw = new FileWriter("user.txt");
        fw.write(st);
        fw.close();
    }

    static void password_check() throws IOException {
        File f = new File("user.txt");
        File f2 = new File("password.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        BufferedReader br2 = new BufferedReader(new FileReader(f2));
        String st, pass, st2;
        while ((st = br.readLine()) != null) {
            System.out.println(st + ",Enter the Password::");
            pass = sc.nextLine();
            while ((st2 = br2.readLine()) != null) {
                if (st2.equals(pass)) {
                    flag = true;
                }
            }
        }
    }




    /*
    public static void current_user()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name ::  ");
        String name = sc.nextLine();

    }
    public static void password_check() throws IOException
    {
        System.out.println("\nHellow "+name+" Enter your Password");
        Scanner sc = new Scanner(System.in);
        String p;
        p = sc.nextLine();
        File pass = new File("password.txt");
        BufferedReader br = new BufferedReader(new FileReader(pass));
        String check;
        while((check= br.readLine())!=null)
        {
            if(p.equals(check))
                flag=true;
        }


    }
    */

    public static void main(String[] args)
    {


        if(flag)
        {
            System.out.print("You are a authorized user\n");
            System.out.println("<-----*****************------------********************---------------------****************---->");
            MENU menu = new MENU();
            menu.mainmenu();
        }
        else
        {
            System.out.print("You are not a authorized user\n");
            System.exit(0);
        }


    }
}
