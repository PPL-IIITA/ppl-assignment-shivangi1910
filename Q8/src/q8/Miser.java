/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class Miser extends Boy {

    Miser(String name, int attr, int intelli, int budget, int criterion) {
        super(name, attr, intelli, budget, criterion);
        this.type = 1;
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
        ArrayList<Gift> gift = new ArrayList<>();;

        int mtcost = this.g.getbudget();
        int curr = 0;
        int x = 0,i;

        if (k1 == 1) {
            for (int j = 0; j < 50; j++) {
                if (curr < mtcost) {
                    gift.add(Gifts.get(j));
                    x++;
                    curr += Gifts.get(j).getPrice();
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
            
            curr = v;
        }
        
        int x1 = this.getbudget() - curr;
        this.sethappiness(x1);
        return gift;
    }

}
