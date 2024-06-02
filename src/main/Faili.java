package main;

import java.io.*;
import java.util.ArrayList;

public class Faili {

	public static void ierakstit(Lietotajs liet) {
//      try (final FileOutputStream fout = new FileOutputStream("lietotaji.txt");
//        final ObjectOutputStream out = new ObjectOutputStream(fout)) {
//       out.writeObject(liet);
//       out.flush();
//       System.out.println("Fails saglabāts");
//  } catch (IOException e) {
//       e.printStackTrace();
//  }
		 try (FileOutputStream fos = new FileOutputStream("lietotaji.txt");
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
	            oos.writeObject(liet);
	            oos.flush();
	        } catch (FileNotFoundException e) {
				System.out.println("Fails nav atrasts!");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println(e);
				e.printStackTrace();
			}
	    
	}
	 public static Lietotajs readObjectFromFile() throws IOException, ClassNotFoundException {
	        Lietotajs result = null;
	        try (FileInputStream fis = new FileInputStream("lietotaji.txt");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
	            result = (Lietotajs) ois.readObject();
	        }
	        return result;
	    }

}
