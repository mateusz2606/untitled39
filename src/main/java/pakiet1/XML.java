package pakiet1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

public class XML {
    public static void main(String[] args){

        SAXParserFactory factory=SAXParserFactory.newInstance();
        try {
            SAXParser xparse = factory.newSAXParser();
          //  xparse.parse(new File("C:\\Users\\mateusz\\java_rob\\p.xml"), new Handler());
            xparse.parse(new FileInputStream("C:\\Users\\mateusz\\java_rob\\p.xml"),new Handler());

        }
        catch (ParserConfigurationException e){
            System.out.println("bład parsowania");
        }
        catch(SAXException | IOException e){
            System.out.println("błąsd SAX");
        }

    }
}

class Handler extends DefaultHandler{
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("start document");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("end document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        System.out.println("start element: "+qName);
        System.out.println(attributes.getQName(0));

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.println("end element: "+qName);


    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
       // System.out.println("znaki: "+ch.toString()+ " start: "+start+" length: "+length);
        String str;
       str= new String(ch,start,length);

        System.out.println(str);






    }
}
