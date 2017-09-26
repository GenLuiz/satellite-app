package com.wipro.island;
import java.util.Random;


public class GenerateIsland {

	public char[][] generatePicture(int m, int n)
	{
		
		Random randon = new Random();
		char matrix [][] = new char [m][n]; 
		
		for (int i = 0; i< m;i++)
		{
			for(int z =0; z< n; z++)
			{
				matrix[i][z] = randon.nextBoolean() == false ? '-' : '+';
			}
		}
		return matrix;
	}
	
	public void showMap(char[][] matrix)
	{
		
		for(char[] i : matrix)
		{
			for(char j : i)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
