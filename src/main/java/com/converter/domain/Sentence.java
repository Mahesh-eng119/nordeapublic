package com.converter.domain;

import java.util.ArrayList;


public class Sentence {
	
	public Sentence() {
		
	}
	
	ArrayList<String> word=new ArrayList<>();

	public Sentence(ArrayList<String> word) {
		super();
		this.word = word;
	}

	public ArrayList<String> getWord() {
		return word;
	}

	public void setWord(ArrayList<String> word) {
		this.word = word;
	}

}
