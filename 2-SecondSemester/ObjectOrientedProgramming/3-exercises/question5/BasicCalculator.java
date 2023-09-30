import javax.swing.JOptionPane;

public class BasicCalculator 
{
    public static void main(String[] args) 
    {
        try 
        {
            String input1 = JOptionPane.showInputDialog("Enter the first integer:");
            int num1 = Integer.parseInt(input1);

            String input2 = JOptionPane.showInputDialog("Enter the second integer:");
            int num2 = Integer.parseInt(input2);

            int sum = num1 + num2;
            int subtraction = num1 - num2;
            int multiplication = num1 * num2;

            String divisionResult = "";
            if (num2 != 0) 
            {
                int division = num1 / num2;
                divisionResult = Integer.toString(division);
            } 
            else 
            {
                divisionResult = "Division by zero is not allowed.";
            }

            String message = "Sum: " + sum + "\nSubtraction: " + subtraction + "\nMultiplication: " + multiplication + "\nDivision: " + divisionResult;

            JOptionPane.showMessageDialog(null, message);
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Please enter valid integers.");
        }
    }
}
