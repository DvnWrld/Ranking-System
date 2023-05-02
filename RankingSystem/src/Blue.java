import java.util.HashMap; 



public class Blue { 
    

    // Creates and sets a hashmap with each player into Blue team
    public static HashMap<String, Player> getPlayers(){  
        
        


        HashMap<String,Player> Players = new HashMap<String, Player>();
        

        Players.put("Player5", new Player(100, "Blue team"));

        Players.put("Player6", new Player(94, "Blue team")); 

        Players.put("Player7", new Player(83, "Blue team"));

        return Players;





    } 
    
}
