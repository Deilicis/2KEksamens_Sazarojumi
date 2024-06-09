package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Lietotajs implements Serializable {
	private static final long serialVersionUID = 2L;
	String vards;
	ArrayList<String> rezultati;
	int parAtbildeti;
    public Lietotajs(String vards, ArrayList<String> rezultati, int parAtbildeti) {
        this.vards = vards;
        this.rezultati = rezultati;
        this.parAtbildeti = parAtbildeti;
    }

    public void setVards(String v) {
        vards = v;
    }

    public void setRezultati(ArrayList<String> rez) {
        rezultati = rez;
    }

    public void setParAtbildeti(int parAtbildeti) {
        this.parAtbildeti = parAtbildeti;
    }

    public String getVards() {
        return vards;
    }

    public ArrayList<String> getRezultati() {
        return rezultati;
    }

    public int getParAtbildeti() {
        return parAtbildeti;
    }

    @Override
    public String toString() {
    	StringBuilder str = new StringBuilder();
        for (int i = 0; i < rezultati.size(); i++) {
            str.append(rezultati.get(i)).append("/10 | ");
        }
        return "| Vārds: " + vards+ " | Rezultāti: " + str.toString();
    }
}
