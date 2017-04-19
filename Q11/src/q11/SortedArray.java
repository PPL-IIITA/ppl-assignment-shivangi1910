/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

import java.util.ArrayList;

/**
 *
 * @author shivangi
 */
public class SortedArray extends Search {

    void search(ArrayList<Boy> lboys, Boy b[], int n, int l) {

        Boy b1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (b[i].getname().compareTo(b[j].getname()) > 0) {
                    b1 = b[i];
                    b[i] = b[j];
                    b[j] = b1;

                }
            }
        }

        //Sorted array used for searching
        for (int i = 0; i < l; i++) {
            int flag = 0;
            int low = 0, high = n - 1, mid;
            while (low <= high) {
                mid = (low + high) / 2;
                //System.out.println(b[mid].getname());
                if (b[mid].getname().equals(lboys.get(i).getname())) {
                    flag = 1;
                    System.out.println(lboys.get(i).getname() + " is committed with " + lboys.get(i).g.getname());
                    break;
                } else if (b[mid].getname().compareTo(lboys.get(i).getname()) < 0) {
                    //high = mid -1;
                    low = mid + 1;
                } else {
                    //low = mid+1;
                    high = mid - 1;
                }
            }

            if (flag == 0) {
                System.out.println(lboys.get(i).getname() + " is single ");
            }

        }
    }

}
