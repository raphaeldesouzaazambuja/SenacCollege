package arrayList;

import java.util.ArrayList;

public class Question8 
{
    public static void main (String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        
        System.out.println("The odd numbers are "+odd(numbers)+" and list size is "+ odd(numbers).size());
        System.out.println("The even numbers are "+even(numbers)+" and list size is "+ even(numbers).size());
        
    }

    public static ArrayList<Integer> odd(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (Integer key : numbers) 
        {
            if (key % 2 != 0 )
            {
                oddNumbers.add(key);
            }
        }

        return oddNumbers;
    }

    public static ArrayList<Integer> even(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (Integer key : numbers)
        {
            if (key % 2 == 0)
            {
                evenNumbers.add(key);
            }
        }

        return evenNumbers;
    }

}
