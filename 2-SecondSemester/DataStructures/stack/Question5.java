package stack;
import java.util.Scanner;
import java.util.Stack; 

public class Question5
{    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a word");
        String word = scan.nextLine();
        scan.close();

        if (isPalindrome(word)) 
        {
            System.out.println(word + " is a palindrome.");
        } 
        else 
        {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String word) 
    {
        word = word.replaceAll("\\s+", "").toLowerCase();
    
        Stack<Character> stack = new Stack<>();
    
        for (char key : word.toCharArray()) 
        {
            stack.push(key);
        }
        
        for (char key : word.toCharArray()) 
        {
        
            if (stack.pop() != key) 
            {
                return false;
            }
        }

        return true;
    }
    
}
