package com.converters;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.xml.bind.JAXBException;

import com.converter.domain.Text;
import com.converter.util.Csv;
import com.converter.util.Editor;

public class TextConverter {

	private static Logger logger = Logger.getLogger(TextConverter.class.getName());

	public static void main(String[] args) throws IOException, JAXBException

	{
		TextReader reader = new TextReader();

		String inputfile = new File(args[0]).getAbsolutePath();
		logger.info("File Input Absolute Path: " + inputfile);

		String outputfilexml = new File(args[1]).getAbsolutePath();
		logger.info("File Input Absolute Path: " + outputfilexml);
		String outputfilecsv = new File(args[2]).getAbsolutePath();
		logger.info("File Input Absolute Path: " + outputfilecsv);

		String str = reader.readFile(inputfile);

		Editor e = new Editor();

		ArrayList<String> se = e.sentanceSpliter(str);
		logger.info("The Sentence has been splitted Successfully");
		se = e.cleaner(se);
		logger.info("The Sentence has been cleaned Successfully");
		ArrayList<ArrayList<String>> word = e.wordSplitter(se);
		logger.info("The Word has been splitted Successfully");
		Xml x = new Xml();
		Text t = x.ObjectConverter(word);
		File file = new File(outputfilexml);
		x.converter(file, t);
		logger.info(" xml file generated successfully " + outputfilexml);

		Csv cv = new Csv();

		cv.csvWriter(outputfilecsv, word);
		logger.info(" CSV file generated successfully " + outputfilecsv);

	}
}