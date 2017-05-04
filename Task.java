import java.io.*;
public class Task3
{
    public static void main(String[] args) throws IOException
    {
        System.out.print("ENTER YOUR INPUT:");
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String input = bfr.readLine();
        input=input.toUpperCase();
        input=input.trim();
        input=input.replace(" ","");
        System.out.println(input);
        //DEPARTMENT CALCULATION.
        /*char dept=input.charAt(2);
        if(dept=='M')
            System.out.println("DEPARTMENT \t: MECH");
        else if(dept=='A')
            System.out.println("DEPARTMENT \t: AUTO");
        else if(dept=='N')
            System.out.println("DEPARTMENT \t: E & I");
        else if(dept=='T')
            System.out.println("DEPARTMENT \t: ETE");
        else if(dept=='C')
            System.out.println("DEPARTMENT \t: CIVIL");
        else if(dept=='P')
            System.out.println("DEPARTMENT \t: CS");
        else if(dept=='E')
            System.out.println("DEPARTMENT \t: EEE");
        else if(dept=='L')
            System.out.println("DEPARTMENT \t: ECE");
        else if(dept=='F')
            System.out.println("DEPARTMENT \t: IT");
        else
        {
            System.out.println("INVALID DEPARTMENT.");
           
        }

        //SECTION CALCULATION.
        char section = input.charAt(3);
        if((section=='1'|| section=='5') && (dept=='T' || dept=='A' || dept=='M' || dept=='N' || dept=='C' || dept=='E' || dept=='L' || dept=='F' || dept=='P'))
            System.out.println("SECTION \t: 'A' ");
        else if((section=='2'|| section=='6') && ( dept=='N' || dept=='F' || dept=='P' || dept=='C' || dept=='L' || dept=='M' || dept=='E'))
            System.out.println("SECTION \t: 'B' ");
        else if((section=='3' || section=='7') && (dept=='C' || dept=='L' || dept=='M' || dept=='E'))
            System.out.println("SECTION \t: 'C' ");
        else
            System.out.println("INVALID SECTION");
        
        //YEAROFJOINING CAND YEAROFPASSING CALCULATION.
        String yof= input.substring(0,2);
        int yof_int=Integer.parseInt(yof);
        System.out.printf("YEAR OF ENTRY\t:%d",2000+yof_int); 
           
        if(section=='5' || section=='6' ||section=='7')
        {
            System.out.println("\nLATERAL ENTRY.");
            System.out.printf("YEAR OF PASSING:%d\n",2000+yof_int+3);
        }
        else if(section=='1' || section=='2' || section=='3')
        {
            System.out.println("\nREGULAR ENTRY.");
            System.out.printf("YEAR OF PASSING :%d\n",2000+yof_int+4);
        }

        //ROLL NO CALCULATION.
        System.out.println("ROLL NO\t\t:"+input.charAt(4)+input.charAt(5));*/
    }
}
