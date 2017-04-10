/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author shivangi
 */
public class Luxury extends Gift{
    
    int dif;
    int rating;
    //private final int type;
    
    Luxury(String name, int price, int value, int dif, int rating)
    {
        super(name,price,value);
        this.dif = dif;
        this.rating = rating;
        this.setType(1);
    }
    
    
    
}
