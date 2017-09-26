package com.wipro.island;

// everton.ramos@wipro.com
public class AppSatellite {

	public static void main(String[] args) 
	{
		FindIsland f = new FindIsland();
		GenerateIsland g = new GenerateIsland();
		
		char[][] map = g.generatePicture(5, 5);
		
		g.showMap(map);
		
		System.out.println(" ---------------- ");
		
		System.out.println("Número de ilhas é: " + f.find(map));
	}

}
