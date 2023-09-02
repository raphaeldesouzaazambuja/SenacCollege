import java.util.Scanner;

public class diaSemana 
{
    public static void main(String[] args)
    {
        verificarNumero(args);
    }

    public static void verificarNumero(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int dia;


        System.out.println("Digite um numero de 1 a 7");
        dia = scan.nextInt();
        scan.close();

        switch (dia) 
        {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        
            default:
                System.out.println("Por favor, digite um número do 1 ao 7");
                main(args);
                break;
        }
    }
}
