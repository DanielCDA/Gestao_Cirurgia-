

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import SwingComponents.*;

public class PesquisarPaciente extends JFrame
{	
	private PainelSul sul;
	private PainelCentro centro;
	
	public PesquisarPaciente()
	{		
		super("Pesquisar Paciente");
		
		
		getContentPane().add( sul = new PainelSul(), BorderLayout.SOUTH);
		getContentPane().add( centro = new PainelCentro(), BorderLayout.CENTER);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	
	class PainelCentro extends JPanel
	{		
		private JComboBox generoJCB;
		private String genero[] = {"Masculino", "Feminino"};
		
		
		public PainelCentro()
		{			
			setLayout( new GridLayout(1, 2) );
								
			//linha 1
			add( new JLabel("Escolha o Genero") );
			add( generoJCB = new JComboBox(genero) );
			
		}		
		
		public String getGenero()
		{
			return String.valueOf( generoJCB.getSelectedItem() );
		}

		public void pesquisar()
		{
			PacienteDadosTable.pesquisarPacientePorGenero( getGenero() );
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