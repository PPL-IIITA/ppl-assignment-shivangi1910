/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import static java.lang.Math.log;
import java.util.ArrayList;

/**
 * Class of Choosy Girls
 * @author shivangi
 */
public class Choosy extends Girl{
    
    
    
    Choosy(String name,int attr,int intelli,int budget,int criterion)
    {
        super(name,attr,intelli,budget,criterion);
        this.type = 1;
    }
    
    int getHappiness()
    {
        //int h;
        //h = this.getHappiness();
        //
        return super.gethappiness();
        //return h;
    }
    
    /**
     * Sets happiness of choosy girls
     * @param Gifts 
     */
    @Override
    void sethappiness(ArrayList<Gift> Gifts)
    {
        int v= 0;
        for(int i=0;i<Gifts.size() ;i++) {
            if(Gifts.get(i).getType() == 2) {
                v+=2*Gifts.get(i).getPrice();
            }
            else
            {
                v+=Gifts.get(i).getPrice();
            }
        }
        this.happiness = ((int)(Math.log(v)));
    }
    
    
    
}
