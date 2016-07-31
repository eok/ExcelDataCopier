/**
 * 
 */
package com.koguze.edc;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

/**
 * @author koguze
 *
 */
public class Main {

	/**
	 * @param args
	 */

	private static final String ops = "ops";
	private static final String op = "op"; 

	private static final String srcfilepath = "srcfilepath";
	private static final String srcsheet = "srcsheet";
	private static final String srcrowstart = "srcrowstart";
	private static final String srcrowend = "srcrowend";
	private static final String srccolumnstart = "srccolumnstart";
	private static final String srccolumnend = "srccolumnend";

	private static final String dstfilepath = "dstfilepath";
	private static final String dstsheet = "dstsheet";
	private static final String dstrowstart = "dstrowstart";
	private static final String dstrowend = "dstrowend";
	private static final String dstcolumnstart = "dstcolumnstart";
	private static final String dstcolumnend = "dstcolumnend";

	public static void main(String[] args) {

		// it only needs one parameter
		// path of rule file

		if (args != null && args.length > 0) {
			Main m = new Main();
			m.readDataFromRuleFile(args[0]);
		} else {

		}
	}

	private void readDataFromRuleFile(String ruleFilePath) {
		// read rules from file

		try {

			File ruleFile = new File(ruleFilePath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(ruleFile);

			NodeList opList = doc.getElementsByTagName(op);

			for (int temp = 0; temp < opList.getLength(); temp++) {

				Node operation = opList.item(temp);

				System.out.println("\nCurrent Element :" + operation.getNodeName());

				if (operation.getNodeType() == Node.ELEMENT_NODE) {


				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
