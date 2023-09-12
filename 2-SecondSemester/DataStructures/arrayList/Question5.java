package arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question5
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = randomNumber();
        
        System.out.println(numbers);
        System.out.print("Guess a number between -100 and 100\n-> ");
        Integer response = scan.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.size(); i++) 
        {
            if (numbers.get(i).equals(response)) 
            {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Element not found");
        }

        scan.close();
    }

    public static ArrayList<Integer> randomNumber()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) 
        {
            numbers.add(random.nextInt(201) - 100);
        }

        return numbers;
    }
}
