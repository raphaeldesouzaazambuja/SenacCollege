package arrayList;

import java.util.ArrayList;

public class Question4 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(discoverNegativeNumber(numbers));
    }   
    
    public static String discoverNegativeNumber(ArrayList<Integer> numbers)
    {
        String message = "Negative number not discovered";

        for (Integer number : numbers) 
        {
            if(number < 0)
            {
                message = "The index of a first discovered negative number is "+numbers.indexOf(number)+" and the number is "+number;

                return message;
            }    
        }

        return message;
    }
}
