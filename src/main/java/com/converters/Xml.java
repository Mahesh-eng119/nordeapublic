package com.converters;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.converter.domain.Sentence;
import com.converter.domain.Text;

public class Xml {
	public void  converter (File outputfilexml,Text  txt) {
		try {
	JAXBContext context = JAXBContext.newInstance(Text.class);
	Marshaller mar = context.createMarshaller();
	mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	mar.marshal(txt, outputfilexml);
		}
		catch(Exception e) {
			System.out.print("Error detectued");
		}
	}
	public Text ObjectConverter(ArrayList<ArrayList<String>> content) {
		Text text=new Text();
		//Sentence s=new Sentence();	
		for(int i=0;i<content.size();i++) {
			Sentence s=new Sentence();	
			s.setWord(content.get(i));
			
			text.getSentence().add(s);
		}
		return text;
	}
	

}



 