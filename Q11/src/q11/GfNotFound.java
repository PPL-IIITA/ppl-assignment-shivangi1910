/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

/**
 * This class raises exception when a boy doesn't find a girlfriend
 * @author shivangi
 */
public class GfNotFound extends Exception
{
    /**
     * Exception raised when a boy doesn't find a girlfriend
     * @param s 
     */
    GfNotFound(String s)
    {
        super(s);
    }
}
