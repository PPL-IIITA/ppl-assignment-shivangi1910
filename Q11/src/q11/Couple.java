/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class Couple {
    
    Boy boy;
    Girl girl;
    private int happiness;
    private int compatibility;
    public static ArrayList<Gift> gifts = new ArrayList<>();
    
    //Constructor
    Couple(Boy a,Girl b) {
        this.boy = a;
        this.girl = b;
        this.happiness = 0;
        this.compatibility = 0;
    }

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
    
    int gethappiness() {
        return this.happiness;
    }
    
    int getcompatibility() {
        return this.compatibility;
    }   
    
    //Performs gifting
    ArrayList<Gift> giveGift(ArrayList<Gift> Gifts) {
        ArrayList<Gift> g = this.boy.giveGift(Gifts);
        this.getGirl().sethappiness(g);
        return g;
    }
}