
package asg1;

import java.io.*;
import java.util.*;

public class Methods 
{
    public void product() throws IOException
    {
        float input = 0;
        float temp = 1;
        int numbers;
        String z;
        
        System.out.println("Use a 0 at the end to exit.");
        System.out.println("Negative values are invalid.");
        System.out.println("Please enter a string of 5 numbers under values of 25 or less: ");
        
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); 

        StringTokenizer st = new StringTokenizer(line);
        input = Float.parseFloat(st.nextToken());

        if (input == 0)
         {
                System.out.println("This will exit ");
                System.exit(1);
         } 
            while(input != 0)
            {
                if(input < 0)
                {
                    System.out.println(input + "invalid");
                }
                else if(input > 0)
                {
                    temp = input * temp;   
                }
                input = Float.parseFloat(st.nextToken());
            }    

           z = Float.toString(temp);

           numbers = z.indexOf(".");

            int b = numbers;
            int c = z.length ();
            
            if (c > b)
            {
                System.out.println ("The product is " + z.substring(0,b));
            }
            else
            {
               System.out.println("The Product of inputs " + c);
            }
               System.out.println("Please choose another option from our menu:");
    }
    public void findTwelves() throws IOException
    {
        int input, first, last,count,num; 
	input=first=last=count=num=0;
        
        System.out.println("");
        System.out.println("Enter a string of whole numbers.");
        System.out.println("I will tell you how many times you entered the number \"12\".");
        System.out.println("I will also tell you where the location of the first and last index of \"12\".");
     
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

            while(st.hasMoreTokens())
            {
                input = Integer.parseInt(st.nextToken());
                count++;
                if(first==0)
                {
                    if(input == 12)
                    {
                        first = count;
                        last = count;
                        num++;
                    }
                }
                else 
                {
                    if(input==12)
		    {
                        num++;   
                        last=count;
    	            }
                }
        }
        System.out.println("The first instance of the number 12 is located at index " + first);

        if(first !=0)
        {
        System.out.println("You entered " + num + " \"12's\"");
        System.out.println("The last instance of the number 12 is located at index " + last);
        System.out.println("Please choose another option from our menu:");
        }
    }
    public void minMaxAvg() throws IOException
    {
        double input, min, max, num, count, temp; 
	input=min=max=num=count=temp=0;
	
        System.out.println("");
        System.out.println("");
        System.out.println("Enter a string of numbers");
      
        BufferedReader br;
        br = new BufferedReader( new InputStreamReader( System.in ) );
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer( line );
        temp = Double.parseDouble( st.nextToken());
        min = temp;
        
        if(temp>max)
	{
             max=temp;     
    	}  
            count++;
            num = num + temp;
      
            while(st.hasMoreTokens() )
            {
                input = Double.valueOf( st.nextToken());
                if(input<min)
                {
                    min=input;
                }
                if(input>max)
		{
                    max=input;   
    	        }
                    count++;	
                    num = num + input;
            }
        
        System.out.println("The minumimum value is " + min);
        System.out.println("The maximum value is " + max);
        double avg = num/count;
 
        System.out.println("the average of the values is " + avg);
        System.out.println("Please choose another option from our menu:!");
    }
    public void myGrader() throws IOException
    {
        int input, sumA, sumB, sumC, sumD, sumF, sumI, count;
        sumA=sumB=sumC=sumD=sumF=sumI=count=0;
        
        System.out.println("Please enter your grade(s), using -99 at the end to calculate grades:");
        Scanner sc = new Scanner(System.in);
	input = sc.nextInt();
        System.out.println(input);

	if(input==-99) System.exit(1);

	while(input != -99) 
        {
            if(input > 100)
            {
                sumI++;
                System.out.println("This is an invalid score");
            }
            else if(input >= 90)
            {
                sumA++; //add one to A
                System.out.println(input + "      A");
	    }
            else if(input >= 70)
            {
                sumB++;
                System.out.println(input + "      B");
            }
            else if(input >= 50)
            {
                sumC++;
                System.out.println(input + "      C");
            }
            else if(input >= 35)
            {
                sumD++;
                System.out.println(input + "      D");
            }
            else if(input >= 0)
            {
                sumF++;
                System.out.println(input + "      F");
            }
            System.out.println("Please enter another grade [-99 to quit]:");
            input = sc.nextInt();
        }
        System.out.println("The total number of A's is " + sumA);
        System.out.println("The total number of B's is " + sumB);
        System.out.println("The total number of C's is " + sumC);
        System.out.println("The total number of D's is " + sumD);
        System.out.println("The total number of F's is " + sumF);
        System.out.println("Please choose another option from our menu:");
    }  
}
