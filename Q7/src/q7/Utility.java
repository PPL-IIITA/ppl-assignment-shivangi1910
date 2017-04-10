/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7;

/**
 *
 * @author shivangi
 */
public class Utility extends Gift{
    
    int uclass;
    int uvalue;
    
    Utility(String name,int price, int value, int uclass, int uvalue)
    {
        super(name,price,value);
        this.uclass = uclass;
        this.uvalue = uvalue;
        this.setType(3);
    }

       
}
