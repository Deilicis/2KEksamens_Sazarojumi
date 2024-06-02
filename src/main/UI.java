package main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
public class UI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel mainPanel = new JPanel();
    private JPanel infoPanel = new JPanel();
    private JPanel questPanel;
    private JPanel rezPanel;
    private JPanel cardPanel;
    private CardLayout cardLayout;
    JLabel kursJautLbl;
    JLabel jautImgLbl;
    JLabel jautTxtLbl;
    JLabel nepareiziLbl;
    JLabel rezLbl;
    JLabel rezImgLbl;
    JButton izv1Btn;
    JButton izv2Btn;
    JButton izv3Btn;
    JButton izv4Btn;
    boolean atbildetsPareizi;
    boolean atbildetsPareizi1;
    String teksts;
    String parAtbilde;
    Image bilde;
    String[] atbVar;
    String lietAtb;
    int[] i = {0};
    int parAtbildeti;
    ArrayList<Integer> rez = new ArrayList<Integer>();
    Lietotajs curLietotajs = new Lietotajs(null, rez);
    ArrayList<Lietotajs> lietotaji=new ArrayList<Lietotajs>();
   
    boolean pirmaisMeiginajums;

    Klase klase = new Klase();
    ArrayList<UzdPlain> uzd;
    Image bckImg2 = new ImageIcon(this.getClass().getResource("/backgroundTest.png")).getImage();
    Image basicImg = new ImageIcon(this.getClass().getResource("/basicImg.png")).getImage();
    Image goodRez = new ImageIcon(this.getClass().getResource("/goodRez.jpg")).getImage();
    Image midRez = new ImageIcon(this.getClass().getResource("/midRez.jpg")).getImage();
    Image badRez = new ImageIcon(this.getClass().getResource("/badRez.jpg")).getImage();
    private JTextField vardaTxtField;


    public UI() {
        initialize();
        setupInfoPanel();
        setupQuestPanel();
        setupRezPanel();
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
        mainPanel.setBackground(Color.white);
        JLabel galvenaisTitulsLbl = new JLabel("Sazarojuma konstrukcijas programmēšanas valodā Java");
        galvenaisTitulsLbl.setFont(new Font("Sitka Text", Font.PLAIN, 30));
        galvenaisTitulsLbl.setBounds(254, 66, 797, 87);
        mainPanel.add(galvenaisTitulsLbl);

        JLabel testsLbl = new JLabel("TESTS");
        testsLbl.setFont(new Font("Sitka Text", Font.PLAIN, 40));
        testsLbl.setBounds(548, 10, 120, 60);
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

        cardPanel.add(mainPanel, "mainPanel");
        
        vardaTxtField = new JTextField();
        vardaTxtField.setFont(new Font("Sitka Text", Font.BOLD, 10));
        vardaTxtField.setText("");
        vardaTxtField.setBounds(432, 223, 341, 29);
        mainPanel.add(vardaTxtField);
        vardaTxtField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Ievadiet vārdu");
        lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 15));
        lblNewLabel.setBounds(548, 262, 120, 29);
        mainPanel.add(lblNewLabel);

        saktBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(!vardaTxtField.getText().isEmpty()) {
	            	if(curLietotajs.getVards()==null) {
		            	curLietotajs.setVards(vardaTxtField.getText());
	            	}
                cardLayout.show(cardPanel, "infoPanel");
            	}
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
        kursJautLbl.setBounds(208, 413, 217, 55);
        questPanel.add(kursJautLbl);

        jautImgLbl = new JLabel();
        jautImgLbl.setBounds(348, 0, 500, 468);
        questPanel.add(jautImgLbl);

        jautTxtLbl = new JLabel("blah blah blah blah");
        jautTxtLbl.setFont(new Font("Sitka Text", Font.PLAIN, 15));
        jautTxtLbl.setBounds(156, 507, 965, 47);
        questPanel.add(jautTxtLbl);

        izv1Btn = new JButton("1.Izv");
        izv1Btn.setFont(new Font("Sitka Text", Font.BOLD, 15));
        izv1Btn.setBounds(10, 564, 318, 41); 
        izv1Btn.setContentAreaFilled(false); 
        izv1Btn.setFocusPainted(false); 
        izv1Btn.setOpaque(false);
        questPanel.add(izv1Btn);

        izv2Btn = new JButton("2.Izv");
        izv2Btn.setFont(new Font("Sitka Text", Font.BOLD, 15));
        izv2Btn.setBounds(327, 564, 309, 41);
        izv2Btn.setContentAreaFilled(false); 
        izv2Btn.setFocusPainted(false); 
        izv2Btn.setOpaque(false);
        questPanel.add(izv2Btn);

        izv3Btn = new JButton("3.Izv");
        izv3Btn.setFont(new Font("Sitka Text", Font.BOLD, 15));
        izv3Btn.setBounds(634, 564, 309, 41); 
        izv3Btn.setContentAreaFilled(false); 
        izv3Btn.setFocusPainted(false); 
        izv3Btn.setOpaque(false);
        questPanel.add(izv3Btn);

        izv4Btn = new JButton("4.Izv");
        izv4Btn.setFont(new Font("Sitka Text", Font.BOLD, 15));
        izv4Btn.setBounds(942, 564, 309, 41);
        izv4Btn.setContentAreaFilled(false); 
        izv4Btn.setFocusPainted(false); 
        izv4Btn.setOpaque(false);
        questPanel.add(izv4Btn);

        nepareiziLbl = new JLabel("Nepareizi!");
        nepareiziLbl.setFont(new Font("Sitka Text", Font.BOLD, 20));
        nepareiziLbl.setBounds(877, 65, 113, 47);
        nepareiziLbl.setVisible(false);
        questPanel.add(nepareiziLbl);


        JLabel backImg2 = new JLabel();
        backImg2.setIcon(new ImageIcon(bckImg2));
        backImg2.setBounds(94, 0, 1074, 502);
        questPanel.add(backImg2);

        izv1Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lietAtb = izv1Btn.getText();
                boolean correct = checkIfPar(parAtbilde, lietAtb);
                checkIf10(i[0], correct);
                if (correct) {
                    i[0]++;
                }
            }
        });

        izv2Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lietAtb = izv2Btn.getText();
                boolean correct = checkIfPar(parAtbilde, lietAtb);
                checkIf10(i[0], correct);
                if (correct) {
                    i[0]++;
                }
            }
        });

        izv3Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lietAtb = izv3Btn.getText();
                boolean correct = checkIfPar(parAtbilde, lietAtb);
                checkIf10(i[0], correct);
                if (correct) {
                    i[0]++;
                }
            }
        });

        izv4Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lietAtb = izv4Btn.getText();
                boolean correct = checkIfPar(parAtbilde, lietAtb);
                checkIf10(i[0], correct);
                if (correct) {
                    i[0]++;
                }
            }
        });

        cardPanel.add(questPanel, "questPanel");

        }
        public void setupRezPanel() {
            rezPanel = new JPanel();
            rezPanel.setLayout(null);
            rezPanel.setBackground(Color.white);
            
            rezImgLbl = new JLabel();
            rezImgLbl.setBounds(0, 93, 502, 451);
            rezPanel.add(rezImgLbl);
            
            JLabel rezTitleLbl = new JLabel("Rezultāts");
            rezTitleLbl.setBounds(512, 10, 244, 106);
            rezTitleLbl.setFont(new Font("Sitka Text", Font.BOLD, 50));
            rezPanel.add(rezTitleLbl);

            rezLbl = new JLabel();
            rezLbl.setHorizontalAlignment(SwingConstants.CENTER);
            rezLbl.setFont(new Font("Sitka Text", Font.BOLD, 30));
            rezLbl.setBounds(438, 123, 823, 59);
            rezPanel.add(rezLbl);
            cardPanel.add(rezPanel, "rezPanel");
            
            JButton uzSakBtn = new JButton("Uz Sākumu");
            uzSakBtn.setFont(new Font("Sitka Text", Font.BOLD, 15));
            uzSakBtn.setBounds(1024, 539, 237, 56);
            rezPanel.add(uzSakBtn);
        
        uzSakBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i[0] = 0;
                parAtbildeti = 0;
                pirmaisMeiginajums = true;
                cardLayout.show(cardPanel, "mainPanel");
            }
        });
    }

        public void quizEkrans() {
            questPanel.revalidate();
            questPanel.repaint();
            teksts = uzd.get(i[0]).getTeksts();
            parAtbilde = uzd.get(i[0]).getParAtbilde();
            bilde = uzd.get(i[0]).getBilde();
            atbVar = uzd.get(i[0]).getAtbVar();

            pirmaisMeiginajums = true;  // Reset first attempt flag for new question

            kursJautLbl.setText((i[0] + 1) + ". Jautājums");
            jautTxtLbl.setText(teksts);
            jautImgLbl.setIcon(null);
            if (bilde != null)
                jautImgLbl.setIcon(new ImageIcon(bilde));
            else
                jautImgLbl.setIcon(new ImageIcon(basicImg));
            izv1Btn.setText(atbVar[0]);
            izv2Btn.setText(atbVar[1]);
            izv3Btn.setText(atbVar[2]);
            izv4Btn.setText(atbVar[3]);
        }

        private void checkIf10(int i, boolean correct) {
            if (i < 10) {
                if (correct) {
                    if (pirmaisMeiginajums) {
                        parAtbildeti++;
                    }
                    pirmaisMeiginajums = true;
                    quizEkrans();
                } else {
                    nepareiziLbl.setVisible(true);
                    pirmaisMeiginajums = false;
                }
            } else {
                if (correct && pirmaisMeiginajums) {
                    parAtbildeti++;
                }
                rezLbl.setText(parAtbildeti + "/10 Jautājumi atbildēti pareizi ar pirmo!");
                curLietotajs.setRezultati(rez);
                Faili.ierakstit(curLietotajs);
                try {
					lietotaji.add(Faili.readObjectFromFile());
					System.out.println(lietotaji.get(0));
					} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Faili.ierakstit(curLietotajs);  // Save the current user to the file
                if (parAtbildeti > 7) {
                    rezImgLbl.setIcon(new ImageIcon(goodRez));
                } else if (parAtbildeti > 4) {
                    rezImgLbl.setIcon(new ImageIcon(midRez));
                } else {
                    rezImgLbl.setIcon(new ImageIcon(badRez));
                }
                cardLayout.show(cardPanel, "rezPanel");
            }
        }


    public boolean checkIfPar(String par, String liet) {
        System.out.println(liet.equals(par));
        return liet.equals(par);
    
    }
}