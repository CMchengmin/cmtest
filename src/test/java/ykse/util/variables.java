package ykse.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class variables {
	
	//public 


	
	public static String FindValueInVariables(String key) {
		SAXReader sr = new SAXReader();// 获取读取xml的对象。
		try {
			Document doc = sr.read("src/resources/variables.xml");
			Element resRoot = doc.getRootElement();
			for (int i = 0; i < resRoot.elements().size(); i++) {
				if (((Element) resRoot.elements().get(i)).attributeValue("name").equals(key)) {

					return  ((Element) resRoot.elements().get(i)).attributeValue("value");

				}

			}

			return null;

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	

	
	
}
