package stack;

import java.util.Scanner;
import java.util.Stack;

public class Question4 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a word");
        String word = scan.nextLine();
        scan.close();

        String reversedWord = reverseWord(word);

        System.out.println(reversedWord);
    }

    private static String reverseWord(String word) 
    {
        Stack<Character> stack = new Stack<>();
    
        for (char key : word.toCharArray()) 
        {
            stack.push(key);
        }
        
        StringBuilder reversedWord = new StringBuilder();
        
        while (!stack.isEmpty()) 
        {
            reversedWord.append(stack.pop());
        }
        
        return reversedWord.toString();
    }
}
