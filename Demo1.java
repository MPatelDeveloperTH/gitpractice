//Java is case sensitive langauge.
//1. Name of Java Class having first letter of each word is capital.
//e.g. DataInputStream, String, SimpleCursorAdapter.

//2. Name of Java Method having first word in small lettter and from 2nd words onwards first letter
	//of each word is capital
	//e.g.	concate(), toUpperCase(), toLowerCase(), parseInt()
	// calculateAmount()

//3. all the keywords written in lower case only
//	float, int, for, while, do

//4. all the package name written in lower case only
//		java.util,	java.io, java.applet, com.training.hub.io

//5. Name of any constants written in upper case only
//	Integer.MAX_VALUE, Double.MIN_VALUE, Integer.SIZE


//Misconception - Name of Java File and Name of Class must be same
//Fact - Only Name of Public class and name of Java file must be same

//Misconception - We can write only one main method in one file
//Fact - We can write multiple main method in one file

/*
	public - It is accessible from anywhere
	static - No need to create object without object you can access
	void - It return nothing
	main - it is the entry point of execution
	
	String[] variable_name - Command Line Argume

	to compile the Java Program
		javac nameoffile.java
	To run the java code
		java name_of_class_which_contains_main

*/

class Demo1{
		public static void main(String []th){
			System.out.println(th.length);	
		}
}
class Demo2{
		/*public static void main(String []th){
			System.out.println(th.length);	
		}*/
}
class Demo3{
		public static void main(String []th){
			System.out.println(th.length);	
		}
}



































