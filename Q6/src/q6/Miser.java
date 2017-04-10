/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class Miser extends Boy{
    
    
    Miser(String name,int attr,int intelli,int budget,int criterion)
    {
        super(name,attr,intelli,budget,criterion);
        this.type = 1;
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
    ArrayList<Gift> giveGift(ArrayList<Gift> gifts) {
        ArrayList<Gift> gift = new ArrayList<>();;
        int mtcost = this.g.getbudget();
        int curr = 0;
        int x = 0;
        for(int j = 0; j < 50 ; j++) {
                    if(curr < mtcost) {
                                gift.add(gifts.get(j));
                                x++;
                                curr += gifts.get(j).getPrice();
                    }
                }
        int x1 = this.getbudget() - curr;
                    this.sethappiness(x1);
        return gift;
    }
    
}
