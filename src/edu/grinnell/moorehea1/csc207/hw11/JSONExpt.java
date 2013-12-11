package edu.grinnell.moorehea1.csc207.hw11;

import java.io.PrintWriter;

public class JSONExpt {

    public static void main(String[] args) {
	PrintWriter pen = new PrintWriter(System.out, true);
	String example0 = "{ }";
	String example1 = "{\"Hello\":\"Hello, World\"}";
	String example2 = "{\"Hello\":{\"Hi there\":\"Hello, World\"}}";
	
	JSONThing.method(example0, 0);
	pen.println(JSONThing.method(example0, 0));
	
	JSONThing.method(example1, 0);
	pen.println(JSONThing.method(example1, 0));
	
	JSONThing.method(example2, 0);
	pen.println(JSONThing.method(example2, 0));
	
    }
    
}
