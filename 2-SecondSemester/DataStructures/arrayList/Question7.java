package arrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Question7 
{
    public static void main(String[] args)
    {
        ArrayList<String> personName = new ArrayList<>();
        ArrayList<Double> personSalary = new ArrayList<>();
        HashMap<Integer, ArrayList<String>> idPerson = new HashMap<>();
        
        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        int i = 0;

        while (!stop) 
        {
            System.out.print("Name: ");
            String name = scan.nextLine();
            personName.add(name);

            System.out.print("Salary: ");
            double salary = scan.nextDouble();
            personSalary.add(salary + salary * 0.08);

            ArrayList<String> personInfo = new ArrayList<>();
            personInfo.add(personName.get(i));
            personInfo.add(String.valueOf(personSalary.get(i)));

            idPerson.put(i, personInfo);

            scan.nextLine();

            System.out.println("Do you want to register a new collaborator?[1-YES][2-NO]");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option) 
            {
                case 1:
                    i++;
                    break;

                case 2:
                    stop = true;
                    break;

                default:
                    System.out.println("Invalid option. Please enter 1 (YES) or 2 (NO).");
                    break;
            }
        }

        scan.close();

        for (i = 0; i < idPerson.size(); i++) 
        {
            System.out.println(idPerson.get(i));
        }
    }
}
