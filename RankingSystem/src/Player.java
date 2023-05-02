

//Player implemnts the rankable file.
public class Player implements Rankable { 


    private int score;
    private int rank;
    private String team; 


    // Sets players parmaters taking score and desinated team.
    public Player(int score, String team){  


        this.score = score;

        this.team = team;





    } 
    //sets the rank
    public void setRank(int rank){ 

        this.rank = rank;
    }
    

    // Gets and returns the score for the player
    public int getScore() {
        
        return score;




    }

    // Gets and returns the name of the team of the player
    public String getTeam(){ 



        return team;
     
    }
    // Overrides Method
    @Override 



    // Gets and returns the rank of the player.
    public int getRank(){ 


        return rank;

    }
    // put both string and player values 
    
    



    
}
