package arrayList;

import java.util.ArrayList;

public class Question3 extends Question1
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(11);
        numbers.add(9);
        numbers.add(2);
        numbers.add(11);
        numbers.add(12);
        numbers.add(5);
        numbers.add(14);
        numbers.add(6);
        numbers.add(13);

        Integer smaller = smaller(numbers);
        Integer bigger = bigger(numbers);

        System.out.print("\nThe number "+smaller+" is in "+numbers.indexOf(smaller)+" position in list and ");
        System.out.println("the number "+bigger+" is in "+numbers.indexOf(bigger)+" position in list");

        System.out.println("The numerical difference between " +smaller+" and "+bigger+" are "+(bigger-smaller));
    }
}
