import java.util.HashMap;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> inputStr = new HashMap<>();
        int maxValue = 0;
        char mostChar = ' '; 
        
        for(char c : str.toCharArray())
        {           
            if(!inputStr.containsKey(c))
            {
                inputStr.put(c, 0);
                continue;
            }
            inputStr.replace(c, inputStr.get(c)+1);
        }

        for(Entry<Character, Integer> set: inputStr.entrySet())
        {
            if(set.getValue() > maxValue)
            {
                maxValue = set.getValue();
                mostChar = set.getKey();
            }
        }
        
        return mostChar;
    }
}
