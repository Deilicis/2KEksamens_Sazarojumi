package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Lietotajs implements Serializable {
	private static final long serialVersionUID = 2L;
	String vards;
	ArrayList<Integer> rezultati;
	public Lietotajs(String vards, ArrayList<Integer> rezultati) {
		this.vards=vards;
		this.rezultati=rezultati;
	}
	public void setVards(String v) {
		vards=v;
	}
	public void setRezultati(ArrayList<Integer> rez) {
		rezultati=rez;
	}
	public String getVards() {
		return vards;
	}
	public ArrayList<Integer> getRezultati(){
		return rezultati;
	}
}
