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
public class HashFn extends Search {

    int hashfn(String s, int n) {
        String c = s.substring(3);
        return Integer.parseInt(c) % n;
    }

    void search(ArrayList<Boy> lboys, Boy b[], int n, int l) {
        Boy[] bh = new Boy[n];
        //Hash Table used for searching
        for (int i = 0; i < n; i++) {
            int h = hashfn(b[i].getname(), n);
            if (bh[h] == null) {
                bh[h] = b[i];
            } else {
                int j = (h + 1) % n;
                while (j != h) {
                    if (bh[j] == null) {
                        bh[j] = b[i];
                        break;
                    } else {
                        j = (j + 1) % n;
                    }

                }
            }
        }

        for (int i = 0; i < l; i++) {
            int h = hashfn(lboys.get(i).getname(), n);
            int flag = 0;
            if (bh[h].getname().equals(lboys.get(i).getname())) {
                flag = 1;
                System.out.println(lboys.get(i).getname() + " is committed with " + lboys.get(i).g.getname());

            } else {
                int j = (h + 1) % n;
                while (j != h) {
                    if (bh[j].getname().equals(lboys.get(i).getname())) {
                        flag = 1;
                        System.out.println(lboys.get(i).getname() + " is committed with " + lboys.get(i).g.getname());
                        break;
                    } else {
                        j = (j + 1) % n;
                    }
                }
            }
            if (flag == 0) {
                System.out.println(lboys.get(i).getname() + " is single ");
            }
        }

    }

}


