/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

/**
 * This class raises exception when k<0
 * @author shivangi
 */
public class InvalidK extends Exception
{
    /**
     * Exception raised when k<0
     * @param s 
     */
    InvalidK(String s)
    {
        super(s);
    }
}
