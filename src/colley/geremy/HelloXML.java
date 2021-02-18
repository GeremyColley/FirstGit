package colley.geremy;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class HelloXML {
	
   public static void usage() {
		System.out.println("Usage : java hfr.benou.HelloXML xmlFile" );
		System.out.println("Pas de fichier XML en argument." );
		System.exit(-1);
   }
   
   public static void main (String[] args) throws Exception {
		if (args.length != 1) {
			usage();
		}     

		DocumentBuilderFactory builderFact = DocumentBuilderFactory.newInstance();

		DocumentBuilder docBuilder = builderFact.newDocumentBuilder();

		Document doc = docBuilder.parse(new File(args[0]));

		Element node = (Element) doc.getElementsByTagName("data" ).item(0);

		node =  (Element) node.getElementsByTagName("name" ).item(0);

		String name = node.getFirstChild().getNodeValue();

		System.out.println("Hello " + name + " !" );
   }
}
