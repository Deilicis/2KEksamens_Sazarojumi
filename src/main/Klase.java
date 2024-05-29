package main;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

public class Klase {
	static ArrayList<UzdPlain> uzdArray = new ArrayList<UzdPlain>();
	static Image jaut3Img = new ImageIcon(Klase.class.getResource("/jaut3.png")).getImage();
	static Image jaut6Img = new ImageIcon(Klase.class.getResource("/jaut6.png")).getImage();
	static Image jaut7Img = new ImageIcon(Klase.class.getResource("/jaut7.png")).getImage();
	static Image jaut10Img = new ImageIcon(Klase.class.getResource("/jaut10.png")).getImage();
	public static void main(String[] args) {
		String[] var1 = {"break","final","return","default"};
		uzdArray.add(new UzdPlain("Kurš no šiem nodrošina noklusējuma gadījumu switch konstrukcijā?", "default", null, var1));
		String[] var2 = {"iziet no cikla","beigt switch","apturēt kodu","darbināt case"};
		uzdArray.add(new UzdPlain("Kāds ir 'break' mērķis switch konstrukcijā?", "beigt switch", null, var2));
		String[] var3 = {"Pāra skaitlis","Nepāra skaitlis","Error","0"};
		uzdArray.add(new UzdPlain("Kāds ir 'break' mērķis switch konstrukcijā?", "Pāra skaitlis", jaut3Img, var3));
		String[] var4 = {"int", "double", "String", "boolean"};
		uzdArray.add(new UzdPlain("Kāda veida izteiksme tiek izmantota switch konstrukcijā, sākot ar Java 7?", "String", null, var4));
		String[] var5 = {"if", "switch", "for", "while"};
		uzdArray.add(new UzdPlain("Kurš no šiem tiek izmantots, lai izvēlētos starp vairākiem iespējamiem izpildes ceļiem, pamatojoties uz vienas mainīgās vērtību?", "switch", null, var5));
		String[] var6 = {"5, 10, 5", "5, 5, 15", "10, 10, 5", "5, 5, 10"};
		uzdArray.add(new UzdPlain("Kādi būs šī koda izvaddati?", "5, 10, 5", jaut6Img, var6));
		String[] var7 = {"SeptiņiDesmit", "Desmit", "Divdesmit", "Default"};
		uzdArray.add(new UzdPlain("Kādi būs šī koda izvaddati?", "SeptiņiDesmit", jaut7Img, var7));
		String[] var8 = {"'Switch' var lietot jebkādus mainīgos", "'case' var lietot jebkādus mainīgos", "'default' nedrīkst nelietot", "'Switch' var lietot 'String' mainīgos"};
		uzdArray.add(new UzdPlain("Kuri no šiem apgalvojumiem ir patiesi?", "'Switch' var lietot 'String' mainīgos", null, var8));
		String[] var9 = {"int, String, enum", "long, float, double", "float, boolean, double", "Object, Array, List"};
		uzdArray.add(new UzdPlain("Kuri no šiem mainīgiem nevar tikt lietoti 'Switch' konstrukcijā?", "int, String, enum", null, var9));
		String[] var10 = {"Viens", "Divi", "Trīs", "DiviTrīsDefault"};
		uzdArray.add(new UzdPlain("Kādi būs šī koda izvaddati?", "DiviTrīsDefault", jaut10Img, var10));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static ArrayList<UzdPlain> getRandOrderJautajumi() {
		Collections.shuffle(uzdArray);
		return uzdArray;
	}

}
