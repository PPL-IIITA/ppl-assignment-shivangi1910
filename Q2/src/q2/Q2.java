/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author shivangi
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        PrintWriter w = new PrintWriter("Log.txt");
        InputGenerator gen = new InputGenerator();
        gen.InputGenerator1();
        ReadNwrite read = new ReadNwrite();
        read.Read();
        read.makeCouple(w);
        read.sendGifts(w);
        w.close();
        read.printkcouples();
                //Exp e = new Exp();
    }
}
