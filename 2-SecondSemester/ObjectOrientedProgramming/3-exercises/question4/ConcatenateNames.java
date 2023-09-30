import javax.swing.JOptionPane;

public class ConcatenateNames 
{
    public static void main(String[] args) 
    {
        String firstName = JOptionPane.showInputDialog("Enter your first name:");
        String lastName = JOptionPane.showInputDialog("Enter your last name:");

        String fullName = firstName + " " + lastName;

        JOptionPane.showMessageDialog(null, "Full Name: " + fullName);
    }
}
