/*----------------------------------------
Nome: Daniel Agostinho, 29321
Tema: Gestão de Bloco Operetório
File: CadaverModelo.java
Data: 01/02/2025
------------------------------------------*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import SwingComponents.*;

public class ApresentacaoVisao extends JFrame
{
	private PainelSul sul;
	
	public ApresentacaoVisao()
	{
		super("Apresentacao do Projecto"); 
				
		JPanel painelNorte = new JPanel();
	painelNorte.add( new JLabel( new ImageIcon("C:\\Users\\USER\\Documents\\Ucan_2023\\UCAN2024\\FP III\\DanielAgostinho29321\\image\\sd.PNG")));
		
		getContentPane().add(painelNorte, BorderLayout.NORTH);		
		getContentPane().add(sul = new PainelSul(), BorderLayout.SOUTH);
		
		setSize(800, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	
	class PainelSul extends JPanel implements ActionListener
	{
		private JButton entrarJBT, sairJBT;
		
		public PainelSul()
		{
			
			add( entrarJBT = new JButton("Entrar", new ImageIcon("c:\\Users\\USER\\Documents\\Ucan_2023\\UCAN2024\\FP III\\DanielAgostinho29321\\image\\next24.PNG")) );
			add( sairJBT = new JButton("Sair", new ImageIcon("c:\\Users\\USER\\Documents\\Ucan_2023\\UCAN2024\\FP III\\DanielAgostinho29321\\image\\cancel24.PNG")) );
			
			entrarJBT.addActionListener(this);
			sairJBT.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent evt)
		{
			if (evt.getSource() == entrarJBT)
				new MenuPrincipal();
			else
				dispose();
		}
	}
	
	
	public static void main(String args[])
	{
		Vector_Tabelas.inic();
		new ApresentacaoVisao();
	}
}
//ddd