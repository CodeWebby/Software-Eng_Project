package CellwavejaUI;
import java.io.*;

import Core.Product;
public class ReadFile  {
	public static boolean readProductfile() {
		try {
			FileReader file= new FileReader("ProductFiles");
			BufferedReader reader= new BufferedReader(file); 
			
			String  text="";
			String line= reader.readLine();
			while(line!=null) {
				String []attributes=line.split("//");
				addproductinformationGUI.newProducts.add(Product.createProduct(attributes[0], attributes[1],attributes[2], attributes[3],Float.valueOf((attributes[4])),Float.valueOf( attributes[5]),Integer.valueOf( attributes[6]), attributes[7], attributes[8]));
				text+= line;
				line=reader.readLine();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
