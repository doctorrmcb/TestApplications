package com.revature.main;

public class TestHW1 {
	public static void main(String args[]) {
		String test = new String(acronym("Test Please Ignore"));
		System.out.println(test);
	}
	
	public static String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String[] arrPhrase = phrase.split(" ", 0);
		return arrPhrase[2];
	}
	
	String blah = "blah";
	char[] test = blah.toCharArray();
			//.Character.toString();
	char a = 'a';

}
