package main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class UI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel mainPanel = new JPanel();
    private JPanel infoPanel = new JPanel();
    private JPanel cardPanel;
    private CardLayout cardLayout;
    JLabel kursJautLbl;
    JLabel jautImgLbl;
    JLabel jautTxtLbl;
    JButton izv1Btn;
    JButton izv2Btn;
    JButton izv3Btn;
    JButton izv4Btn;
    Klase klase = new Klase();
    ArrayList<UzdPlain> uzd;
    Image bckImg = new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();
    Image bckImg2 = new ImageIcon(this.getClass().getResource("/backgroundTest.jpeg")).getImage();
    private JPanel questPanel;

    public UI() {
        initialize();
        setupInfoPanel();
        setupQuestPanel();
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
        goBtn.setBounds(913, 500, 241, 73);
        goBtn.setBorderPainted(false); 
        goBtn.setContentAreaFilled(false); 
        goBtn.setFocusPainted(false); 
        goBtn.setOpaque(false);
        infoPanel.add(goBtn);
        
        JButton bckBtn = new JButton("Atpakaļ");
        bckBtn.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        bckBtn.setBounds(70, 500, 241, 73);
        bckBtn.setBorderPainted(false); 
        bckBtn.setContentAreaFilled(false); 
        bckBtn.setFocusPainted(false); 
        bckBtn.setOpaque(false);
        infoPanel.add(bckBtn);
        
        JLabel imgLbl = new JLabel();
        imgLbl.setIcon(new ImageIcon(bckImg));
        imgLbl.setBounds(-138, -312, 1434, 1125);
        infoPanel.add(imgLbl);
        
        goBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	uzd = klase.getRandOrderJautajumi();
            	cardLayout.show(cardPanel, "questPanel");  
            	quizEkrans();
            }
        });
        bckBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              cardLayout.show(cardPanel, "mainPanel");  
            }
        });
        
        cardPanel.add(infoPanel, "infoPanel");
        
    }
    private void setupQuestPanel() {

        questPanel = new JPanel();
        questPanel.setLayout(null);
        
        kursJautLbl = new JLabel("_. Jautājums");
        kursJautLbl.setFont(new Font("Sitka Text", Font.BOLD, 30));
        kursJautLbl.setBounds(504, 0, 217, 55);
        questPanel.add(kursJautLbl);
        
        jautImgLbl = new JLabel();
        jautImgLbl.setBounds(382, 75, 447, 370);
        questPanel.add(jautImgLbl);
        
        jautTxtLbl = new JLabel("blah blah blah blah");
        jautTxtLbl.setFont(new Font("Sitka Text", Font.PLAIN, 15));
        jautTxtLbl.setBounds(241, 391, 679, 47);
        questPanel.add(jautTxtLbl);
        
        izv1Btn = new JButton("1.Izv");
        izv1Btn.setFont(new Font("Sitka Text", Font.BOLD, 15));
        izv1Btn.setBounds(10, 496, 265, 41);
        izv1Btn.setBorderPainted(false); 
        izv1Btn.setContentAreaFilled(false); 
        izv1Btn.setFocusPainted(false); 
        izv1Btn.setOpaque(false);
        questPanel.add(izv1Btn);
        
        izv2Btn = new JButton("2.Izv");
        izv2Btn.setFont(new Font("Sitka Text", Font.BOLD, 15));
        izv2Btn.setBounds(340, 496, 265, 41);
        izv2Btn.setBorderPainted(false); 
        izv2Btn.setContentAreaFilled(false); 
        izv2Btn.setFocusPainted(false); 
        izv2Btn.setOpaque(false);
        questPanel.add(izv2Btn);
        
        izv3Btn = new JButton("3.Izv");
        izv3Btn.setFont(new Font("Sitka Text", Font.BOLD, 15));
        izv3Btn.setBounds(667, 496, 265, 41);
        izv3Btn.setBorderPainted(false); 
        izv3Btn.setContentAreaFilled(false); 
        izv3Btn.setFocusPainted(false); 
        izv3Btn.setOpaque(false);
        questPanel.add(izv3Btn);
        
        izv4Btn = new JButton("4.Izv");
        izv4Btn.setFont(new Font("Sitka Text", Font.BOLD, 15));
        izv4Btn.setBounds(986, 496, 265, 41);
        izv4Btn.setBorderPainted(false); 
        izv4Btn.setContentAreaFilled(false); 
        izv4Btn.setFocusPainted(false); 
        izv4Btn.setOpaque(false);
        questPanel.add(izv4Btn);
        
        JLabel backImg2 = new JLabel();
        backImg2.setIcon(new ImageIcon(bckImg2));
        backImg2.setBounds(215, 65, 748, 403);
        questPanel.add(backImg2);
        
        cardPanel.add(questPanel, "questPanel");
        
    }
    public void quizEkrans(){
    	boolean atbildetsPareizi;
    	String teksts;
    	String parAtbilde;
    	Image bilde;
    	String[] atbVar;
    	int[] i = {1};
//    	do {
    		
    		teksts=uzd.get(i[0]).getTeksts();
        	parAtbilde=uzd.get(i[0]).getParAtbilde();
        	bilde=uzd.get(i[0]).getBilde();
        	atbVar=uzd.get(i[0]).getAtbVar();
        kursJautLbl.setText(i[0]+". Jautājums");
        jautTxtLbl.setText(teksts);
        if(bilde!=null) {
        	jautImgLbl.setIcon(new ImageIcon(bilde));
        }
        izv1Btn.setText(atbVar[0]);
        izv2Btn.setText(atbVar[1]);
        izv3Btn.setText(atbVar[2]);
        izv4Btn.setText(atbVar[3]);
        questPanel.revalidate();
        questPanel.repaint();
        
       izv1Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             i[0]++;
            }
        });
       izv2Btn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	  i[0]++;
           }
       });
       izv3Btn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	   i[0]++;
           }
       });
       izv4Btn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	   i[0]++;
           }
       });
        
//    }while(i[0]!=10);
    }
}
