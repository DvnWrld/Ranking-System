import java.util.HashMap; 


public class Red { 
    
    



     // Creates and sets a hashmap with each player into Red team
    public static HashMap<String, Player> getPlayers(){  
        
        


        HashMap<String,Player> Players = new HashMap<String, Player>();
        

        Players.put("Player1", new Player(88, "Red team"));

        Players.put("Player2", new Player(77, "Red team")); 

        Players.put("Player3", new Player(66, "Red team"));

        return Players;





    } 
    
}
    
