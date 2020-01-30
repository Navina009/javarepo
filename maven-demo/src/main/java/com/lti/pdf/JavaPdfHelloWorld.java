package com.lti.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class JavaPdfHelloWorld {
 
	public static void main(String[] args) {
		Document docs=new Document();
		 try{
			 
			 PdfWriter pdf= PdfWriter.getInstance(docs,new FileOutputStream("HelloWorld.pdf"));
			 docs.open();
			 docs.add(new Paragraph("hellow world new world"));
			 docs.close();
			 pdf.close();
		 }
			 catch (DocumentException e)
		      {
		         e.printStackTrace();
		      } catch (FileNotFoundException e)
		      {
		         e.printStackTrace();
			 
			 
		 }
	}
}
