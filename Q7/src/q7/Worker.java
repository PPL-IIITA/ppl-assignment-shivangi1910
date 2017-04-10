/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7;

import java.sql.Timestamp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import static java.util.Collections.swap;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author shivangi
 */
public class Worker {

    public static ArrayList<Boy> boys = new ArrayList<>();
    public static ArrayList<Girl> girls = new ArrayList<>();
    public static ArrayList<Couple> couples = new ArrayList<>();
    public static ArrayList<Gift> gifts = new ArrayList<>();
    public static ArrayList<Boy> lboys = new ArrayList<>();
    //public int ng = 25;
    //public int nb = 100;

    public void Read() throws FileNotFoundException {

        String csvFile = "Boys.csv";
        String line = "";
        String cvsSplitBy = ",";
        Boy b;
        Girl g;
        Gift gift;
        Random r = new Random();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] a = line.split(cvsSplitBy);
                switch (Integer.parseInt(a[5])) {
                    case 1:
                        b = new Miser(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]), Integer.parseInt(a[4]));
                        //System.out.println(a[0] + a[1]);
                        boys.add(b);
                        break;
                    case 2:
                        b = new Generous(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]), Integer.parseInt(a[4]));
                        //System.out.println(a[0] + a[1]);
                        boys.add(b);
                        break;
                    case 3:
                        b = new Geeks(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]), Integer.parseInt(a[4]));
                        //System.out.println(a[0] + a[1]);
                        boys.add(b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        csvFile = "Girls.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] a = line.split(cvsSplitBy);

                // use comma as separator
                switch (Integer.parseInt(a[5])) {
                    case 1:
                        g = new Choosy(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]), Integer.parseInt(a[4]));
                        //System.out.println(a[0] + a[1]);
                        girls.add(g);
                        break;
                    case 2:
                        g = new Normal(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]), Integer.parseInt(a[4]));
                        //System.out.println(a[0] + a[1]);
                        girls.add(g);
                        break;
                    case 3:
                        g = new Desperate(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]), Integer.parseInt(a[4]));
                        //System.out.println(a[0] + a[1]);
                        girls.add(g);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        csvFile = "Gifts.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] a = line.split(cvsSplitBy);
                switch (Integer.parseInt(a[3])) {
                    case 1:
                        gift = new Essential(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]));
                        //System.out.println(a[0] + a[1]);
                        gifts.add(gift);
                        break;
                    case 2:
                        int diff = 1 + r.nextInt(10);
                        int rating = 1 + r.nextInt(10);
                        gift = new Luxury(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), diff, rating);
                        gifts.add(gift);
                        break;
                    case 3:
                        int uclass = 1 + r.nextInt(100);
                        int uvalue = 1 + r.nextInt(100);
                        gift = new Luxury(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), uclass, uvalue);
                        gifts.add(gift);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makeCouple(PrintWriter w) throws FileNotFoundException {

        System.out.println("Following couples are formed :");
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 100; j++) {
                if ((girls.get(i).gethas_bf() == false) && (boys.get(j).gethas_gf() == false) && (boys.get(j).getbudget() >= girls.get(i).getbudget()) && (boys.get(j).getmin_attr_req() >= girls.get(i).getattr())) {
                    girls.get(i).gets_bf(true, boys.get(j).getname());
                    
                    boys.get(j).gets_gf(true, girls.get(i));
                    Couple c = new Couple(boys.get(j), girls.get(i));
                    couples.add(c);
                  
                    System.out.println(girls.get(i).getname() + "\t" + boys.get(j).getname());
                    Timestamp TS = new Timestamp(System.currentTimeMillis());
                    w.println(TS + " : Commitement of " + boys.get(j).getname() + "and" + girls.get(i).getname());
                    break;
                }
                

            }
        }
        //w.close();
    }

    
    
    
    void find_boys(int k) {
        
        Search s1 ;//= new Search() ;
        
        //s1 = new NormalArray();
        Search s;
        Boy b1;
        int n = couples.size();
        Boy[] b = new Boy[n];
        int l = 10;
        
        for(int i = 0;i<10;i++) {
            lboys.add(boys.get(i));
        }
        
        for (int i = 0; i < n; i++) {
            b[i] = couples.get(i).getBoy();
        }
        
        if(k==1)
        {
            s = new NormalArray();
            
            s1 = (Search)s;
            //s.search(lboys,b,n,l);
        }
        else if(k==2)
        {
            s = new SortedArray();
            s1 = (Search)s;
        }
        else
        {
            s = new HashFn();
            s1 = (Search)s;
        }
        
        s.search(lboys,b,n,l);
        
        

    }
}