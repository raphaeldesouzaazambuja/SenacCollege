public class Question1
{
    public static void main(String[] args)
    {
        // Print corresponding day of the week
        System.out.println("Print corresponding day of the week:");
        byte dayOfWeek = 3;

        switch (dayOfWeek)
        {
            case 1:
                System.out.println(dayOfWeek + " = Monday");
                break;

            case 2:
                System.out.println(dayOfWeek + " = Tuesday");
                break;

            case 3:
                System.out.println(dayOfWeek + " = Wednesday");
                break;

            case 4:
                System.out.println(dayOfWeek + " = Thursday");
                break;

            case 5:
                System.out.println(dayOfWeek + " = Friday");
                break;

            case 6:
                System.out.println(dayOfWeek + " = Saturday");
                break;

            case 7:
                System.out.println(dayOfWeek + " = Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }

        // Print "10" twenty times using a while loop
        System.out.println("Print x, starting from 10, 20 times using while:");
        byte i = 0;
        byte x = 10;

        while(i <= 20)
        {
            System.out.println(x);
            x++;
            i++;
        }

        // Previous example using a do-while loop
        System.out.println("Print x, starting from 10, 20 times using do-while:");
        i = 0;
        x = 10;

        do
        {
            System.out.println(x);
            x++;
            i++;
        }
        while(i <= 20);

        // Calculate the area of a trapezoid
        int h = 1;
        int b = 3;
        int B = 4;
        double area = (h * (b + B)) / 2.0;

        System.out.println("Area: " + area);
    }

}
