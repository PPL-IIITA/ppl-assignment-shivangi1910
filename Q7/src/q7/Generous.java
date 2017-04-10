/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7;

import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class Generous extends Boy{
    
    
    Generous(String name,int attr,int intelli,int budget,int criterion)
    {
        super(name,attr,intelli,budget,criterion);
        this.type = 2;
    }
    
    int getHappiness()
    {
        int h;
        h = this.getHappiness();
        //
        this.sethappiness(h);
        return h;
    }
    
    @Override
    ArrayList<Gift> giveGift(ArrayList<Gift> Gifts)
    {
        int mtcost = this.g.getbudget();
        int x = 0;
        ArrayList<Gift> gift = new ArrayList<>();
        int curr = 0;
        for(int j = 49; j >= 0 ; j--) {
                    if(curr < mtcost) {
                                gift.add(Gifts.get(j));
                                x++;
                                curr += Gifts.get(j).getPrice();
                    }
        }
        int x1 = this.g.gethappiness();
                    this.sethappiness(x1);
        return gift;
    }
}
