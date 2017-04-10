/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import static java.lang.Math.log;
import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class Choosy extends Girl{
    
    
    //Constructor of Choosy class
    Choosy(String name,int attr,int intelli,int budget,int criterion)
    {
        super(name,attr,intelli,budget,criterion);
        this.type = 1;
    }
    
    //Gets Happiness of choosy girls
    int getHappiness()
    {
        //int h;
        //h = this.getHappiness();
        //
        return super.gethappiness();
        //return h;
    }
    
    //Updates happiness of Choosy girls
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