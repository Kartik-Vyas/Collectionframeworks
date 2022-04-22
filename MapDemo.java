import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",3,"B",5,"Z",10);
        Map<String,Integer> HashMap = new HashMap<>(map);
        //get()
        System.out.println(HashMap.get("Z"));
        //size()
        System.out.println(HashMap.size());
        //isEmpty()
        System.out.println(HashMap.isEmpty());
        //ContainsKey()
        System.out.println(HashMap.containsKey("f"));
        //containsValue()
        System.out.println(HashMap.containsValue(3));
        //value()
        System.out.println(HashMap.values());

        System.out.println(HashMap);
        System.out.println("-------------------");

        Map<String,Integer> Linked = new LinkedHashMap<>(map);
        System.out.println(Linked); //based on insertion order
        Linked.put("G",25);
        System.out.println(Linked);
        System.out.println("---------------------");

        Map<String,Integer> tree = new TreeMap<>(map); // based on sorted order
        tree.put("K",14);
        System.out.println(tree);



    }
}
