package main;

import java.awt.Image;

public class Uzdevumi {
String teksts;
int parAtbilde;
Image bilde;
String[] atbVar;
public Uzdevumi(String teksts, int parAtbilde, Image bilde ,String[] atbVar){
	this.teksts = teksts;
	this.parAtbilde = parAtbilde;
	this.bilde = bilde;
	this.atbVar = atbVar;
}
public String getTeksts() {
	return teksts;
}
public int parAtbilde() {
	return parAtbilde;
}
public Image getBilde(){
	return bilde;
}
public String[] getAtbVar() {
	return atbVar;
}

}
