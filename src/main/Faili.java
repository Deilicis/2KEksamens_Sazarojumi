package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Faili {

	public static void ierakstitF(Lietotajs liet) {
	    try {
	        FileWriter fw = new FileWriter("lietotaji.txt", true);
	        PrintWriter pw = new PrintWriter(fw);
	        String str = liet.getVards();
	        for (int j = 0; j < liet.getRezultati().size(); j++) {
	            str += liet.getRezultati().get(j) + " ";
	        }
	        str += "\n" + liet.getParAtbildeti() + "\n";
	        pw.print(str);
	        pw.close();
	    } catch (IOException e) {
	        JOptionPane.showMessageDialog(null, "Radās kļūda ierakstot failā!", "Kļūda", JOptionPane.ERROR_MESSAGE);
	    }
	}
	public static ArrayList<Lietotajs> izveidotLiet() {
	    ArrayList<Lietotajs> lietList = new ArrayList<>();
	    try (BufferedReader br = new BufferedReader(new FileReader("lietotaji.txt"))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            String vards = line.trim();
	            String[] rezultatiArr = br.readLine().trim().split(" ");
	            ArrayList<String> rez = new ArrayList<>(Arrays.asList(rezultatiArr));
	            int parAtbildeti = Integer.parseInt(br.readLine().trim());
	            Lietotajs liet = new Lietotajs(vards, rez, parAtbildeti);
	            lietList.add(liet);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return lietList;
	}
}