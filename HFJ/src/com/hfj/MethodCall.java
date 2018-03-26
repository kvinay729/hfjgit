package com.hfj;

public class MethodCall {
	
	static byte calcArea(byte h,byte w)
	{
	return (byte) (h*w);
	}
	
	//public static void main(String args[])
	{   
		byte a=20;
		byte b =127;
		byte h = calcArea(a,b);
		System.out.println(h);
		
	}
}
