import java.util.ArrayList;
import java.util.List;

public class ArrayListExample
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(12);
        numbers.add(3);
        numbers.add(8);
        numbers.add(15);
        numbers.add(6);
        numbers.add(10);
        numbers.add(5);
        numbers.add(9);
        numbers.add(4);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int countEven = 0;

        for (int number : numbers) 
        {
            if (number < min) 
            {
                min = number;
            }

            if (number > max) 
            {
                max = number;
            }

            if (number % 2 == 0) 
            {
                System.out.println("Even Number: " + number);
                countEven++;
            }

            sum += number;
        }

        double average = (double) sum / numbers.size();

        System.out.println();
        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);
        System.out.println("Average: " + average);
    }
}
