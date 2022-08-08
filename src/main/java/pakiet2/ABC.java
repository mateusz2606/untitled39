package pakiet2;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.lang.System;

public class ABC {
    public static void main(String[] args){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document document=builder.parse(new File("C:\\Users\\mateusz\\java_rob\\aaa.xml"));
            document.getDocumentElement().normalize();

            Element ee=document.getDocumentElement();

            NodeList list=ee.getElementsByTagName("user");
            for(int i=0;i<list.getLength();i++){

                if(list.item(0).getNodeType()==Node.ELEMENT_NODE){
                    Element e=(Element) list.item(i);
                    System.out.println(e.getNodeName());
                    System.out.println(e.getChildNodes().getLength());
                   // System.out.println(e.getChildNodes().item(0).getFirstChild().getNodeValue());
                }
            }
        }
        catch(FactoryConfigurationError | ParserConfigurationException | IOException | SAXException  |NullPointerException e){
            System.out.println("bład");
        }
    }
}
