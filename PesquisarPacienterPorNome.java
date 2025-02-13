

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import SwingComponents.*;

public class PesquisarPacientePorNome extends JFrame
{	
	private PainelSul sul;
	private PainelCentro centro;
	
	public  PesquisarPacientePorNome()
	{		
		super("Pesquisar Paciente Por Nome");
		
		
		getContentPane().add( sul = new PainelSul(), BorderLayout.SOUTH);
		getContentPane().add( centro = new PainelCentro(), BorderLayout.CENTER);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	
	class PainelCentro extends JPanel
	{		
		private JComboBox nomesJCB;
		
		
		public PainelCentro()
		{			
			setLayout( new GridLayout(1, 2) );
								
			//linha 1
			add( new JLabel("Escolha o Nome") );
			add( nomesJCB = new JComboBox( PacienteDadosTable.getAllNodes() ) );			
		}		
		
		public String getSelectedNome()
		{
			return String.valueOf( nomesJCB.getSelectedItem() );
		}

		public void pesquisar()
		{
			PacienteDadosTable file = new PacienteDadosTable("PACIENTE.DAT", 100);
			
			PacienteDadosTable node = file.getNode( getSelectedNome() );
			
			JOptionPane.showMessageDialog(null, node.toString());
		}
	}
	
	//-------- class interna Painel Sul -------
	class PainelSul extends JPanel implements ActionListener
	{
		//declaracao de variaveis
		private JButton PesquisarJBT, cancelarJBT;
		
		public PainelSul()
		{
			setLayout( new FlowLayout() );
			
			//instanciar os componentes/Objectos
			PesquisarJBT = new JButton("Pesquisar");
			cancelarJBT = new JButton("Cancelar");
			
			//adicionar os componentes/Objectos no Painel
			add( PesquisarJBT );
			add( cancelarJBT );
			
			PesquisarJBT.addActionListener( this );
			cancelarJBT.addActionListener( this );
		}
		
		public void actionPerformed(ActionEvent evt)
		{
			if (evt.getSource() == PesquisarJBT)
			{
				centro.pesquisar();
				dispose();
			}
			else
				dispose();	//fechar o formulario
		}
	}
	
}