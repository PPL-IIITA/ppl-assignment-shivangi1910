/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class Normal extends Girl{
    
        
    Normal(String name,int attr,int intelli,int budget,int criterion)
    {
        super(name,attr,intelli,budget,criterion);
        this.type = 2;
    }
    
    int getHappiness()
    {
        return this.happiness;
    }
    
    @Override
    void sethappiness(ArrayList<Gift> Gifts)
    {
        int v= 0;
        for(int i=0;i<Gifts.size() ;i++) {
                v = v + Gifts.get(i).getPrice() + Gifts.get(i).getValue();
            }
        this.happiness = v;
    }
    
}
