package com.javatechie.app.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		System.out.println("Data "+ data);
//		if(data.equals("Shamilka")) {
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("welcome");
		}
	}
	
	public void addedMethod(){
		System.out.println("method added");
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
