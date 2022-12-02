package com.mygame.dao;

public class Gameview {
   GameService s=new GameService();
       
   String[]displayCitynamesWithBlanks()
   {
	String[] c=s.getCityNameService();
	
	for(int i=0; i<c.length; i++)
	{ 
		char arr[]=c[i].toCharArray();
		
		for(int j=0; j<arr.length;j++)
		{
			arr[i]=(char)(arr.length * Math.random());
		}
	}
   return c;
}
}