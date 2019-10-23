/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballcontroller;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
/**
 *
 * @author Brittany
 */
public class playersfromfile {
    @XmlElement(name = "Player")
    
    private List<Baseball> players = new ArrayList<>();
    
    public List <Baseball> getPlayers(){
        return players;
    }
}
