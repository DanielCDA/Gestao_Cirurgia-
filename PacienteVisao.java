/*----------------------------------------
Nome: Daniel Agostinho, 29321
Tema: Gestão de Bloco Operetório

------------------------------------------*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PacienteVisao extends JFrame
{	
	private PainelSul sul;
	private PainelCentro centro;
	
	public PacienteVisao()
	{
		super("Registar Novo Paciente");
	
		
		getContentPane().add( centro = new PainelCentro(), BorderLayout.CENTER);
		getContentPane().add( sul = new PainelSul(), BorderLayout.SOUTH);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	class PainelCentro extends JPanel
	{
		private JTextField idJTF, nomeJTF, 
			dataNascimentoJTF, pesoJTF;
		private JComboBox generoJCB, nacionalidadeJCB,
			provinciaJCB, municipioJCB, comunaJCB;
		private String nacionalidades[] = {"Angolana", 
				"Brazileira", "Sul Africana", "Americana"};
		
		public PainelCentro()
		{
			setLayout( new GridLayout(9, 2) );
			
			//linha 1
			add( new JLabel("ID") );
			add( idJTF = new JTextField() );
			
			//linha 2
			add( new JLabel("Nome") );
			add( nomeJTF = new JTextField() );
			
			//linha 3
			add( new JLabel("Peso") );
			add( nomeJTF = new JTextField() );
			
			//linha 4
			add( new JLabel("Genero") );
			add( generoJCB = new JComboBox() );
			
			//linha 5
			add( new JLabel("Data de Nascimento") );
			add( dataNascimentoJTF = new JTextField() );
			
			//linha 6
			add( new JLabel("Nacionalidade") );
			add( nacionalidadeJCB = new JComboBox( nacionalidades ) );
			
			//linha 7
			add( new JLabel("Provincia") );
			add( provinciaJCB = new JComboBox() );
			
			//linha 8
			add( new JLabel("Municipio") );
			add( municipioJCB = new JComboBox() );
			
			//linha 9
			add( new JLabel("Comuna") );
			add( comunaJCB = new JComboBox() );
		}
		
	}
	
	class PainelSul extends JPanel implements ActionListener
	{
		private JButton salvarJBT, cancelarJBT;
		
		public PainelSul()
		{
			setLayout( new FlowLayout() );
			
			add( salvarJBT = new JButton("Salvar"));
			add( cancelarJBT = new JButton("Cancelar"));
				
			salvarJBT.addActionListener( this );
			cancelarJBT.addActionListener( this );
		}
		
		public void actionPerformed(ActionEvent evt)
		{
			if (evt.getSource() == salvarJBT)
				JOptionPane.showMessageDialog(null, "Salvar");
			else
				dispose();
		}
	}
	
	public static void main(String args[])
	{
		new PacienteVisao();
	}
}
