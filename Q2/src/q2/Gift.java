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
// type = 1 for Essential Gifts ; type = 2 for Luxury Gifts ; type = 3 for Utility Gifts
public class Gift {
    private int value;
    private int price;
    private int type;
    private String id;
    
    Gift(String id, int value, int price, int type) {
        this.value = value;
        this.id = id;
        this.type = type;
        this.price = price;
    }
    
    String getid() {
        return this.id;
    }
    
    int getprice() {
        return this.price;
    }
    
    int getvalue() {
        return this.value;
    }
    
    int gettype() {
        return this.type;
    }
        
}
