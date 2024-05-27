package main;

import java.awt.EventQueue;
import java.util.ArrayList;

public class Klase {
	static ArrayList<Uzdevumi> uzdArray = new ArrayList<Uzdevumi>();
	public static void main(String[] args) {
		String[] var1 = {"6", "8", "9", "10"};
		uzdArray.add(new Uzdevumi("Kādi būs šī koda izvaddati?", 1, null, var1));
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

}
