/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.sql.Timestamp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static java.util.Collections.swap;
import java.util.Comparator;

/**
 *
 * @author shivangi
 */

public class ReadNwrite {
    
    public static ArrayList<Boy> boys = new ArrayList<>();
    public static ArrayList<Girl> girls = new ArrayList<>();
    public static ArrayList<Couple> couples = new ArrayList<>();
    public static ArrayList<Gift> gifts = new ArrayList<>();
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
        
        csvFile = "Gifts.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] a = line.split(cvsSplitBy);
                Gift b = new Gift(a[0],Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]));
                //System.out.println(a[0] + a[1]);
                gifts.add(b);

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void makeCouple(PrintWriter w) throws FileNotFoundException {
        
        //PrintWriter w = new PrintWriter("Log.txt");
        
        System.out.println("Following couples are formed :");
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 100 ; j++) {
                if((girls.get(i).gethas_bf() == false) && (boys.get(j).gethas_gf() == false) && (boys.get(j).getbudget() >= girls.get(i).getbudget()) && (boys.get(j).getmin_attr_req() >= girls.get(i).getattr()))
                {
                    girls.get(i).gets_bf(true, boys.get(j).getname());
                    boys.get(j).gets_gf(true, girls.get(i).getname());
                    Couple c = new Couple(boys.get(j),girls.get(i));
                    couples.add(c);
                    System.out.println(girls.get(i).getname()+"\t"+boys.get(j).getname());
                    Timestamp TS = new Timestamp(System.currentTimeMillis());
                    w.println(TS+ " : Commitement of " + boys.get(j).getname() + "and" + girls.get(i).getname());
                }    
            }
        }
        //w.close();
    }
    
    public void sendGifts(PrintWriter w) throws FileNotFoundException {
        System.out.println("Gifts given : ");
        //PrintWriter w = new PrintWriter("Log.txt");
        for(int i = 0;i < gifts.size()-1 ;i++ ) {
            for(int j = i+1;j < gifts.size() ;j++) {
                if(gifts.get(i).getprice() > gifts.get(j).getprice()) 
                    swap(gifts,i,j);
            }
        }
        for ( int i = 0; i<couples.size() ;i++) {
            if( couples.get(i).getBoy().gettype() == 1) {
                int mtcost = couples.get(i).getGirl().getbudget();
                int curr = 0;
                int x = 0;
                for(int j = 0; j < 50 ; j++) {
                    if(curr < mtcost) {
                                couples.get(i).gifts.add(gifts.get(i));
                                x++;
                                curr += gifts.get(j).getprice();
                                System.out.println(couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getid()+" to "+couples.get(i).getGirl().getname());
                                Timestamp TS = new Timestamp(System.currentTimeMillis());
                                w.println(TS+couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getid()+" to "+couples.get(i).getGirl().getname());
                    }
                }
                if(couples.get(i).getGirl().gettype() == 1) {
                    int x1 = (int)Math.log(curr);
                    couples.get(i).getGirl().sethappiness(x1); 
                }
                else if(couples.get(i).getGirl().gettype() == 2) {
                    int x1 = curr;
                    couples.get(i).getGirl().sethappiness(x1);
                }
                else if(couples.get(i).getGirl().gettype() == 3) {
                    int x1 = (int)Math.pow(1.15,curr);
                    couples.get(i).getGirl().sethappiness(x1);
                }
                    int x1 = couples.get(i).getBoy().getbudget() - curr;
                    couples.get(i).getBoy().sethappiness(x1);
                    couples.get(i).sethappiness(x1 + couples.get(i).getGirl().gethappiness());
                    int x2 = couples.get(i).getBoy().getbudget() - curr + Math.abs(couples.get(i).getBoy().getattr() - couples.get(i).getGirl().getattr()) + Math.abs(couples.get(i).getBoy().getintelli() - couples.get(i).getGirl().getintelli());
                    couples.get(i).setcompatibility(x2);
                
                
                
            }
            if( couples.get(i).getBoy().gettype() == 2) {
                int mtcost = couples.get(i).getGirl().getbudget();
                int curr = 0;
                int x = 0;
                for(int j = 49; j >= 0 ; j--) {
                    if(curr < mtcost) {
                                couples.get(i).gifts.add(gifts.get(j));
                                x++;
                                curr += gifts.get(j).getprice();
                                System.out.println(couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getid()+" to "+couples.get(i).getGirl().getname());                    }
                                Timestamp TS = new Timestamp(System.currentTimeMillis());
                                w.println(couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getid()+" to "+couples.get(i).getGirl().getname());    
                    }
                if(couples.get(i).getGirl().gettype() == 1) {
                    int x1 = (int)Math.log(curr);
                    couples.get(i).getGirl().sethappiness(x1); 
                }
                else if(couples.get(i).getGirl().gettype() == 2) {
                    int x1 = curr;
                    couples.get(i).getGirl().sethappiness(x1);
                }
                else if(couples.get(i).getGirl().gettype() == 3) {
                    int x1 = curr;
                    couples.get(i).getGirl().sethappiness(x1);
                }
                
                    int x1 = couples.get(i).getGirl().gethappiness();
                    couples.get(i).getBoy().sethappiness(x1);
                    couples.get(i).sethappiness(x1 + couples.get(i).getGirl().gethappiness());
                    int x2 = couples.get(i).getBoy().getbudget() - curr + Math.abs(couples.get(i).getBoy().getattr() - couples.get(i).getGirl().getattr()) + Math.abs(couples.get(i).getBoy().getintelli() - couples.get(i).getGirl().getintelli());
                    couples.get(i).setcompatibility(x2);
                        
                }
            if( couples.get(i).getBoy().gettype() == 3) {
                int mtcost = couples.get(i).getGirl().getbudget();
                int curr = 0;
                int j;
                for( j = 0; j < 50 ; j++) {
                    if(curr < mtcost) {
                                couples.get(i).gifts.add(gifts.get(j));
                                curr += gifts.get(j).getprice();
                                System.out.println(couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getid()+" to "+couples.get(i).getGirl().getname());
                                Timestamp TS = new Timestamp(System.currentTimeMillis());
                                w.println(TS + couples.get(i).getBoy().getname()+" gifts "+gifts.get(j).getid()+" to "+couples.get(i).getGirl().getname());
                    }
                }
                int a = couples.get(i).getBoy().getbudget() - curr;
                if(a > 0) {
                    for ( int k = j ; k < 50 ; k++) {
                        if(gifts.get(k).gettype() == 2 && a >= gifts.get(k).getprice()) {
                            couples.get(i).gifts.add(gifts.get(j));
                            System.out.println(couples.get(i).getBoy().getname()+" gifts "+gifts.get(k).getid()+" to "+couples.get(i).getGirl().getname());
                            Timestamp TS = new Timestamp(System.currentTimeMillis());
                            w.println(TS + couples.get(i).getBoy().getname()+" gifts "+gifts.get(k).getid()+" to "+couples.get(i).getGirl().getname());break;
                        }
                    }
                }
                if(couples.get(i).getGirl().gettype() == 1) {
                    int x1 = (int)Math.log(curr);
                    couples.get(i).getGirl().sethappiness(x1); 
                }
                else if(couples.get(i).getGirl().gettype() == 2) {
                    int x1 = curr;
                    couples.get(i).getGirl().sethappiness(x1);
                }
                else if(couples.get(i).getGirl().gettype() == 3) {
                    int x1 = curr;
                    couples.get(i).getGirl().sethappiness(x1);
                }
                    int x1 = couples.get(i).getGirl().getintelli();
                    couples.get(i).getBoy().sethappiness(x1);
                    couples.get(i).sethappiness(x1 + couples.get(i).getGirl().gethappiness());
                    int x2 = couples.get(i).getBoy().getbudget() - curr + Math.abs(couples.get(i).getBoy().getattr() - couples.get(i).getGirl().getattr()) + Math.abs(couples.get(i).getBoy().getintelli() - couples.get(i).getGirl().getintelli());
                    couples.get(i).setcompatibility(x2);
            }
            //w.close();
            
        }
    }
       
    void printkcouples() {
        int k = 5;
        for(int i = 0; i < couples.size(); i++) {
            for(int j = i+1; j < couples.size(); j++) {
                 if(couples.get(i).gethappiness() < couples.get(j).gethappiness()) 
                    swap(couples,i,j);
            }
        }
        System.out.println();
        System.out.println(k + "happiest couples : ");
        for(int i = 0; i < k; i++) {
            System.out.println(couples.get(i).getBoy().getname() + "\t" + couples.get(i).getGirl().getname());
        }
        for(int i = 0; i < couples.size(); i++) {
            for(int j = i+1; j < couples.size(); j++) {
                 if(couples.get(i).getcompatibility()< couples.get(j).getcompatibility()) 
                    swap(couples,i,j);
            }
        }
        System.out.println();
        System.out.println(k + "best compatible couples : ");
        for(int i = 0; i < k; i++) {
            System.out.println(couples.get(i).getBoy().getname() + "\t" + couples.get(i).getGirl().getname());
        }
    }
     
    
}