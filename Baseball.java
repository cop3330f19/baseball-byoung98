/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballcontroller;

/**
 *
 * @author Brittany
 */
public class Baseball {
    private String player;
    private String team;
    private int atBats;
    private int hits;
    private double battingAvg;
    
    //default constructor
    public Baseball(){
     this.player = "";
     this.team = "";
     this.atBats = 0;
     this.hits = 0;
     this.battingAvg = 0;
    }
    
public Baseball(String player, String team, int atBats, int hits){
    this.player = player;
    this.team = team;
    this.atBats = atBats;
    this.hits = hits;
    this.battingAvg = (hits/atBats);
    
    }

public String getPlayer(){
    return player;
}

public void setPlayer(String player){
this.player = player;    
}
        
        
public String getTeam(){
    return team;
}

public void setTeam(String team){
 this.team = team;   
}

public int getatBats(){
    return atBats;
}

public void setatBats(int atBats){
    this.atBats = atBats;
}

public int gethits(){
    return hits;
}

public void setHits(int hits){
    this.hits = hits;
}

public void setBattingAvg(int atBats, int hits){
    this.battingAvg = (hits/atBats);
    
}




}
