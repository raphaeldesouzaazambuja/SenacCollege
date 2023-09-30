import javax.swing.JOptionPane;

public class DayOfWeek 
{
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number from 1 to 7:");

        int number = Integer.parseInt(input);

        String dayOfWeek = "";

        switch (number) 
        {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid number";
                break;
        }

        JOptionPane.showMessageDialog(null, "Corresponding day of the week: " + dayOfWeek);
    }
}
