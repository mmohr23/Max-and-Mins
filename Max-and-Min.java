import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        
        // declare variables
        int smallest = 1000;
        int largest= 0;
        int num = 1;
        
        // scanner
        Scanner scanner = new Scanner(System.in);
        //SCANNER NEEDS TO BE OUTSIDE OF WHILE LOOP TO 
        //ELIMINATE ANY ERRORS WITH PROGRAM. 
        //if scanner is in loop, it creates a new scanner
        //each time the loop runs. 
        
        // while loop, num != 0.
        while(num > 0)
        {
            
            //ask for number from user. 
            System.out.println("Enter a number or 0 to quit:");
            num = scanner.nextInt();
            //stores the user's unput. 
            
            // if num = 0, break. 
            if(num == 0)
            {
                break;
                //breaks the loop if the condition is met. 
            }
            
            //if num greater than largest, replace.
            if(num > largest)
            {
                largest = num;
                // largest number is replaced with new number,
                // only if it is larger than original largest number. 
            }
            
            // if num less than smallest, replace. 
            if(num < smallest)
            {
                smallest = num;
                //smallest number is replaced with new number,
                //only if it is smaller than original smallest number. 
            }
            
            // print results. 
            System.out.println("Results so far:");
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            //prints the results of the program before going to repeat
            //the while loop. 
        }
    }
}