/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

/**
 * This class raises exception when a girl doesn't find a boyfriend
 * @author shivangi
 */

public class BfNotFound extends Exception
{
    /**
     * Exception raised when a girl doesn't find a boyfriend
     *
     * @param s 
     */
    BfNotFound(String s)
    {
        super(s);
    }
}

