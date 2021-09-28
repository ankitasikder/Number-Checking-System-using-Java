package COMPONENTS;
// main theke eta call hocche..........................................................
public class MENU
{
    TAKEINPUTS t = new TAKEINPUTS();
    NAVIGATOR navigator = new NAVIGATOR();
    public void mainmenu()
    {
        do{
            System.out.println("<----------------------------------------------------------------------------------------------------------------------------------------------------------->");
            System.out.println("<----------------------------------------------------------------------------------------------------------------------------------------------------------->");
            System.out.println("NCS PANEL");
            System.out.println("1.Number Checking" );
            System.out.println("2.Range Fetching" );
            System.out.println("3.Exit" );
            System.out.println("<----------------------------------------------------------------------------------------------------------------------------------------------------------->");
            System.out.print("Enter Your Choice :- " );


            switch(t.takenumber())
            {
                case 1: navigator.ncMenu();
                break;
                case 2: navigator.rfMenu();
                break;
                case 3: System.exit(0);
                default : System.out.print("Invalid Choice");
            }
        }
        while(true);
    }
}
