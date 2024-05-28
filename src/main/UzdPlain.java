package main;

import java.awt.Image;

public class UzdPlain {
	String teksts;
	String parAtbilde;
	Image bilde;
	String[] atbVar;
	public UzdPlain(String teksts, String parAtbilde, Image bilde ,String[] atbVar) {
		this.teksts = teksts;
		this.parAtbilde = parAtbilde;
		this.bilde=bilde; 
		this.atbVar = atbVar;
	}
	public String getTeksts() {
		return teksts;
	}
	public String parAtbilde() {
		return parAtbilde;
	}
	public Image getBilde() {
		return bilde;
	}
	public String[] getAtbVar() {
		return atbVar;
	}

}
