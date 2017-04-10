/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class GiftSelector2 extends GiftSelector {
    
    ArrayList<Gift> sendGifts(Couple c,ArrayList<Gift> gifts)
    {
        return c.giveGift(gifts,2);
    }
    
    
}
