/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.sql.Timestamp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author shivangi
 */

public class ReadInput {
    
    public static ArrayList<Boy> boys = new ArrayList<>();
    public static ArrayList<Girl> girls = new ArrayList<>();
    public static ArrayList<Couple> couples = new ArrayList<>();
    //public int ng = 25;
    //public int nb = 100;
    
    public void Read() {
        
        String csvFile = "Boys.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] a = line.split(cvsSplitBy);
                Boy b = new Boy(a[0],Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4]),Integer.parseInt(a[5]));
                //System.out.println(a[0] + a[1]);
                boys.add(b);

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        csvFile = "Girls.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] a = line.split(cvsSplitBy);
                Girl b = new Girl(a[0],Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4]),Integer.parseInt(a[5]));
                //System.out.println(a[0] + a[1]);
                girls.add(b);

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void makeCouple() throws FileNotFoundException {
        
        PrintWriter w = new PrintWriter("Log.txt");
        
        System.out.println("Following couples are formed :");
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 100 ; j++) {
                if((girls.get(i).gethas_bf() == false) && (boys.get(j).gethas_gf() == false) && (boys.get(j).getbudget() >= girls.get(i).getbudget()) && (boys.get(j).getmin_attr_req() >= girls.get(i).getattr()))
                {
                    girls.get(i).gets_bf(true, boys.get(j).getname());
                    boys.get(j).gets_gf(true, girls.get(i).getname());
                    Couple c = new Couple(girls.get(i).getname(),boys.get(j).getname());
                    couples.add(c);
                    System.out.println(girls.get(i).getname()+"\t"+boys.get(j).getname());
                    Timestamp TS = new Timestamp(System.currentTimeMillis());
                    w.println(TS+ " : Commitement of " + boys.get(j).getname() + "and" + girls.get(i).getname());
                }    
            }
        }
        w.close();
    }
}