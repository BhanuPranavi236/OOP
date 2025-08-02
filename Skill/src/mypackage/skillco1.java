package mypackage;

public class skillco1 {
	 public static void main(String[] args) {

	        int a = 18;
	        long b = a;
	        float c = b;
	        System.out.println("Implicit (Widening):");
	        System.out.println("int: " + a + ", long: " + b + ", float: " + c);

	        double d = 777.456;
	        int e = (int) d;
	        byte f = (byte) e;
	        System.out.println("\nExplicit (Narrowing):");
	        System.out.println("double: " + d + ", int: " + e + ", byte: " + f);

	        Integer g = a;
	        int h = g;
	        System.out.println("\nWrapper Class:");
	        System.out.println("Autoboxing Integer: " + g + ", Unboxing int: " + h);
	    }
	

}
