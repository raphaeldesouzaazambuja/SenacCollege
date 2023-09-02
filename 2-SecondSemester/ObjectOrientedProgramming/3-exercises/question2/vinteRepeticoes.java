public class vinteRepeticoes 
{    
    public static void main(String[] args)
    {
        int x = 10;
        int contador = 0;
        
        withWhile(x, contador);
        System.out.println("");
        withDoWhile(x, contador);
    }

    public static void withWhile(int x, int contador) 
    {
         while (contador < 20) 
        {
            System.out.println("Valor de x: " + x);
            x++; 
            contador++;
        }    
    }

    public static void withDoWhile(int x, int contador) 
    {
        do {
            System.out.println("Valor de x: " + x);
            x++; 
            contador++;
        
        } while (contador < 20);
    }
}
