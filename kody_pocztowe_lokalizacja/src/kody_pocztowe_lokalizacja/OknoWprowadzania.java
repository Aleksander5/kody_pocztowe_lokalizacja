package kody_pocztowe_lokalizacja;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class OknoWprowadzania {
	
		private JLabel kodPocztowy;
			
		private JFrame oknoWprowadzania;
		
		private JPanel panelWprowadzania;
		
		private JTextField poleWprowadzania;
		
		private JButton wspolrzedne;
		private JButton wyjscie;
		
			public void wyswietlOknoWprowadzania() {
				
				panelWprowadzania = new JPanel();
					panelWprowadzania.setLayout( new GridBagLayout());
					
					GridBagConstraints ogranicznik = new GridBagConstraints();
					ogranicznik.insets = new Insets(5, 5, 5, 5);
				
					ogranicznik.gridx = 0;
						kodPocztowy = new JLabel();
						kodPocztowy.setText("Podaj kod pocztowy:");
						panelWprowadzania.add(kodPocztowy, ogranicznik);
						
					ogranicznik.gridx = 1;
						poleWprowadzania = new JTextField(6);
						panelWprowadzania.add(poleWprowadzania, ogranicznik);
						
					ogranicznik.gridx = 0;
					ogranicznik.gridy = 1;
						wspolrzedne = new JButton();
						wspolrzedne.setText("Znajdz Wspó³rzêdne");
						wspolrzedne.addActionListener(new WspolrzedneListener());
						panelWprowadzania.add(wspolrzedne, ogranicznik);
						
					ogranicznik.gridx = 1;
						wyjscie = new JButton();
						wyjscie.setText("Wyjdz");
						wyjscie.addActionListener(new WyjdzListener());
						panelWprowadzania.add(wyjscie, ogranicznik);
					
				oknoWprowadzania = new JFrame();
					oknoWprowadzania.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					oknoWprowadzania.setSize(300, 150);
					oknoWprowadzania.setVisible(true);
					oknoWprowadzania.setResizable(false);
					oknoWprowadzania.setLocation(760,440);
					oknoWprowadzania.setTitle("Kody Pocztowe");
							
					oknoWprowadzania.getContentPane().add(BorderLayout.CENTER, panelWprowadzania);
					
			}
		
	class WyjdzListener implements ActionListener{
			public void actionPerformed(ActionEvent zdarzenie){
					oknoWprowadzania.dispose();
					}
		}
	
	class WspolrzedneListener implements ActionListener{
			public void actionPerformed(ActionEvent zdarzenie){
					String kodPocztowy = poleWprowadzania.getText();
					
					Lokalizacja loc = new Lokalizacja();
					Obieraczka doObrania = new Obieraczka();
					
					OknoWynik oknoWynikowe = new OknoWynik();
					oknoWynikowe.wyswietlOknoWynik(doObrania.ObraneSzerokosc(loc.ZlokalizujWspolrzedne(kodPocztowy)),
													doObrania.ObraneDlugosc(loc.ZlokalizujWspolrzedne(kodPocztowy)), 
													 loc.ZlokalizujObszar(kodPocztowy));
			}
	}
}