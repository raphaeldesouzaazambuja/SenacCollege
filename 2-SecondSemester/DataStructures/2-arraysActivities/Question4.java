import java.util.Scanner;
import java.util.ArrayList;

public class Question4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int validate = 0;
        int num;
        ArrayList<Integer> A = new ArrayList<>();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Type the Number");
            System.out.println(num = scan.nextInt());

            A.add(num);
        }

        for(int i = 0; i < 5; i++)
        {
            if(A.get(i) < 0)
            {
                System.out.println("The number is "+ A.get(i));
                validate = 1;
                i = 5;
            }
            else
            {
                validate = 0;
            }
        }

        if(validate == 0)
        {
            System.out.println("Dont have a negative numbers");
        }

        scan.close();
    }
}
