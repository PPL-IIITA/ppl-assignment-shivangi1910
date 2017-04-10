/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import java.util.ArrayList;

/**
 * Couple class 
 * @author shivangi
 */
public class Couple {
    
    Boy boy;
    Girl girl;
    private int happiness;
    private int compatibility;
    public static ArrayList<Gift> gifts = new ArrayList<>();
    
    
    Couple(Boy a,Girl b) {
        this.boy = a;
        this.girl = b;
        this.happiness = 0;
        this.compatibility = 0;
    }

    /**
     * sets happiness of a couple
     */
    void sethappiness() {
        this.girl.sethappiness(gifts);
        this.happiness = this.girl.gethappiness() + this.boy.gethappiness();
        //this.happiness = h;
    }
    
    void setcompatibility(int v) {
        this.compatibility = v;
    }
    Boy getBoy() {
        return this.boy;
    }
    
    Girl getGirl() {
        return this.girl;
    }
    
    /**
     * This function returns happiness of the couple
     * @return 
     */
    int gethappiness() {
        return this.happiness;
    }
    
    /**
     * Gets compatibility of a couple
     * @return 
     */
    
    int getcompatibility() {
        return this.compatibility;
    }   
    
    /**
     * Gives Gifts
     * @param Gifts
     * @param k
     * @return Gift array
     */
    
    ArrayList<Gift> giveGift(ArrayList<Gift> Gifts,int k) {
        ArrayList<Gift> g = this.boy.giveGift(Gifts,k);
        this.getGirl().sethappiness(g);
        return g;
    }
  
}