/*----------------------------------------
Nome: Daniel Agostinho, 29321
Tema: Gestão de Bloco Operetório

------------------------------------------*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import SwingComponents.*;

public class MenuPrincipal extends JFrame implements ActionListener
{
	private JMenu ficheiroMenu, operacoesMenu, listagensMenu,
		tabelasMenu, ajudaMenu;
	private JMenu cadaverMenu, entradaMenu, saidaMenu;
	private JMenuItem novoCadaverItem, editarCadaverItem,
		eliminarCadaverItem, novaEntradaItem, editarEntradaItem,
		eliminarEntradaItem, novaSaidaItem, editarSaidaItem, 
		eliminarSaidaItem, sairItem, listarCadaversItem, listarEntradasItem, listarSaidasItem, 
		pesquisarCadaverPorNome, pesquisarCadaverPorGenero;
		
	private JMenuItem provinciasItem, municipiosItem, comunasItem,
			nacionalidadesItem, causaMorteItem;
	private JMenuBar menuBar;
	
	public MenuPrincipal()
	{
		super("Menu Principal");
		
		gerirComponentes();
		
		setJMenuBar( menuBar );
		
		setSize(800, 900);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void gerirComponentes()
	{
		menuBar = new JMenuBar();
		
		menuBar.add(ficheiroMenu = new JMenu("Ficheiro"));
		ficheiroMenu.setMnemonic('F');			
		menuBar.add(operacoesMenu = new JMenu("Operacoes"));
		menuBar.add(listagensMenu = new JMenu("Listagens"));
		menuBar.add(tabelasMenu = new JMenu("Tabelas"));
		menuBar.add(ajudaMenu = new JMenu("Ajuda"));
		
		ficheiroMenu.add(cadaverMenu = new JMenu("Cadavers"));
		
		operacoesMenu.add(entradaMenu = new JMenu("Entradas"));
		operacoesMenu.addSeparator();
		operacoesMenu.add(saidaMenu = new JMenu("Saidas"));
		
		cadaverMenu.add(novoCadaverItem = new JMenuItem("Novo Cadaver"));
		cadaverMenu.add(editarCadaverItem = new JMenuItem("Editar Cadaver"));
		cadaverMenu.add(eliminarCadaverItem = new JMenuItem("Eliminar Cadaver"));
		
		entradaMenu.add(novaEntradaItem = new JMenuItem("Nova Entrada"));		
		entradaMenu.add(editarEntradaItem = new JMenuItem("Editar Entrada"));
		entradaMenu.add(eliminarEntradaItem = new JMenuItem("Eliminar Entrada"));
		
		saidaMenu.add(novaSaidaItem = new JMenuItem("Nova Saida"));		
		saidaMenu.add(editarSaidaItem = new JMenuItem("Editar Saida"));
		saidaMenu.add(eliminarSaidaItem = new JMenuItem("Eliminar Saida"));
				
		ficheiroMenu.addSeparator();		
		ficheiroMenu.add(sairItem = new JMenuItem("Sair da Aplicacao"));
		
		listagensMenu.add(listarCadaversItem = new JMenuItem("Listar Cadaveres"));
		listagensMenu.add(listarEntradasItem = new JMenuItem("Listar Entradas"));
		listagensMenu.add(listarSaidasItem = new JMenuItem("Listar Saidas"));
		listagensMenu.add(pesquisarCadaverPorNome  = new JMenuItem("Pesquisar Cadaver por Nome"));
		listagensMenu.add(pesquisarCadaverPorGenero  = new JMenuItem("Pesquisar Cadaver Por Genero"));
		
		tabelasMenu.add(provinciasItem = new JMenuItem("Provincias"));
		tabelasMenu.add(municipiosItem = new JMenuItem("Municipios"));
		tabelasMenu.add(comunasItem = new JMenuItem("Comunas"));
		tabelasMenu.add(nacionalidadesItem = new JMenuItem("Nacionalidades"));
		tabelasMenu.add(causaMorteItem = new JMenuItem("Causas de Morte"));
				
		novoCadaverItem.addActionListener(this);
		nacionalidadesItem.addActionListener(this);
		sairItem.addActionListener(this);
		
		provinciasItem.addActionListener(this);
		municipiosItem.addActionListener(this);
		comunasItem.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource() == novoCadaverItem)
			new CadaverVisao();
		if (evt.getSource() == nacionalidadesItem)
			Tabela2.editarNovosItems("Nacionalidades.Tab", "Nova Nacionalidade");
		else if (evt.getSource() == provinciasItem)
			Tabela2.editarNovosItems("Provincias.Tab", "Nova Provincia");
		else if (evt.getSource() == municipiosItem)
			Tabela3_2.editarNovosItems("Provincias.Tab", "Municipios.Tab", 
  					"Provincias", "Municipios", "Novo Municipio");
		else if (evt.getSource() == comunasItem)
			Tabela3_3.editarNovosItems("Provincias.Tab", "Municipios.Tab", "Comunas.Tab",
  					"Provincias", "Municipios", "Comunas", "Novo Comuna");
		else if (evt.getSource() == sairItem)
			dispose();
		
			
	}
}
