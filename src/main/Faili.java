package main;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Faili {

	public static void ierakstitF(Lietotajs liet) {
		try {
			FileWriter fw = new FileWriter("lietotaji.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			String str = "";
				str += liet.getVards() + "\n";
				for (int j = 0; j < liet.getRezultati().size(); j++) {
					str += liet.getRezultati().get(j) + " ";
				}
				str+="\n";
			pw.print(str);
			pw.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Radās kļūda ierakstot failā!", "Kļūda", JOptionPane.ERROR_MESSAGE);
		}
}
 @SuppressWarnings("resource")
  public static ArrayList<Lietotajs> izveidotPicaF() {
        ArrayList<Lietotajs> lietList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("lietotaji.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String vards = line.trim();
                ArrayList<String> rez = new ArrayList<>();
                for (String rezultats : rez) {
                    rez.add(rezultats.trim());
                }
                Lietotajs pica = new Lietotajs(vards, rez);
                lietList.add(pica);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lietList;
    }
}