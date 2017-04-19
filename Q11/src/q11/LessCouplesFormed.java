/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

/**
 * This class raises exception when less than k couples are formed
 * @author shivangi
 */
public class LessCouplesFormed extends Exception
{
    /**
     * Exception raised when less than k couples are formed
     * @param s 
     */
    LessCouplesFormed(String s)
    {
        super(s);
    }
}
