package pakiet1;

import javax.swing.text.html.HTMLDocument;
import javax.xml.stream.*;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

public class XML2 {
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader i=factory.createXMLEventReader(new FileReader("C:\\Users\\mateusz\\java_rob\\p.xml"));
            XMLEvent e;
            while(i.hasNext()){
                e=i.nextEvent();
                if(e.isStartElement()){


                    StartElement q=e.asStartElement();
                    Iterator<Attribute> p =q.getAttributes();
                    while(p.hasNext()){
                        System.out.println(p.next().getName());
                    }

                }
            }


        }
        catch (FileNotFoundException e){
            System.out.println("kjjkg");
        }
        catch(XMLStreamException e){
            System.out.println("jhgjhjhg");
        }

    }
}
