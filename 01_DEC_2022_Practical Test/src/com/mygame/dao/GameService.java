package com.mygame.dao;

public class GameService {
	
		public String[] getCityNameService(){
			GameDAO dao=new GameDAO();
			String[] cityName=dao.getCityName();
			return cityName;
		}
}