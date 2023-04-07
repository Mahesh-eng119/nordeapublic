package com.converter.domain;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.LinkedList;

@XmlRootElement
public class Text {
	public Text() {}
	 
 ArrayList<Sentence> sentence=new ArrayList<Sentence>();

public ArrayList<Sentence> getSentence() {
	return sentence;
}

public Text(ArrayList<Sentence> sentence) {
	super();
	this.sentence = sentence;
}

public void setSentence(ArrayList<Sentence> sentence) {
	this.sentence = sentence;
}

}