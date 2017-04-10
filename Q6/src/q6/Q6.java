/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author shivangi
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter w;
        w = new PrintWriter("Log.txt");
        InputGenerator gen = new InputGenerator();
        //gen.InputGenerator1();
        Worker w1 = new Worker();
        w1.Read();
        //Random r = new Random();
        //int t = r.nextInt(3)+1;
        int t=3;
        for(int i=0;i<t;i++) {
            w1.makeCouple(w);
            w1.sendGifts(w);
            //w.close();
            w1.printkcouples(w);
        }
        w.close();
    }
}