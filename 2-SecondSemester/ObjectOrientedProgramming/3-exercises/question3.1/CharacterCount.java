public class CharacterCount 
{
    public static void main(String[] args)
    {
        String sentence = "This is an example sentence with more than 50 characters.";

        int characterCount = sentence.length();

        if (characterCount > 50) 
        {
            System.out.println("Long sentence!");
        } 
        else 
        {
            System.out.println("Short sentence!");
        }
    }
}
