/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

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
    
    Couple(Boy a,Girl b) {
        this.boy = a;
        this.girl = b;
        this.happiness = 0;
        this.compatibility = 0;
    }
    
    void sethappiness(int h) {
        this.happiness = h;
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

    

    
}