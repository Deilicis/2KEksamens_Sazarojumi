package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Lietotajs implements Serializable {
	private static final long serialVersionUID = 2L;
	String vards;
	ArrayList<String> rezultati;
	StringBuilder str = new StringBuilder();
	public Lietotajs(String vards, ArrayList<String> rezultati) {
		this.vards=vards;
		this.rezultati=rezultati;
	}
	public void setVards(String v) {
		vards=v;
	}
	public void setRezultati(ArrayList<String> rez) {
		rezultati=rez;
	}
	public String getVards() {
		return vards;
	}
	public ArrayList<String> getRezultati(){
		return rezultati;
	}
	@Override
	public String toString() {
		for (int i = 0; i < rezultati.size(); i++) {
			str.append(rezultati.get(i)).append("/10 | ");
		}
		return "|Vārds: " + vards + " | Pareizi atbildēti: " + str.toString();
	}
}
