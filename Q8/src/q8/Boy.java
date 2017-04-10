/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Boy class contains common attributes of the 3 types of boys
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
    
    /**
     * Updates values of common attributes of 3 types of boys
     * @param name
     * @param attr
     * @param intelli
     * @param budget
     * @param min_attr_req 
     */
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
    
    int gethappiness() {
        return this.happiness;
    }
    
    void sethappiness(int h) {
        this.happiness = h;
    }
    
    void gets_gf(boolean b,Girl g) {
        this.has_gf = b;
        this.g = g;
    }
    
    ArrayList<Gift> giveGift(ArrayList<Gift> Gifts,int k) {
        return Gifts;
    }
    
    
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
    
    void setbudget(int s) {
        this.budget=s;
    }
    
    int getmin_attr_req() {
        return this.min_attr_req;
    }
    
    boolean gethas_gf() {
        return this.has_gf;
    }
    
    void sethas_gf(Boolean b) {
        this.has_gf = b;
    }
    
    String getgf_name() {
        return this.gf_name;
    }
    
    int getType() {
        return this.type;
    }
    
    
}
