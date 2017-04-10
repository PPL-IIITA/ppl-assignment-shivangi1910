/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author shivangi
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter w;
        w = new PrintWriter("Log.txt");
        //Input generated in CSV files
        InputGenerator gen = new InputGenerator();
        
        Worker w1 = new Worker();
        //Input read from CSV files
        w1.Read();
        //Couples made
        w1.makeCouple(w);
        //Gifting being done
        w1.sendGifts(w);
        w.close();
        //Happiest k couples printed
        w1.printkcouples();
    }
}
