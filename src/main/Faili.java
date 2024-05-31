package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Faili {

	public static void ierakstit(Lietotajs liet) {
//        try (final FileOutputStream fout = new FileOutputStream("lietotaji.txt");
//          final ObjectOutputStream out = new ObjectOutputStream(fout)) {
//         out.writeObject(liet);
//         out.flush();
//         System.out.println("Fails saglabāts");
//    } catch (IOException e) {
//         e.printStackTrace();
//    }
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
	@SuppressWarnings("unchecked")
    public static ArrayList<Lietotajs> readObjectFromFile() {
        ArrayList<Lietotajs> result = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("lietotaji.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = (ArrayList<Lietotajs>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Fails nav atrasts!");
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return result;
    }

}
