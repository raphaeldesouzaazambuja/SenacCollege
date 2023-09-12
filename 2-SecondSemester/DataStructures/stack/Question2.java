package stack;

import java.util.Stack;

public class Question2 
{
    public static void main(String[] args) 
    {
        Stack <Integer> S1 = new Stack<>();
        Stack <Integer> S2 = new Stack<>();
        Stack <Integer> auxiliar = new Stack<>();
        
        S1.push(1);
        S1.push(2);
        S1.push(3);
        S1.push(4);
        S1.push(5);

        while(!S1.empty())
        {
            auxiliar.push(S1.pop());
        }
      
        while(!auxiliar.empty())
        {
            S2.push(auxiliar.pop());
        }

        System.out.println(S2);
    }
}
