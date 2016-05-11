
package asg1;

import java.io.*;
import java.util.*;


public class RunMyMethods 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner (System.in);
        int input = 0;
        Methods m = new Methods();
        
        do
        {
            System.out.println("1) Product");
            System.out.println("2) Find Twelves");
            System.out.println("3) Minimum, Maximum, & Average");
            System.out.println("4) My Grader");
            System.out.println("5) Exit");
            input = sc.nextInt();
                
            if(input == 1)
            {
                m.product();
            }
            else if(input == 2)
            {
                m.findTwelves();
            }
            else if(input == 3)
            {
                m.minMaxAvg();
            }
            else if(input == 4)
            {
                m.myGrader();
            }
            else if(input == 5)
            {
                System.out.println("Goodbye.");
            }
            else
            {
                System.out.println("Error: Input Invalid.");
            }
        } 
        while(input != 5);
        System.exit(input);
    }  
}
