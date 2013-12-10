package edu.grinnell.moorehea1.csc207.hw11;

import java.util.Hashtable;

public class JSONThing<N, V> {

    /**
     * Fields
     */
    
    Object[] pairs;
    
   /**
    * Constructors
    */
    
    //create a new hashtable named JSON
    
    Hashtable<String, V> JSON = new Hashtable<String, V>();
    
    /**
     * Methods
     */
    
    public static void Method(String input) {
	
    }
    
    /**
     * Inner classes
     */
    
    class NVPair {
        N name;
        V value;
        NVPair(N name, V value) {
            this.name = name;
            this.value = value;
        } // NVPair(N,V)
    } // class NVPair
}
