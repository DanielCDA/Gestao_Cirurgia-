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
		painelNorte.add( new JLabel( new ImageIcon("C:\Users\USER\Documents\Ucan_2023\UCAN2024\FP III\DanielAgostinho29321\\image\\LogoRSPServicos.PNG")));
		
		getContentPane().add(painelNorte, BorderLayout.NORTH);		
		getContentPane().add(sul = new PainelSul(), BorderLayout.SOUTH);
		
		setSize(500, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	class PainelSul extends JPanel implements ActionListener
	{
		private JButton entrarJBT, sairJBT;
		
		public PainelSul()
		{
			
			add( entrarJBT = new JButton("Entrar") );
			add( sairJBT = new JButton("Sair") );
			
			entrarJBT.addActionListener(this);
			sairJBT.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent evt)
		{
			if (evt.getSource() == entrarJBT)
				new MenuPrincipalVisao();
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