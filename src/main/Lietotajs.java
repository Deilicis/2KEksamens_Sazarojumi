package main;

import java.io.Serializable;

public class Lietotajs implements Serializable {
    private static final long serialVersionUID = 2L;
    private String vards;
    private String[] rezultati;

    public Lietotajs(String vards, String[] rezultati) {
        this.vards = vards;
        this.rezultati = rezultati != null ? rezultati : new String[0];
    }

    public void setVards(String v) {
        vards = v;
    }

    public void setRezultati(String[] rez) {
        rezultati = rez != null ? rez : new String[0];
    }

    public String getVards() {
        return vards;
    }

    public String[] getRezultati() {
        return rezultati;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (String rezultats : rezultati) {
            str.append(rezultats).append("/10 | ");
        }
        return str.toString();
    }
}
