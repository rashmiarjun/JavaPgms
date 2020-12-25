package com.csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class WriteDataToCsv {
	
	public static void WritData(String filepath) throws IOException
	{
		File file=new File(filepath);
		FileWriter fileW=new FileWriter(file);
		CSVWriter writer=new CSVWriter(fileW);
		
		String [] header= {"EmpID","Ename","Desg"};
		writer.writeNext(header);
		String [] data1= {"101","Rashmi","Software Engineer"};
		writer.writeNext(data1);
		
		writer.close();
		
	}
	public static void main(String[] args) throws IOException {
		WritData("./Rest/register1.csv");
	}

}
