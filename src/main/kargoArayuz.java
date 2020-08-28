package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;



import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class kargoArayuz {
	private String sehirler[]= {"Adana", "Adýyaman", "Afyon", "Agrý", "Amasya", "Ankara", "Antalya", "Artvin",
			"Aydýn", "Balýkesir", "Bilecik", "Bingol", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum", 
			"Denizli", "Diyarbakýr", "Edirne", "Elazýg", "Erzincan", "Erzurum", "Eskiþehir", "Gaziantep", "Giresun",
			"Gümüþhane", "Hakkari", "Hatay", "Isparta", "Mersin", "Istanbul", "Izmir", 
			"Kars", "Kastamonu", "Kayseri", "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", 
			"Manisa", "K.maraþ", "Mardin", "Mugla", "Muþ", "Nevþehir", "Nigde", "Ordu", "Rize", "Sakarya", "Samsun",
			"Siirt", "Sinop", "Sivas", "Tekirdag", "Tokat", "Trabzon", "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat",
			"Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan", "Igdýr", 
			"Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce" };
	
	public String[] getSehirler() {
		return this.sehirler;
	}

	public static ArrayList <Integer> hedefler = new ArrayList<Integer>();
	
	private JFrame frame;
	int counter;
	@SuppressWarnings("rawtypes")
	JList list;
	String onceki= "";
	public JFrame getFrame() {
		return frame;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kargoArayuz window = new kargoArayuz();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kargoArayuz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel deliveryIcon = new JLabel("New label");
		deliveryIcon.setIcon(new ImageIcon(kargoArayuz.class.getResource("/images/Delivery\u0130con.png")));
		deliveryIcon.setBounds(471, 290, 430, 360);
		frame.getContentPane().add(deliveryIcon);
		
		JPanel panel = new JPanel();
		panel.setName("");
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 900, 650);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox cmbBoxSehir = new JComboBox(sehirler);
		cmbBoxSehir.setBounds(102, 120, 277, 34);
		cmbBoxSehir.setBorder(null);
		cmbBoxSehir.setBackground(new Color(255, 140, 0));
		cmbBoxSehir.setForeground(Color.WHITE);
		panel.add(cmbBoxSehir);
		
		JLabel closeIcon = new JLabel("New label");
		closeIcon.setBounds(837, -3, 58, 64);
		closeIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeIcon.png")));
		panel.add(closeIcon);
		
		JPanel Yatay = new JPanel();
		Yatay.setBounds(0, 77, 900, 43);
		Yatay.setBackground(new Color(255, 250, 205));
		Yatay.setToolTipText("adad");
		panel.add(Yatay);
		Yatay.setLayout(null);
		
		JLabel sehirSec = new JLabel("Gidilecek \u015Eehirleri  Se\u00E7iniz");
		sehirSec.setBounds(104, -11, 299, 64);
		Yatay.add(sehirSec);
		sehirSec.setForeground(Color.GRAY);
		sehirSec.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		
		JLabel carIcon = new JLabel("New label");
		carIcon.setIcon(new ImageIcon(kargoArayuz.class.getResource("/images/icons8_shipped_40px.png")));
		//carIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carIcon.png")));
		carIcon.setBounds(40, 0, 43, 40);
		Yatay.add(carIcon);
		
		JPanel Dik = new JPanel();
		Dik.setBounds(38, 0, 43, 650);
		Dik.setToolTipText("adad");
		Dik.setBackground(new Color(255, 250, 205));
		panel.add(Dik);
		Dik.setLayout(null);
		
		JPanel morDik = new JPanel();
		morDik.setBackground(new Color(147, 112, 219));
		morDik.setBounds(78, 0, 25, 650);
		panel.add(morDik);
		
		JPanel morYatay = new JPanel();
		morYatay.setBackground(new Color(147, 112, 219));
		morYatay.setBounds(0, 56, 900, 25);
		panel.add(morYatay);
		
		JLabel lblNewLabel = new JLabel("VOLKSFRACHT KARGO");
		lblNewLabel.setForeground(new Color(70, 130, 180));
		lblNewLabel.setFont(new Font("Gill Sans MT", Font.PLAIN, 50));
		lblNewLabel.setBounds(108, 3, 697, 58);
		panel.add(lblNewLabel);
		DefaultListModel<String> c1 = new DefaultListModel<String>();
		
		JButton sehirEkle = new JButton("\u015Eehir Ekle");
		sehirEkle.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		sehirEkle.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
					if(c1.contains(cmbBoxSehir.getSelectedItem().toString())) {
						JOptionPane sc = new JOptionPane();
						sc.showMessageDialog(frame, "Ayný þehiri iki kere giremezsiniz","Hata",JOptionPane.ERROR_MESSAGE);
					}
					else if (counter>9) {
						JOptionPane sc = new JOptionPane();
						sc.showMessageDialog(frame, "10'dan fazla þehir giremezsiniz","Hata",JOptionPane.ERROR_MESSAGE);
					}
					else {
						c1.addElement(cmbBoxSehir.getSelectedItem().toString());
						counter++;
						hedefler.add(cmbBoxSehir.getSelectedIndex());
					}
					onceki=cmbBoxSehir.getSelectedItem().toString();
			}
		});
		sehirEkle.setBounds(174, 184, 126, 43);
		panel.add(sehirEkle);
		
		list= new JList(c1);
		list.setSelectionBackground(new Color(154, 205, 50));
		list.setSelectionForeground(new Color(0, 100, 0));
		list.setForeground(new Color(255, 255, 255));
		list.setFont(new Font("Gill Sans MT", Font.PLAIN, 22));
		list.setBackground(new Color(250, 128, 114));
		list.setBounds(102, 359, 277, 291);
		panel.add(list);
		
		JButton teslimatYap = new JButton("Yol Haritas\u0131n\u0131 G\u00F6ster");
		teslimatYap.setFont(new Font("Gill Sans MT", Font.PLAIN, 19));
		teslimatYap.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				if(counter==0) {
					JOptionPane sc = new JOptionPane();
					sc.showMessageDialog(frame, "Hiç Þehir seçilmedi","Hata",JOptionPane.ERROR_MESSAGE);
				} 
				else {
					
					try {
						teslimHarita framex = new teslimHarita();
						framex.setVisible(true);
						frame.dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
				
			}
		});
		teslimatYap.setBounds(147, 240, 212, 43);
		panel.add(teslimatYap);
		
		
		JButton sehirSil = new JButton("\u015Eehir Sil");
		sehirSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(counter==0) {
					JOptionPane.showMessageDialog(frame, "Hiç Þehir seçilmedi","Hata",JOptionPane.ERROR_MESSAGE);
				}
				else {
					int delete=-1;
					for (int i=0; i<sehirler.length; i++) {
						if(sehirler[i].equals(list.getSelectedValue())) {
							delete=i;
							break;
						}				
					}
					hedefler.remove(hedefler.indexOf(delete));
					c1.removeElement(list.getSelectedValue());
					counter--;
					
				}
				
				
			}
		});
		sehirSil.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		sehirSil.setBounds(174, 296, 126, 43);
		panel.add(sehirSil);
		
		
			
	}
}
