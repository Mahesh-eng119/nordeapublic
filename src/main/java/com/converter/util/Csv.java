package com.converter.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVWriter;

public class Csv {

	public CSVWriter wordWriter(CSVWriter write, ArrayList<ArrayList<String>> f) {
		int MaxWord = 0;
		for (ArrayList<String> v : f) {
			if (v.size() > MaxWord) {
				MaxWord = v.size();
			}
		}
		ArrayList<String> l = new ArrayList<>();
		l.add("");
		for (int i = 0; i < MaxWord; i++) {
			l.add("Word" + (i + 1));
		}
		String[] s = l.toArray(new String[0]);
		write.writeNext(s);
		return write;
	}

	public void csvWriter(String outputfilecsv,ArrayList<ArrayList<String>> word) throws IOException {
		try {
			CSVWriter write = new CSVWriter(new FileWriter(outputfilecsv));
			write = wordWriter(write, word);
			for (int i = 0; i < word.size() - 1; i++) {
				ArrayList<String> t = word.get(i);
				t.add(0, "Sentence" + (i + 1));
				write.writeNext(t.toArray(new String[0]));
			}
			write.flush();

		} catch (Exception e) {

		}
	}
}
