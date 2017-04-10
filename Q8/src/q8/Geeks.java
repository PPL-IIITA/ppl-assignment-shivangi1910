/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author shivangi
 */
public class Geeks extends Boy {

    Geeks(String name, int attr, int intelli, int budget, int criterion) {
        super(name, attr, intelli, budget, criterion);
        this.type = 3;
    }

    int getHappiness() {
        int h;
        h = this.getHappiness();
        //
        this.sethappiness(h);
        return h;
    }

    @Override
    ArrayList<Gift> giveGift(ArrayList<Gift> Gifts, int k1) {
        int mtcost = this.g.getbudget();
        ArrayList<Gift> gift = new ArrayList<>();
        int curr = 0;
        int j, i;
        if (k1 == 1) {
            for (j = 0; j < 50; j++) {
                if (curr < mtcost) {

                    gift.add(Gifts.get(j));
                    curr += Gifts.get(j).getPrice();
                    //System.out.println(couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getName()+" to "+couples.get(i).getGirl().getname());
                    //                    Timestamp TS = new Timestamp(System.currentTimeMillis());
                    //                    w.println(TS + couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getName()+" to "+couples.get(i).getGirl().getname());
                }
            }
            int a = this.getbudget() - curr;
            if (a > 0) {
                for (int k = j; k < 50; k++) {
                    if (Gifts.get(k).getType() == 2 && a >= Gifts.get(k).getPrice()) {
                        gift.add(Gifts.get(k));
                        //System.out.println(couples.get(i).getBoy().getname()+" gifts "+gifts.get(k).getName()+" to "+couples.get(i).getGirl().getname());
                        //Timestamp TS = new Timestamp(System.currentTimeMillis());
                        //w.println(TS + couples.get(i).getBoy().getname()+" gifts "+gifts.get(k).getName()+" to "+couples.get(i).getGirl().getname());break;
                    }
                }
            }
        } 
        else {
            gift.add(Gifts.get(0));
            int t1 = Gifts.get(0).getType(),t2=0,u1=0,u2 =0;
            int v = Gifts.get(0).getPrice();
            for(i=1;i<Gifts.size();i++)
            {
                if(Gifts.get(i).getType()!=t1)
                {
                    gift.add(Gifts.get(i));
                    v += Gifts.get(i).getPrice();
                    t2 = Gifts.get(i).getType();
                    u1 = i;
                    break;
                }
            }
            for(i=u1+1;i<Gifts.size();i++)
            {
                if(Gifts.get(i).getType()!=t1 && Gifts.get(i).getType()!=t2)
                {
                    gift.add(Gifts.get(i));
                    v += Gifts.get(i).getPrice();
                    u2 = i;
                    break;
                }
            }
            if(this.getbudget()<v)
                this.setbudget(v);
            
            else {
                for(i=1;i<=Gifts.size() && v+Gifts.get(i).getPrice() < this.getbudget();i++)
                {
                    if(i!=u1 && i!=u2)
                    {
                        v+=Gifts.get(i).getPrice();
                        gift.add(Gifts.get(i));
                    }
                }    
            }
            
            
        }

        int x1 = this.g.getintelli();
        this.sethappiness(x1);
        return gift;
    }

}
