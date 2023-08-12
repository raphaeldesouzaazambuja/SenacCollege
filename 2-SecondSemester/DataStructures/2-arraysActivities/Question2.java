import java.util.Scanner;
import java.util.ArrayList;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int num;
        ArrayList<Integer> A = new ArrayList<>();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Type the Number");
            System.out.println(num = scan.nextInt());

            num = num*3;

            A.add(num);
        }

        System.out.println(A);
        scan.close();
    }

}
