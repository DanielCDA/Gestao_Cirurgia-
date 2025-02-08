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

public class MenuPrincipalVisao extends JFrame implements ActionListener
{
	private JMenu menuFicheiro, menuOperacoes, menuListagens, menuTabelas, menuAjuda;
	private JMenuItem novoPacienteItem, editarPaciente, eliminarPaciente, sairItem;
	private JMenuItem entradaIntem, saidaItem;
	private JMenuItem listarPacienteItem, listarEntradasItem, listarSaidasItem;
	private JMenuItem cirugiaItem, nacionalidadesItem, provinciasItem, municipiosItem, comunasItem;
	private JMenuBar menuBar;
		
	public MenuPrincipalVisao()
	{
		super("Menu Principal");
		
		JPanel painelNorte = new JPanel();
		painelNorte.add( new JLabel( new ImageIcon("C:\\Users\\USER\\Documents\\Ucan_2023\\UCAN2024\\FP III\\DanielAgostinho29321\\image\\bloco.PNG")));
		getContentPane().add(painelNorte, BorderLayout.NORTH);			
		
		menuBar = new JMenuBar();

		setJMenuBar( menuBar );
		
		instanciarMenuItems();
		
				
		setSize(710, 650);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	
	class PainelNorte extends JPanel
	{
		
		public PainelNorte()
		{
			setLayout( new FlowLayout() );
			
			JLabel lb = new JLabel(new ImageIcon("C:\\Users\\USER\\Documents\\Ucan_2023\\UCAN2024\\FP III\\DanielAgostinho29321\\image\\bloco.PNG"));
			add( lb );
		}
	}
	
	
	
	
	
	
	public void instanciarMenuItems()
	{
		menuBar.add(menuFicheiro = new JMenu("Ficheiro"));
		menuBar.add(menuOperacoes = new JMenu("Operacoes"));
		menuBar.add(menuListagens = new JMenu("Listagens"));
		menuBar.add(menuTabelas = new JMenu("Tabelas"));
		menuBar.add(menuAjuda = new JMenu("Ajuda"));
				
		menuFicheiro.setMnemonic('F');
		menuOperacoes.setMnemonic('O');
		menuListagens.setMnemonic('L');
		menuTabelas.setMnemonic('T');
		menuAjuda.setMnemonic('A');
				
		//menuFicheiro
		menuFicheiro.add( novoPacienteItem = new JMenuItem("Novo Paciente") );
		menuFicheiro.add( editarPaciente = new JMenuItem("Editar Paciente") );
		menuFicheiro.add( eliminarPaciente = new JMenuItem("Eliminar Paciente") );
		menuFicheiro.addSeparator();
		menuFicheiro.add( sairItem = new JMenuItem("Sair da aplicacao") );	

		//adicionar eventos
		novoPacienteItem.addActionListener(this);	
		sairItem.addActionListener(this);			
	}
	
	
	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource() == novoPacienteItem)
			new PacienteVisao();
		if (evt.getSource() == sairItem)
			dispose();
	}
	
	public static void main(String args[])
	{
		new MenuPrincipalVisao();
	}
}
