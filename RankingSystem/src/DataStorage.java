import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;



public class DataStorage { 

    private LinkedList<Player> dataStore;




    // Sets playerList as the new LinkedList
    public DataStorage(HashMap<String, Player> players) { 

        dataStore = new LinkedList<Player>(players.values()); 



    } 
    //Sorts the scores by comparsion.
    public void ScoreSort(){ 


        Collections.sort(dataStore, new Comparator<Player>(){


            public int compare(Player p1, Player p2){  


                return p2.getScore() - p1.getScore();



            } 
        });



            
        } 


        // returns the linkedList
        public LinkedList<Player> getList(){ 

            return dataStore;
        }
    }
    
