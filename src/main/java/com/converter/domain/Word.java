package com.converter.domain;

import java.util.ArrayList;
import java.util.Collections;

import com.converters.CapitalLetterComparator;

public class Word {
	public Word() {
	};

	public ArrayList<String> getWord() {
		return word;
	}

	public void setWord(ArrayList<String> word) {
		this.word = word;
	}

	public Word(ArrayList<String> word) {
		this.word = word;
	}

	ArrayList<String> word = new ArrayList<>();

	public ArrayList<ArrayList<String>> wordSorter(ArrayList<ArrayList<String>> sen) {

		for (int i = 0; i < sen.size(); i++) {

			Collections.sort(sen.get(i), new CapitalLetterComparator());
		}
		return sen;
	}
}
