/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLOG_LOGIC;
import java.*;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author DINUKA
 */

public class Thrower {

    List<ThrowListener> listeners = new ArrayList<ThrowListener>();

    public void addThrowListener(ThrowListener toAdd) {
        System.out.println("addThrowListener");
        listeners.add(toAdd);
    }

    public void Throw(String message) {
        for (ThrowListener hl : listeners) {
            hl.Catch(message);
            System.out.println("ThrowThrow " + message);
        }
     
            System.out.println("ThrowThrow done all" + message);   
    }

}
