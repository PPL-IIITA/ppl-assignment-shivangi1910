/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;
/**
 *
 * @author shivangi
 */
// type = 1 for miser ; type = 2 for generous ; type = 3 for geeks
public class Boy {
    
    private String name;
    private int attr;
    private int intelli;
    private int budget;
    private int min_attr_req;
    private int type;
    private boolean has_gf;
    private String gf_name;
    
    
    public Boy(String name,int attr,int intelli,int budget,int min_attr_req,int type) {
        this.has_gf = false;
        this.gf_name = "";
        this.name = name;
        this.attr = attr;
        this.intelli = intelli;
        this.budget = budget;
        this.min_attr_req = min_attr_req;
        this.type = type;
    }
    
    void gets_gf(boolean b,String name) {
        this.has_gf = true;
        this.gf_name = name;
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
    
    int getmin_attr_req() {
        return this.min_attr_req;
    }
    
    int gettype() {
        return this.type;
    }
    
    boolean gethas_gf() {
        return this.has_gf;
    }
    
    String getgf_name() {
        return this.gf_name;
    }
    
    
}
