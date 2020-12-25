package com.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromCSV {
	public static void ReadData(String filepath) throws IOException
	{
		File file=new File(filepath);
		FileReader filereader=new FileReader(file);
		BufferedReader br=new BufferedReader(filereader);
		String[] temp;
		String line="";
		while((line=br.readLine())!=null)
		{
			temp=line.split(",");
			for(String data:temp) {
				System.out.println(data+" ");
			}
			System.out.println();
		}
		br.close();
	}
	public static void main(String[] args) {
		
	}

}
