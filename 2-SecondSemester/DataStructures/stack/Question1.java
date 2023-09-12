package stack;

import java.util.Stack;

public class Question1 
{
    public static void main(String[] args) 
    {   
        Stack <Integer> S1 = new Stack<>();
        Stack <Integer> S2 = new Stack<>();
        
        S1.push(1);
        S1.push(2);
        S1.push(3);
        S1.push(4);
        S1.push(5);
        
        // S2 = S1;

        // System.out.println(S2);

        for (Integer key : S1) 
        {
            // foreach manipulates the stack in stack format, removing the last one placed, 
            // while the queue (ArrayList) is read as a normal array
            
            S2.push(key);
            
        }
        
        System.out.println(S1);
        System.out.println(S2);
    }
}
