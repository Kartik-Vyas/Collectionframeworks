import java.util.*; 
import java.util.HashMap;

 class Bowling {
    HashMap<String, Integer> players;
    Bowling() 
    {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p)
    {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner()
    {
        int max = 0;
        String name1="";
        for(HashMap.Entry<String,Integer> e : players.entrySet())
        {
            if(max<e.getValue())
            {
                max=e.getValue();
                name1 = e.getKey();

            }
        }
        System.out.print(name1);
    }
    
}

public class HashMap {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) 
        {
            String input = sc.nextLine();
            String[] value = input.split(" ");
            String name = value[0];
            int points = Integer.parseInt(value[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
