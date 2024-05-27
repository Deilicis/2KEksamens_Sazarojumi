package main;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1275, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel galvenaisTitulsLbl = new JLabel("Sazarojuma konstrukcijas programmēšanas valodā Java");
		galvenaisTitulsLbl.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		galvenaisTitulsLbl.setBounds(254, 66, 797, 87);
		contentPane.add(galvenaisTitulsLbl);
		
		JLabel testsLbl = new JLabel("TESTS");
		testsLbl.setFont(new Font("Sitka Text", Font.PLAIN, 40));
		testsLbl.setBounds(567, 10, 120, 60);
		contentPane.add(testsLbl);
		
		JButton saktBtn = new JButton("Sākt");
		saktBtn.setBounds(400, 291, 408, 73);
		contentPane.add(saktBtn);
		
		JButton izietBtn = new JButton("Iziet");
		izietBtn.setBounds(400, 403, 408, 73);
		contentPane.add(izietBtn);
	}
}
