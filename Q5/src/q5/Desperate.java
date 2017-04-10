/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class Desperate extends Girl{
    
    //int happiness;
    
    Desperate(String name,int attr,int intelli,int budget,int criterion)
    {
        super(name,attr,intelli,budget,criterion);
        this.type = 3;
    }
    
    int getHappiness()
    {
        //int h;
        //h = this.getHappiness();
        //
        return this.happiness;
    }
    
    @Override
    void sethappiness(ArrayList<Gift> Gifts)
    {
        int v= 0;
        for(int i=0;i<Gifts.size() ;i++) {
                v+=Gifts.get(i).getPrice();
        }
        this.happiness = ((int)(Math.pow(1.12,v)));
    }
    
}
