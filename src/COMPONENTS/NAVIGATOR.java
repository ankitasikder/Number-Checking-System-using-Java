package COMPONENTS;
/*ALL THESE WORKS ARE DONE BY 

ANKITA SIKDER

STUDENT OF BTECH, IN UEMK

CONTACT NO.: 8583939774

EMAIL ID: ankita.sikder14@gmail.com
*/


// MENU
public class NAVIGATOR
{
    HELPERNAVIGATION2 helpernav2=new HELPERNAVIGATION2();
    HELPERNAVIGATION helpernav = new HELPERNAVIGATION();
    TAKEINPUTS t = new TAKEINPUTS();
    static MENU menu= new MENU();




// single no. check korar jonno.......................................
// er sob kaj ache HELPERNAVIGATION a.................................
    public void ncMenu(){
        do{
            System.out.println("\n\n<|||||------------------------------------------------------------------------------------------------------------------|||||>");
            System.out.println("                                 <----------****   Number Checking  ****----------->");
            System.out.println(" <|||------------------------------------------------------------------------------------------------------------------|||>");
            System.out.printf("1.%-20s 2.%-20s 3.%-20s 4.%-20s 5.%-20s 6.%-20s 7.%-20s\n8.%-20s 9.%-20s 10.%-20s11.%-20s12.%-20s13.%-20s14.%-20s\n15.%-20s16.%-20s17.%-20s18.%-20s19.%-20s20.%-20s21.%-20s\n22.%-20s23.%-20s24.%-20s25.%-20s","Amicable no","Armstrong No", "Automorphic No","Buzz No","Circular Prime no","Composite no","Disarium no","Duck no","Emirp no","Even & Odd no","Fibonacci Series","Happy no","Harshad no","ISBN no","Krishnamurthy no","Magic no","Negative no","Neon no","Palindrome no","Perfect no","Prime no","PrimePalindrome no","Pronic no","Smith no","Special no\n");
            System.out.println("<------------------------------------------------------------------------------------------------------------------>");
            System.out.printf("  26.%s  27.%s","Back to MAIN MENU\n","EXIT\n");
            System.out.println("<------------------------------------------------------------------------------------------------------------------>");
            System.out.println("<------------------------------------------------------------------------------------------------------------------>");

            System.out.print("Enter the choice :: ");
            int a=t.takenumber();
            switch (a)
            {
                case 1: helpernav.amicable();
                break;

                case 2: helpernav.armstrong();
                break;

                case 3: helpernav.automorphic();
                break;

                case 4: helpernav.buzz();
                break;

                case 5: helpernav.circularprime();
                break;

                case 6: helpernav.composite();
                break;

                case 7: helpernav.disarium();
                break;

                case 8: helpernav.duck();
                break;

                case 9: helpernav.emirp();
                break;

                case 10: helpernav.evenodd();
                break;

                case 11: helpernav.fibonacci();
                    break;

                case 12: helpernav.happy();
                    break;

                case 13: helpernav.harshad();
                    break;

                case 14: helpernav.isbn();
                    break;

                case 15: helpernav.krishnamurthy();
                    break;

                case 16: helpernav.magic();
                    break;

                case 17: helpernav.negative();
                    break;

                case 18: helpernav.neon();
                    break;

                case 19: helpernav.palindrome();
                    break;

                case 20: helpernav.perfect();
                    break;

                case 21: helpernav.prime();
                    break;

                case 22: helpernav.primepalindrome();
                    break;

                case 23: helpernav.pronic();
                    break;

                case 24: helpernav.smith();
                    break;

                case 25: helpernav.special();
                    break;

                case 26:menu.mainmenu();
                    break;

                case 27: System.exit(0);

                default: System.out.println("\nPlease Enter a valid choice");
            }
        }
        while(true);
    }



// rf menu holo range a kono no. print korar jonno......................................
// sob object 1st create kora ache......................................................
// er sob kaj ache HELPERNAVIGATION a...................................................
    public void rfMenu()
    {

     do
     {
         System.out.println("\n\n<|||||------------------------------------------------------------------------------------------------------------------|||||>");
         System.out.println("                                 <----------****   Range Fetching  ****----------->");
         System.out.println(" <|||------------------------------------------------------------------------------------------------------------------|||>");
         System.out.printf("1.%-20s 2.%-20s 3.%-20s 4.%-20s 5.%-20s 6.%-20s 7.%-20s\n8.%-20s 9.%-20s 10.%-20s11.%-20s12.%-20s13.%-20s14.%-20s\n15.%-20s16.%-20s17.%-20s18.%-20s19.%-20s20.%-20s21.%-20s\n22.%-20s23.%-20s24.%-20s","Armstrong No", "Automorphic No","Buzz No","Circular Prime no","Composite no","Disarium no","Duck no","Emirp no","Even & Odd no","Fibonacci Series","Happy no","Harshad no","ISBN no","Krishnamurthy no","Magic no","Negative no","Neon no","Palindrome no","Perfect no","Prime no","PrimePalindrome no","Pronic no","Smith no","Special no\n");
         System.out.println("<----------------------------------------------------------------------------------------------------------------------------------------------------------->");
         System.out.printf("  25.%s  26.%s","Back to MAIN MENU\n","EXIT\n");
         System.out.println("<----------------------------------------------------------------------------------------------------------------------------------------------------------->");
         System.out.println("<----------------------------------------------------------------------------------------------------------------------------------------------------------->");
         System.out.print("Enter the choice :: ");
         helpernav2.ranger(t.takenumber());



     }
     while(true);
    }
}
