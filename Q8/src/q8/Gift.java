/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

/**
 *
 * @author shivangi
 */
public class Gift {
    
    private String name;
    private int price;
    private int value;
    private int type;
    
    Gift(String name, int price, int value)
    {
        this.name = name;
        this.price = price;
        this.value = value;
    }
    
    int getPrice()
    {
        return this.price;
    }
    
    void setPrice(int price) {
        this.price = price;
    }
    
    int getValue()
    {
        return this.value;
    }
    
    void setValue(int value) {
        this.value = value;
    }
    
    String getName() {
        return this.name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    int getType() {
        return this.type;
    }
    
    void setType(int t) {
        this.type = t;
    }

    boolean getprice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
