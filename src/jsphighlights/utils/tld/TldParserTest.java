package jsphighlights.utils.tld;

import jsphighlights.tld.Attribute;
import jsphighlights.tld.Namespace;
import jsphighlights.tld.Tag;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Yurii_Banin on 2/29/2016.
 */
public class TldParserTest {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File xmlFile = new File("resources/tld/c.tld");
        TldNamespaceParser parser = new TldNamespaceParser();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);

        Namespace ns = parser.parseNamespace(doc.getDocumentElement());
        System.out.println("Namespace: " + ns.getName());
        System.out.println("Short name: " + ns.getShortName());
        System.out.println("Description: " + ns.getDescription());
        System.out.println("Tags:");
        for(Tag t : ns.getTags()) {
            System.out.println("\tName " + t.getName());
            System.out.println("\tAttributes:");
            for(Attribute a : t.getAttributes()) {
                System.out.println("\t\tName: " + a.getName());
                System.out.println("\t\tRequired: " + a.isRequired());
            }
            System.out.println();
        }

    }

}
