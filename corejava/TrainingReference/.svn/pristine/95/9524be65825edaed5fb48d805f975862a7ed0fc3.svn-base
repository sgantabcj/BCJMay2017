package com.nivtek.training.xml.parsers.dom;

import javax.xml.parsers.*; // JAXP

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.*;
import java.io.IOException;

public class JaxpExample {

  private static Node findNodeByName(Node node, String name) {
    if (name.equals(node.getNodeName())) {
      return node;
    } else {
      for (Node n = node.getFirstChild(); n != null; n = n.getNextSibling()) {
        Node found = findNodeByName(n, name);
        if (found != null) {
          return found;
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    if (args.length <= 0) {
      System.out.println("Usage: java JaxpExample xmlFileName");
      return;
    }
    String inputXmlFile = args[0];

    try {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      // Always turn on namespace awareness
      factory.setNamespaceAware(true);
      // Turn on validation
      factory.setValidating(true);

      DocumentBuilder parser = factory.newDocumentBuilder();
      Document document = parser.parse(inputXmlFile);

      Node dvdNode = findNodeByName(document, "note");
      if (dvdNode != null) {
        Node titleNode = findNodeByName(dvdNode, "from");
        if (titleNode != null) {
          System.out.println(titleNode.getTextContent());
        }
      }
    } catch (SAXException e) {
      System.out.println(inputXmlFile + " is not well-formed.");
    } catch (IOException e) {
      System.out.println("Due to an IOException, the parser could not find " + inputXmlFile);
    } catch (FactoryConfigurationError e) {
      System.out.println("Could not locate a factory class");
    } catch (ParserConfigurationException e) {
      System.out.println("Could not locate a JAXP parser");
    }

  }

}
