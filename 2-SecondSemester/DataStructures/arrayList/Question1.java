package arrayList;

import java.util.ArrayList;

public class Question1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("\nThe numbers in list is "+numbers+"\n");
        
        System.out.println("The smallest number is "+smaller(numbers));
        System.out.println("The biggest number is "+bigger(numbers));
        System.out.println("The sum of all numbers is "+ sum(numbers));
    }
    
    public static Integer smaller(ArrayList<Integer> numbers)
    {

        Integer smaller = numbers.get(0);

        for (Integer number : numbers) 
        {
            if(number < smaller)
            {
                smaller = number;
            }
        }

        return smaller;
    }

    public static Integer bigger(ArrayList<Integer> numbers)
    {
        Integer bigger = numbers.get(0);

        for (Integer number : numbers)
        {
            if (number > bigger)
            {
                bigger = number;
            }
        }

        return bigger;
    }

    public static Integer sum(ArrayList<Integer> numbers)
    {
        Integer sum = 0;

        for (Integer number : numbers)
        {
            sum += number;
        }

        return sum;
    }
}