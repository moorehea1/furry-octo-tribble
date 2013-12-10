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
    static Hashtable<String, String> JSON = new Hashtable<String, String>();

    /**
     * Methods
     */

    public static String Method(String input, int start) {
	String name = null;
	String value = null;
	for (int i = start; i < input.length(); i++) {
	    if (input.charAt(i) == '{') {
		if (input.indexOf(':') == -1) {
		    return "\"{ }\"";
		    // if there is no colon after an opening bracket, it must be empty
		} // if (input.indexOf(':') == -1)
		else if (input.indexOf('{', i+1) > input.indexOf(':', i)) {
		    // stub
		    // if you run into a new open bracket before a colon, recurse.
		} // else if ()
		else {
		    name = input.substring(i+1, input.indexOf(':', i));
		}
		//Set the name to the string from the first bracket to the next colon it finds
	    } // if (input.charAt(i) == '{')
	    else if (input.charAt(i) == ':') {
		if (Character.isDigit(input.charAt(i+1))) {
		    //stub
		}
		value = input.substring(i+1, input.indexOf('}', i));
		// Set the value to the string from the colon to the end brace
	    } // else if (input.charAt(i) == ':')
	} // for(int i = 0; i < input.length(); i++)
	return JSON.put(name,value);
    } // Method (String input)

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
