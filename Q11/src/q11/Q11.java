/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author shivangi
 */
public class Q11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter w;
        w = new PrintWriter("Log.txt");
        //Input generated in CSV files
        InputGenerator gen = new InputGenerator();
        
        Worker11 w1 = new Worker11();
        //Input read from CSV files
        w1.Read();
        //Couples made
        w1.makeCouple(w);
        //Gifting being done
        w1.sendGifts(w);
        w1.printkcouples(w);
        w1.breakup(w);
        
        int t=3;
        for(int i=0;i<t;i++) {
            w1.makeCouple(w);
            w1.sendGifts(w);
            //w.close();
            w1.printkcouples(w);
        }
        Random r = new Random();
        int k = r.nextInt(4);
        w1.find_boys(w,k);
        w.close();
        //Happiest k couples printed
        //w1.printkcouples(w);
        
    }

    
}
