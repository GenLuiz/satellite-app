package com.wipro.island;

public class FindIsland 
{
//Metodo que recebe a matriz 
	public int find(char[][] pict)
	{
		int ilhas = 0;
		
		for (int i = 0 ; i < pict.length; i++)
		{
			for(int j = 0; j < pict[0].length; j++)
			{
				if(pict[i][j] == '+')
				{
					verifyOthers(pict,i,j);
					ilhas++;
				}
			}
		}
		
		return ilhas;
	}
	
	public void verifyOthers(char[][] pict, int i, int j)
	{
		if(j+1 < pict[0].length)
		{
			if(pict[i][j+1] == '+')
			{
				pict[i][j+1] = '-';
				verifyOthers(pict,i,j+1);
			}
		}
		
		if(j-1 >= 0)
		{
			if(pict[i][j-1] == '+')
			{
				pict[i][j-1] = '-';
				verifyOthers(pict,i,j-1);
			}
		}
		
		if(i+1 < pict.length)
		{
			if(pict[i+1][j] == '+')
			{
				pict[i+1][j] = '-';
				verifyOthers(pict,i+1,j);
			}
		}
		
		if(i-1 >= 0)
		{
			if(pict[i-1][j] == '+')
			{
				pict[i-1][j] = '-';
				verifyOthers(pict,i-1,j);
			}
		}
	}
}
