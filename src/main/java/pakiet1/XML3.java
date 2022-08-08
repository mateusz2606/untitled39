package pakiet1;

import javax.xml.stream.*;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class XML3 {
    static public void main(String[] args){
        try {
            XMLOutputFactory factory = XMLOutputFactory.newInstance();
            XMLEventWriter i=factory.createXMLEventWriter(new FileWriter("C:\\Users\\mateusz\\java_rob\\p.xml"));
            XMLEventFactory g=XMLEventFactory.newInstance();
           // StartDocument d=g.createStartDocument();
          //  i.add(d);
            i.add(g.createStartElement("aaa","bbb","ccc"));
            i.add(g.createCharacters("jhgjhgjhgjh"));
          //  i.add(g.createEndElement("aaa","bbb","ccc"));
           // i.add(g.createEndDocument());
            i.flush();
            i.close();




        }
        catch(IOException e){
            System.out.println("kdjhjk");
        }

        catch(XMLStreamException e){
            System.out.println("jhgjhjhg");
        }


    }
}
