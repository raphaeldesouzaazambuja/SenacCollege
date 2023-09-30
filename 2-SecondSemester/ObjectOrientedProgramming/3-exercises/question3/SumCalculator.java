import javax.swing.JOptionPane;

public class SumCalculator 
{
    public static void main(String[] args) 
    {
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        double num1 = Double.parseDouble(input1);
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        double num2 = Double.parseDouble(input2);
        double result = num1 + num2;
        JOptionPane.showMessageDialog(null, "The sum is: " + result);
    }
}
