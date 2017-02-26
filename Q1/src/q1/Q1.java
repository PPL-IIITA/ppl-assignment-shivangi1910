/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.FileNotFoundException;

/**
 *
 * @author shivangi
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        InputGenerator gen = new InputGenerator();
        gen.InputGenerator1();
        ReadInput read = new ReadInput();
        read.Read();
        read.makeCouple();
                //Exp e = new Exp();
    }
}
