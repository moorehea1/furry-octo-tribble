package edu.grinnell.moorehea1.csc207.hw11;

import java.io.PrintWriter;

public class JSONExpt {

    public static void main(String[] args) {
	PrintWriter pen = new PrintWriter(System.out, true);
	String example0 = "{ }";
	String example1 = "{\"Hello\":\"Hello, World\"}";
	String example2 = "{\"Hello\":{\"Hi there\":\"Hello, World\"}}";
	
	JSONThing.Method(example0, 0);
	pen.println(JSONThing.Method(example0, 0));
	
	JSONThing.Method(example1, 0);
	pen.println(JSONThing.Method(example1, 0));
	
	JSONThing.Method(example2, 0);
	pen.println(JSONThing.Method(example2, 0));
	
    }
    
}
