package stack;

import java.util.Stack;

public class Question3 
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
        
        S2.push(1);
        S2.push(2);
        S2.push(3);
        S2.push(4);
        S2.push(5);

        if (S1.equals(S2)) 
        {
            System.out.println("The stacks are equal");
        } 
        else 
        {
            System.out.println("The stacks have different elements.");
        }
    }    
}
