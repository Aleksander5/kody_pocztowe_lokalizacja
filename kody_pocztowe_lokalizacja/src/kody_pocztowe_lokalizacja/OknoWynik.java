package kody_pocztowe_lokalizacja;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class OknoWynik {
		
		private JFrame oknoWyniku;
		
		private JButton przyciskOK;
		
		private JLabel szerokosc;
		private JLabel szerokoscDane;
		private JLabel dlugosc;
		private JLabel dlugoscDane;
		private JLabel lokalizacja;
		private JLabel lokalizacjaDane;
		
		private JPanel panelOrganizacyjny;
		
		public void wyswietlOknoWynik( String lat, String lng, String loc ){
			
					panelOrganizacyjny = new JPanel();
						panelOrganizacyjny.setLayout( new GridBagLayout());
						
						GridBagConstraints ogranicznik = new GridBagConstraints();
						ogranicznik.insets = new Insets(5, 5, 5, 5);
						
						ogranicznik.gridx = 0;
							szerokosc = new JLabel();
							szerokosc.setText("Szerokoœæ: ");
								panelOrganizacyjny.add(szerokosc, ogranicznik);
							
						ogranicznik.gridx = 1;
							szerokoscDane = new JLabel();
							szerokoscDane.setText(lat);
								panelOrganizacyjny.add(szerokoscDane, ogranicznik);
								
						ogranicznik.gridx = 0;
						ogranicznik.gridy = 1;
							dlugosc = new JLabel();
							dlugosc.setText("Dlugoœæ: ");
								panelOrganizacyjny.add(dlugosc, ogranicznik);
						
						ogranicznik.gridx = 1;
						ogranicznik.gridy = 1;
							dlugoscDane = new JLabel();
							dlugoscDane.setText(lng);
								panelOrganizacyjny.add(dlugoscDane, ogranicznik);
								
						ogranicznik.gridx = 0;
						ogranicznik.gridy = 2;		
							lokalizacja = new JLabel();
							lokalizacja.setText("Lokalizacja: ");
								panelOrganizacyjny.add(lokalizacja, ogranicznik);
								
						ogranicznik.gridx = 1;
						ogranicznik.gridy = 2;
							lokalizacjaDane = new JLabel();
							lokalizacjaDane.setText(loc);
								panelOrganizacyjny.add(lokalizacjaDane, ogranicznik);
								
								
						oknoWyniku = new JFrame();
							oknoWyniku.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							oknoWyniku.setSize(400, 200);
							oknoWyniku.setVisible(true);
							oknoWyniku.setResizable(false);
							oknoWyniku.setLocation(760,440);
							oknoWyniku.setTitle("Wynik");
										
							oknoWyniku.getContentPane().add(BorderLayout.CENTER, panelOrganizacyjny);
							
							przyciskOK = new JButton();
							przyciskOK.setText("Ok");
							przyciskOK.addActionListener(new OkListener());
							
							oknoWyniku.getContentPane().add(BorderLayout.SOUTH, przyciskOK);
		}	
		
		class OkListener implements ActionListener{
			public void actionPerformed(ActionEvent zdarzenie){
					oknoWyniku.dispose();
					}
		}
}
