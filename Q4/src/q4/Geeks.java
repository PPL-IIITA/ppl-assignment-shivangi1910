/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

import java.sql.Timestamp;
import java.util.ArrayList;


/**
 *
 * @author shivangi
 */
public class Geeks extends Boy {
    
    Geeks(String name,int attr,int intelli,int budget,int criterion)
    {
        super(name,attr,intelli,budget,criterion);
        this.type = 3;
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
    ArrayList<Gift> giveGift(ArrayList<Gift> Gifts) {
        int mtcost = this.g.getbudget();
        ArrayList<Gift> gift = new ArrayList<>();
        int curr = 0;
        int j;
        for( j = 0; j < 50 ; j++) {
            if(curr < mtcost) {
            
                gift.add(Gifts.get(j));
                curr += Gifts.get(j).getPrice();
            //System.out.println(couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getName()+" to "+couples.get(i).getGirl().getname());
            //                    Timestamp TS = new Timestamp(System.currentTimeMillis());
            //                    w.println(TS + couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getName()+" to "+couples.get(i).getGirl().getname());
            }
        }
        int a = this.getbudget() - curr;
        if(a > 0) {
                    for ( int k = j ; k < 50 ; k++) {
                        if(Gifts.get(k).getType() == 2 && a >= Gifts.get(k).getPrice()) {
                            gift.add(Gifts.get(k));
                            //System.out.println(couples.get(i).getBoy().getname()+" gifts "+gifts.get(k).getName()+" to "+couples.get(i).getGirl().getname());
                            //Timestamp TS = new Timestamp(System.currentTimeMillis());
                            //w.println(TS + couples.get(i).getBoy().getname()+" gifts "+gifts.get(k).getName()+" to "+couples.get(i).getGirl().getname());break;
                        }
                    }
                }
        int x1 = this.g.getintelli();
                    this.sethappiness(x1);
        return gift;
    }
    
    
}
