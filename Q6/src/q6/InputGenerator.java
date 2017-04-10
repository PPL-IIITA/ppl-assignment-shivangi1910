/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author shivangi
 */
public class InputGenerator {
    
    InputGenerator() {
        
        try {
            //System.out.println("hello");
            PrintWriter w1 = new PrintWriter("Girls.csv", "UTF-8");
            PrintWriter w2 = new PrintWriter("Boys.csv", "UTF-8");
            PrintWriter w3 = new PrintWriter("Gifts.csv", "UTF-8");
            //int nb = 100;
            //int ng = 25; 
            Random r = new Random() ; 
            for ( int i = 1; i <= 25 ; i++)
            {
                //System.out.println("Hello");
                int attr = 1 + r.nextInt(10);
                int intelli = 1 + r.nextInt(10);
                int budget = 1 + r.nextInt(500);
                int criterion = 1 + r.nextInt(3);
                int type = 1 + r.nextInt(3);
                w1.println("Girl"+i+","+attr+","+intelli+","+budget+","+criterion+","+type);
            }
            w1.close();
            for ( int i = 1; i <= 100; i++)
            {
                //System.out.println("Hello");
                int attr = 1 + r.nextInt(10);
                int intelli = 1 + r.nextInt(10);
                int budget = 1 + r.nextInt(1000);
                int attr_req = 1 + r.nextInt(3);
                int type = 1 + r.nextInt(3);
                w2.println("Boy"+i+","+attr+","+intelli+","+budget+","+attr_req+","+type);
            }
            w2.close();
            for ( int i = 1; i <= 50; i++)
            {
                //System.out.println("Hello");
                int value = 1 + r.nextInt(100);
                int price = 1 + r.nextInt(100);
                int type = 1 + r.nextInt(3);
                w3.println("Gift"+i+","+price+","+value+","+type);
            }
            w3.close();
        }
        catch (IOException a) {
			System.out.println("Some error occurred");
        }     
    }
}  
