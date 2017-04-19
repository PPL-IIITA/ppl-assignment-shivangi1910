/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

/**
 * This class raises exception when k goes out of bounds
 * @author shivangi
 */
public class KOutofBounds extends Exception
{
    /**
     * Exception raised when k>3
     * @param s 
     */
    KOutofBounds(String s)
    {
        super(s);
    }
}
