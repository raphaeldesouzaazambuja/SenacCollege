package arrayList;

import java.util.ArrayList;

public class Question6 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 1; i < 11; i++) 
        {
            numbers.add(i); 
        }

        System.out.println("Normal numbers "+numbers);
        System.out.println("Inverted numbers "+invertedNumbers(numbers));
    }   
    
    public static ArrayList<Integer> invertedNumbers(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> invertedNumbers = new ArrayList<>();

        for (Integer key : numbers) 
        {
            invertedNumbers.add(0, key);    
        }

        return invertedNumbers;
    }
}
