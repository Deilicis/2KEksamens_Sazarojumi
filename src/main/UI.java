package main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.WindowConstants;

public class UI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel mainPanel = new JPanel();
    private JPanel infoPanel = new JPanel();
    private JPanel cardPanel;
    private CardLayout cardLayout;
    Image bckImg = new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();

    public UI() {
        initialize();
        setupInfoPanel();
        setContentPane(cardPanel);
    }

    private void initialize() {
        setTitle("Tests");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(100, 100, 1275, 642);

        cardLayout = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);

        mainPanel.setLayout(null);

        JLabel galvenaisTitulsLbl = new JLabel("Sazarojuma konstrukcijas programmēšanas valodā Java");
        galvenaisTitulsLbl.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        galvenaisTitulsLbl.setBounds(254, 66, 797, 87);
        mainPanel.add(galvenaisTitulsLbl);

        JLabel testsLbl = new JLabel("TESTS");
        testsLbl.setFont(new Font("Sitka Text", Font.PLAIN, 40));
        testsLbl.setBounds(567, 10, 120, 60);
        mainPanel.add(testsLbl);

        JButton saktBtn = new JButton("Sākt");
        saktBtn.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        saktBtn.setBounds(484, 305, 241, 60);
        saktBtn.setBorderPainted(false); 
        saktBtn.setContentAreaFilled(false); 
        saktBtn.setFocusPainted(false); 
        saktBtn.setOpaque(false);
        mainPanel.add(saktBtn);

        JButton izietBtn = new JButton("Iziet");
        izietBtn.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        izietBtn.setBounds(484, 404, 241, 73);
        izietBtn.setBorderPainted(false); 
        izietBtn.setContentAreaFilled(false); 
        izietBtn.setFocusPainted(false); 
        izietBtn.setOpaque(false);
        mainPanel.add(izietBtn);

        JLabel autorLbl = new JLabel("Autors: Dāvis Zigners");
        autorLbl.setFont(new Font("Sitka Text", Font.PLAIN, 15));
        autorLbl.setBounds(1099, 576, 162, 29);
        mainPanel.add(autorLbl);

        JLabel imgLbl = new JLabel();
        imgLbl.setIcon(new ImageIcon(bckImg));
        imgLbl.setBounds(-138, -312, 1434, 1125);
        mainPanel.add(imgLbl);

        cardPanel.add(mainPanel, "mainPanel");

        saktBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "infoPanel");
            }
        });

        izietBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void setupInfoPanel() {
        infoPanel.setLayout(null);
        infoPanel.setBackground(Color.WHITE);

        JLabel infoLabel = new JLabel("Informācija par šo testu");
        infoLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
        infoLabel.setBounds(100, 100, 500, 50);
        infoPanel.add(infoLabel);
        
        JLabel infoLbl = new JLabel("Šis tests iekļauj 10 pēc nejauša gadījuma izvēlētus jautājumus par tēmu:");
        infoLbl.setFont(new Font("Sitka Text", Font.PLAIN, 20));
        infoLbl.setBounds(100, 178, 1020, 50);
        infoPanel.add(infoLbl);
        
        JLabel infoLbl_1 = new JLabel("Sazarošanas konstrukcijas programmēšanas valodā Java.");
        infoLbl_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
        infoLbl_1.setBounds(100, 218, 1020, 50);
        infoPanel.add(infoLbl_1);
        
        JLabel infoLbl_1_1 = new JLabel("Katrā jautājumā ir 4 izvēles opcijas ar vienu pareizu atbildi un uz jautājumiem atbild, kamēr ir pareizi.");
        infoLbl_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
        infoLbl_1_1.setBounds(100, 257, 1020, 50);
        infoPanel.add(infoLbl_1_1);
        
        JLabel infoLbl_1_1_1 = new JLabel("Beigās būs redzams jūsu rezultāts, parādot jūsu zināšanas par šo tēmu.");
        infoLbl_1_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
        infoLbl_1_1_1.setBounds(100, 299, 1020, 50);
        infoPanel.add(infoLbl_1_1_1);
        
        JLabel lblVeiksmi = new JLabel("Veiksmi!");
        lblVeiksmi.setFont(new Font("Sitka Text", Font.BOLD, 30));
        lblVeiksmi.setBounds(100, 359, 500, 50);
        infoPanel.add(lblVeiksmi);
        
        JButton goBtn = new JButton("Aiziet");
        goBtn.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        goBtn.setBounds(913, 507, 241, 73);
        goBtn.setBorderPainted(false); 
        goBtn.setContentAreaFilled(false); 
        goBtn.setFocusPainted(false); 
        goBtn.setOpaque(false);
        infoPanel.add(goBtn);
        
        JLabel imgLbl = new JLabel();
        imgLbl.setIcon(new ImageIcon(bckImg));
        imgLbl.setBounds(-138, -312, 1434, 1125);
        infoPanel.add(imgLbl);

        cardPanel.add(infoPanel, "infoPanel");
    }
}