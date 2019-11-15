package com.revature.main;

import java.util.ArrayList;

public class HelloWorld {

	// Need this statement as long as it is a console application.
	// Main method must be public.
	// If it is static, it means that it belongs to the class itself and not the
	// instance of the class.
	// Static is used with final because you only want one instance of a variable.
	// public static void main (String args[]) also works
	// public static void main (String helloThere[]) also works
	// must be a void return type.
	// Arguments in the code get passed into command line... (That's what the args
	// stands for)
	// Order of main method signature doesn't matter.
	// Must be "main" not "Main" or anything else.
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(args[0]);

		/*
		 * StringBuilder s1 = new StringBuilder("snorkler"); StringBuilder s2 = new
		 * StringBuilder("yoodler");
		 * 
		 * System.out.println(s1.replace(3,4,s2.substring(4)));
		 * System.out.println(s2.substring(4));
		 */

		/* Long l = new Long(2); */

//		ArrayList<Double> a1 = new ArrayList<>();
//		System.out.println(a1.indexOf(1.0));
//		System.out.println(a1.contains("string"));
		/*
		 * int i = 0; System.out.println(i++); System.out.println(--i);
		 * System.out.println(i++ == 0); System.out.println(--i == 0);
		 * System.out.println(0 == i++); System.out.println(0 == --i);
		 * 
		 */

		/*
		 * double daaa[][][] = new double[3][][]; double d = 100.0; double[][] daa = new
		 * double[2][2];
		 * 
		 * daaa[0] = daa;
		 * 
		 * System.out.println(daaa[0]); System.out.println(daaa[1]);
		 * System.out.println(daaa[2]); System.out.println(daaa[0][0]);
		 * System.out.println(daaa[0][0][0]); System.out.println(daaa[0][0][1]);
		 * System.out.println(daaa[0][1][1]);
		 */

		/*
		 * int a =100, b,c; System.out.println(b+""); System.out.println(c+"");
		 */

		HelloWorld hw = new HelloWorld();

		/*
		 * int[] t = {1,2}; int[] s = t; int[] v = s; hw.doStuff(s[0], v);
		 * System.out.println(t[0]); System.out.println(s[0]); System.out.println(v[0]);
		 * System.out.println(v[1]); System.out.println(v); System.out.println(s);
		 * System.out.println(t); System.out.println(s[1]); test test = new test();
		 * System.out.println(test.t); hw.doOtherStuff(test);
		 * System.out.println(test.t); test = new test(); hw.doOtherOtherStuff(test.t);
		 * System.out.println(test.t); System.out.println("==================="); char a
		 * = 'a'; System.out.println(a); System.out.println((int) a);
		 * 
		 * //hw.doCharStuff(b); hw.wtf();
		 * 
		 * } char b; void doStuff(int a, int[] s) { a = 12; s[1] = 10;
		 * System.out.println(s); int[] v = {100,200}; s = v; System.out.println(s); }
		 * 
		 * void doOtherStuff(test a) { a.t = 12; }
		 * 
		 * void doOtherOtherStuff (int a) { a = 12; }
		 * 
		 * void doCharStuff (char b) { b = 'a'; }
		 * 
		 * void wtf() { doCharStuff(b); System.out.println(b); System.out.println(((int)
		 * b)); }
		 * 
		 * 
		 * char c; public void m1(){ char[ ] cA = { 'a' , 'b'}; m2(c, cA);
		 * System.out.println( ( (int)c) + "," + cA[1] ); } public void m2(char c, char[
		 * ] cA){ c = 'b'; cA[1] = cA[0] = 'm'; }
		 * 
		 * public static void main(String args[]){ new HelloWorld().m1(); }
		 */
	
		hw.enthuware();
	}

	void enthuware() {
		char i;
		
		LOOP: for (i = 0; i < 5; i++) {
			System.out.println("For: " + (int)i);
			switch (i++) {
			case '0':
				System.out.println("A");
			case 1:
				System.out.println("B");
				break LOOP;
			case 2:
				System.out.println("Case: " + (int)i);
				System.out.println("C");
				break;
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E");
			case 'E':
				System.out.println("F");
				break;
			case 0:
				System.out.println("ENTHUWARE SUCKS");
			}
			
				
			System.out.println("Post Switch: " + (int)i);
		}
	}
	
	void print(char i) {
		System.out.println(i);
	}

	
	
}

/*
 * class test { int t; { t = 10; } }
 */
/*
 * class ForSwitch { public static void main(String args[]) { char i; LOOP: for
 * (i = 0; i < 5; i++) { switch (i++) { case '0': System.out.println("A"); case
 * 1: System.out.println("B"); break LOOP; case 2: System.out.println("C");
 * break; case 3: System.out.println("D"); break; case 4:
 * System.out.println("E"); case 'E': System.out.println("F"); } } } }
 */