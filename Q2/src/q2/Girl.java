/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author shivangi
 */
/*criterion = 1 (for choosing most attractive boy)
            = 2 (for choosing most rich boy)
            = 3 (for choosing most intelligent boy)

  type = 1 (Choosy)
       = 2 (Normal)
       = 3 (Desperate)
*/  
public class Girl {
    private String name;
    private int attr;
    private int intelli;
    private int happiness;
    private int budget;
    private int criterion;
    private int type;
    private boolean has_bf;
    private String bf_name;
    
    
    public Girl(String name,int attr,int intelli,int budget,int criterion,int type) {
        this.has_bf = false;
        this.bf_name = "";
        this.name = name;
        this.attr = attr;
        this.intelli = intelli;
        this.budget = budget;
        this.criterion = criterion;
        this.type = type;
        this.happiness = 0;
    }
    
    void gets_bf(boolean b,String name) {
        this.has_bf = true;
        this.bf_name = name;
    }
    
    int gethappiness() {
        return this.happiness;
    }
    
    void sethappiness(int h) {
        this.happiness = h;
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
    
    int gettype() {
        return this.type;
    }
    
    boolean gethas_bf() {
        return this.has_bf;
    }
    
    String getbf_name() {
        return this.bf_name;
    }   
}