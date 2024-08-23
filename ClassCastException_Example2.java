package exceptions;

public class ClassCastException_Example2 {

		int a=10;
		
		public static void main(String[] args) {
			Object obj=new Object();
			ClassCastException_Example2 c=(ClassCastException_Example2) obj;
			
			System.out.println(c.a);
		}
}
