package com.class15;

public class ContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var="This is a demo of cotain # %";
		System.out.println(var.contains("#"));
		
		if (var.contains("#")|| var.contains("%")) {
			System.out.println("#,% are not allowed");
		}

		
		System.out.println(var.contains("demo"));
		
		System.out.println(var.startsWith("This"));
		System.out.println(var.endsWith("%"));
		
	}

}
