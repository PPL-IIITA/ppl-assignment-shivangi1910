/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class Boy {
    
    Girl g;
    private String name;
    int happiness;
    private int attr;
    private int intelli;
    private int budget;
    private int min_attr_req;
    private boolean has_gf;
    private String gf_name;
    int type;
    
    /* Constructor of Boy class */
    public Boy(String name,int attr,int intelli,int budget,int min_attr_req) {
        this.has_gf = false;
        this.gf_name = "";
        this.name = name;
        this.attr = attr;
        this.intelli = intelli;
        this.budget = budget;
        this.min_attr_req = min_attr_req;
        this.happiness = 0;
    }
    
    // Getter Method
    int gethappiness() {
        return this.happiness;
    }
    
    //Setter Method
    void sethappiness(int h) {
        this.happiness = h;
    }
    
    //Function to update relationship status
    void gets_gf(boolean b,Girl g) {
        this.has_gf = b;
        this.g = g;
    }
    
    //Function returns Gifts given by the boy 
    ArrayList<Gift> giveGift(ArrayList<Gift> Gifts) {
        return Gifts;
    }
    
    //Getter methods
    String getname() {
            return this.name;
    }
    
    int getattr() {
            return this.attr;
    }
    
    int getintelli() {
        return this.intelli;
    }
    
    int getbudget() {
        return this.budget;
    }
    
    int getmin_attr_req() {
        return this.min_attr_req;
    }
    
    boolean gethas_gf() {
        return this.has_gf;
    }
    
    String getgf_name() {
        return this.gf_name;
    }
    
    int getType() {
        return this.type;
    }
    
    
}
