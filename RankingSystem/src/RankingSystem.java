import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;





public class RankingSystem {



    public static void main(String[] args) throws Exception { 





        //Puts all players into a hashmap and sorts its Scores.
        HashMap<String, Player> players = new HashMap<String, Player>();

        players.putAll(Red.getPlayers());
        players.putAll(Blue.getPlayers());

        DataStorage dataStore = new DataStorage(players);
        
        dataStore.ScoreSort(); 


        int RankofBlue = 1;
        int RankofRed = 1;



        //a for loop thats gets the list of both Red team and Blue team and then sets the rank of each player and prints it by team recurrsively
        for(int i = 0 ; i < dataStore.getList().size(); i++){ 
            
            Player player = dataStore.getList().get(i);

            if(player.getTeam().equals("Red team")){


                if(i > 0 && player.getScore() != dataStore.getList().get(i - 1).getScore()){ 


                    RankofRed = i + 1; 

                } 
                player.setRank(RankofRed);
            } 
            else if(player.getTeam().equals("Blue team")){ 


                if( i > 0 && player.getScore() != dataStore.getList().get(i -1).getScore()){ 
                    
                    RankofBlue = i + 1;

                }

                player.setRank(RankofBlue);

            } 


         } 
         

         System.out.println("Red team:"); 


         //Suppose to print out rank of both Red and blue teams in two different sections 
         List<Player> dataStorage = new ArrayList<Player>(players.values());

         for (Player player : dataStorage){ 

        

            System.out.println(" - " + player.getScore()); 

         }

         
            System.out.println();

            List<Player> dataStores= new ArrayList<Player>(players.values());


            System.out.println("Blue team"); 

            for(Player player :dataStores ){  
                
                System.out.println(" - " + player.getScore());




            }


        }

    } 
