/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author shivangi
 */
public class Couple {

    private String girl_name;
    private String boy_name;

    Couple(String a,String b) {
        this.girl_name = a;
        this.boy_name = b;
    }
    
    String getBoyName() {
        return this.boy_name;
    }
    
    String getGirlName() {
        return this.girl_name;
    }
    
}