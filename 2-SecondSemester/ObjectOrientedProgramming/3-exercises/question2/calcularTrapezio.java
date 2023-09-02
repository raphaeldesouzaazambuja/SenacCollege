import java.util.Scanner;

public class calcularTrapezio 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite os dados para realizar o calculo para área do trapézio");
        System.out.print("Altura-> ");
        int h = scan.nextInt();

        System.out.print("Base menor-> ");
        int b = scan.nextInt();
        
        System.out.print("Base maior-> ");
        int B = scan.nextInt();

        scan.close();

        double a = (h*(b+B))/2;

        System.out.println("\nA área do trapézio é "+a);
    }    
}
