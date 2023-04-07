package com.converter.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.text.diff.StringsComparator;

public class Editor {

	public ArrayList<String> sentanceSpliter(String text) {

		ArrayList<String> Sentence = new ArrayList<String>(Arrays.asList(text.split("(?<!\\bMr)(?<!\\bMrs)[.?!]")));
		
		return Sentence;
	}

	public ArrayList<ArrayList<String>> wordSplitter(ArrayList<String> sen) {

		ArrayList<ArrayList<String>> sentence = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < sen.size(); i++) {
			ArrayList<String> word = new ArrayList<>(Arrays.asList(sen.get(i).split("\\s+")));
		
			Collections.sort(word,String.CASE_INSENSITIVE_ORDER);
	
			sentence.add(word);

		}

		return sentence;

	}

	public static ArrayList<String> cleaner(ArrayList<String> list) {

		for (int i = 0; i < list.size(); i++) {

			String input = list.get(i);

			input = input.trim();

			input = input.replaceAll("[-\\!@#$%^&*()+=,:/]", "");

			input = input.trim();

			list.set(i, input);
		}
		return list;
	}
}
