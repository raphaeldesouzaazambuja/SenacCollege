package arrayList;

import java.util.ArrayList;

public class Question2
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("The triple of "+ numbers +" is "+triplicateNumbers(numbers));
    }

    public static ArrayList<Integer> triplicateNumbers(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> newArrayList = new ArrayList<>();

        for(Integer key : numbers)
        {
            newArrayList.add(key*3);
        }

        return newArrayList;
    }
}
