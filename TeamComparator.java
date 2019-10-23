/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballcontroller;

import java.util.Comparator;
/**
 *
 * @author Brittany
 */
public class TeamComparator implements Comparator<Baseball> {
    
   @Override
   public int compare(Baseball o1, Baseball o2 ){
       return o1.getTeam().compareTo(o2.getTeam());
   }
}
