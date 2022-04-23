import java.util.HashMap;
import java.util.Map;

public class CharacterRepeated {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. This has never happened before.";
        Map<Character,Integer> occurance = new HashMap<>();
        char[] characters = str.toCharArray();
        for(char character : characters)
        {
            Integer integer = occurance.get(character);
            if(integer == null)
            {
                occurance.put(character,1);
            }
            else
            {
                occurance.put(character,integer+1);
            }
        }
        System.out.println(occurance);

        // for words using String

        Map<String,Integer> stringOccur = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words)
        {
            Integer integer1 = stringOccur.get(word);
            if(integer1 == null)
            {
                stringOccur.put(word,1);
            }
            else
            {
                stringOccur.put(word,integer1+1);
            }
        }
        System.out.println(stringOccur);
    }
}
