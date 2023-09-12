package arrayList;

import java.util.ArrayList;

public class Question9 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> logic = new ArrayList<>();
        ArrayList<Integer> programmingLanguage = new ArrayList<>();
        ArrayList<Integer> equalValues = new ArrayList<>();
        

        logic.add(2513);
        logic.add(2134);
        logic.add(5412);
        logic.add(4217);
        logic.add(2121);
        logic.add(3749);
        logic.add(4012);
        logic.add(5122);
        logic.add(2387);
        logic.add(3888);
        logic.add(3122);
        logic.add(5551);
        logic.add(5432);
        logic.add(2122);
        logic.add(2098);

        programmingLanguage.add(3444);
        programmingLanguage.add(2121);
        programmingLanguage.add(4331);
        programmingLanguage.add(2387);
        programmingLanguage.add(5551);
        programmingLanguage.add(4335);
        programmingLanguage.add(2766);
        programmingLanguage.add(2098);
        programmingLanguage.add(4775);
        programmingLanguage.add(3749);

        logic.addAll(logic);

        for (Integer key : logic) 
        {
            
            if (programmingLanguage.contains(key)) 
            {
                equalValues.add(key);
            }
        }

        System.out.println(equalValues);
    }    
}
