package com.converters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {

	public String readFile(String inputfile) throws IOException {


		File file = new File(inputfile);
		
		StringBuilder builder = new StringBuilder();

		BufferedReader buffer = new BufferedReader(new FileReader(file));
		try {
			String str;
			while ((str = buffer.readLine()) != null) {
				builder.append(str).append("\n");
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			buffer.close();
		}
System.out.println(builder.toString());
		return builder.toString();
	}

}