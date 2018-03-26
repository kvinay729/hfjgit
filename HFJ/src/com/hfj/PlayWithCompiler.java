package com.hfj;

public class PlayWithCompiler {
	
	static int org =20;
	public static void main(String args[])
	{
		int org=420;
		PlayWithCompiler pc = new PlayWithCompiler();
		int ne=pc.go(org);
		System.out.println(ne);
		org = org+2;
		System.out.println(org);
		
	}

	
	int go(int arg)
	{
		return arg=arg*2;
	//return arg;
	}

}
