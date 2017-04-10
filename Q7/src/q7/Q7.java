/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author shivangi
 */
public class Q7 {

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
        Random r = new Random();
        int k = r.nextInt(3)+1;
        w1.find_boys(k);
        w.close();
    }
    
}
