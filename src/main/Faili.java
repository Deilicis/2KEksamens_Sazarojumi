package main;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Faili {
	static boolean first;

	public void ierakstitF(Lietotajs liet) {
		if (liet.getRezultati() == null) {
			JOptionPane.showMessageDialog(null, "Rezultāti nevar būt null", "Kļūda", JOptionPane.ERROR_MESSAGE);
			return;
		}
		try {
			FileWriter fw = new FileWriter("lietotajs.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			if (first) {
				pw.print("");
				pw.close();
				first = false;
			}
			String str = liet.getVards() + "\n";
			for (String rezultats : liet.getRezultati()) {
				str += rezultats + "";
			}
			pw.print(str);
			pw.println("\n");
			pw.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Radās kļūda ierakstot failā!", "Kļūda", JOptionPane.ERROR_MESSAGE);
		}
	}

	public ArrayList<Lietotajs> izveidotLiet() {
		ArrayList<Lietotajs> lietList = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("lietotajs.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (!line.trim().isEmpty()) {
					String vards = line.trim();
					ArrayList<String> rezultatiList = new ArrayList<>();
					while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
						rezultatiList.add(line.trim());
					}
					String[] rezultati = rezultatiList.toArray(new String[0]);
					Lietotajs liet = new Lietotajs(vards, rezultati);
					lietList.add(liet);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lietList;
	}
}
