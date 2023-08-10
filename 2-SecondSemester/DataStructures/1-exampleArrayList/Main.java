import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("A");
        arrayList.add("B");
        
        arrayList.add(0, "1");
        arrayList.add(2, "2");

        System.out.println(arrayList);
    
        if (arrayList.contains("A"))
        {
            System.out.println("This element exist in array");
        }
        else
        {
            System.out.println("This element not exist in array");
        }

        // double[] temperature = new double[365];
        
        // temperature[0] = 32.5; 
        // temperature[1] = 32; 
        // temperature[2] = 33.7; 
        // temperature[3] = 34; 
        // temperature[4] = 33.1;

        // for (int i = 0; i < temperature.length; i++)
        // {
        //     System.out.println("The temperature value of day "+(i+1)+" is "+temperature[i]);
        // }
    }
}