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


public class Girl {
    
    private String name;
    private int attr;
    private int intelli;
    int happiness;
    private int budget;
    private int criterion;
    private boolean has_bf;
    private String bf_name;
    int type;
    
    public Girl(String name,int attr,int intelli,int budget,int criterion) {
        this.has_bf = false;
        this.bf_name = "";
        this.name = name;
        this.attr = attr;
        this.intelli = intelli;
        this.budget = budget;
        this.criterion = criterion;
        this.happiness = 0;
    }
    
    void gets_bf(boolean b,String name) {
        this.has_bf = b;
        this.bf_name = name;
    }
    
    int gethappiness() {
        return this.happiness;
    }
    
    void sethappiness(ArrayList<Gift> Gifts) {
        //this.happiness = h;
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
    
    int getcriterion() {
        return this.criterion;
    }
    
    boolean gethas_bf() {
        return this.has_bf;
    }
    
    String getbf_name() {
        return this.bf_name;
    }   
    
    int getType() {
        return this.type;
    }
    
    void sethas_bf(Boolean b) {
        this.has_bf = b;
    }
}