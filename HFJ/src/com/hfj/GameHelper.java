package com.hfj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {

	
	public String getUserInput(String prompt)
	{
		String inputline=null;
		System.out.println(prompt + " ");
		
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			inputline=bf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inputline;
	}
}
