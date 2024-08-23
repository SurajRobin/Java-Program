package exceptions;


public class ClassCastException_In_DowncastingExample1 {
	
	/*
	 * If we create an object for parent class and we try to do down casting to it's child class since
	 * instant of the child class is not created inside the object in that time we get 
	 * an run time exception is called as class cast exception
	 * We get class cast exception during run time.
	 */
	public static void main(String[] args) {
		
		// we have created object for the parent class
		Object obj=new Object();
		System.out.println(obj.hashCode());
		
		
		// Here we get run time exception is called as  class cast exception 
		// Down casting to child class 
		ClassCastException_In_DowncastingExample1 c=(ClassCastException_In_DowncastingExample1)obj;

	}	
}