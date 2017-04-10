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
public class NormalArray extends Search{
    
    void search(ArrayList<Boy> lboys,Boy b[],int n,int l) 
    {
        for (int i = 0; i < l; i++) {
                int flag = 0;
                for (int j = 0; j < n; j++) {
                    if (b[j].getname() == lboys.get(i).getname()) {
                        flag = 1;
                        System.out.println(lboys.get(i).getname() + " is committed with " + lboys.get(i).g.getname());
                    }
                }
                if (flag == 0) {
                    System.out.println(lboys.get(i).getname() + "is single ");
                }
            }
    }
    
}
