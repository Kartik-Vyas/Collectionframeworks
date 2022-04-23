import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        List<Character> characters = List.of('A','Z','A','B','Z','F');
        // UNIQUE - SET IS USED
        // RANDOM ORDER HASHSET
        // INSERTION ORDER - LINKED HASHSET
        // SORTED ORDER - TREE SET
        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println(hashSet + " - randomly placed");

        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println(linkedHashSet + " - insertion order") ;

        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println(treeSet + " - sorted order");
    }
}
