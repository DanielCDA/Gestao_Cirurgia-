/*----------------------------------------
Nome: Daniel Agostinho, 29321
Tema: Gestão de Bloco Operetório
File: CadaverModelo.java
Data: 28/01/2025
------------------------------------------*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import SwingComponents.*;
import java.io.*;

public class PacienteModelo 
{
    private int id;
    private StringBufferModelo nomePaciente, nacionalidade, genero, provincia, municipio, comuna, nomeResponsavel;
    private DataModelo dataNascimento;
	
      
    public PacienteModelo()
    {
        id = 0;
        nomePaciente = new StringBufferModelo("", 50);
        nacionalidade = new StringBufferModelo("", 20);
        genero = new StringBufferModelo("", 10);
        provincia = new StringBufferModelo("", 20);
        municipio = new StringBufferModelo("", 20);
        comuna = new StringBufferModelo("", 20);
        nomeResponsavel = new StringBufferModelo("", 50);
        dataNascimento = new DataModelo("11-11-1975");
    }
	
	public PacienteModelo(int id, String nomePaciente, String nacionalidade, String genero, String provincia, String municipio, 
							String comuna, String nomeResponsavel, String dataNascimento)
    {
        this.id = 0;
        this.nomePaciente = new StringBufferModelo(nomePaciente, 50);
        this.nacionalidade = new StringBufferModelo(nacionalidade, 20);
        this.genero = new StringBufferModelo(genero, 10);
        this.provincia = new StringBufferModelo(provincia, 20);
        this.municipio = new StringBufferModelo(municipio, 20);
        this.comuna = new StringBufferModelo(comuna, 20);
        this.nomeResponsavel = new StringBufferModelo(nomeResponsavel, 50);
        this.dataNascimento = new DataModelo("11-11-1975");
    }

//---- metodos get
	public int getId()
	{
		return id;
	}
	public String getNome()
	{
		return nomePaciente.toStringEliminatingSpaces();
	}
	public String getNacionalidade()
	{
		return nacionalidade.toStringEliminatingSpaces();
	}
	public String getGenero()
	{
		return genero.toStringEliminatingSpaces();
	}
	public String getProvincia()
	{
		return provincia.toStringEliminatingSpaces();
	}
	public String getMunicipio()
	{
		return municipio.toStringEliminatingSpaces();
	}
	public String getComuna()
	{
		return comuna.toStringEliminatingSpaces();
	}
	public String getnomeResponsavel()
	{
		return nomeResponsavel.toStringEliminatingSpaces();
	}
	public String getDataNascimento()
	{
		return dataNascimento.toString();
	}
	
	//---- metodos set
	public void setId(int newId)
	{
		id = newId;
	}
	public void setNome(String newName)
	{
		nomePaciente = new StringBufferModelo(newName, 50);
	}
	public void setNacionalidade(String newNacionalidade)
	{
		nacionalidade = new StringBufferModelo(newNacionalidade, 20);
	}
	public void setGenero(String newGenero)
	{
		genero = new StringBufferModelo(newGenero, 10);
	}
	public void setProvincia(String newProvincia)
	{
		provincia = new StringBufferModelo(newProvincia, 20);
	}
	public void setMunicipio(String newMunicipio)
	{
		municipio = new StringBufferModelo(newMunicipio, 20);
	}
	public void setComuna(String newComuna)
	{
		comuna = new StringBufferModelo(newComuna, 20);
	}
	public void setnomeResponsavel(String newnomeResponsavel)
	{
		nomeResponsavel = new StringBufferModelo(newnomeResponsavel, 20);
	}
	public void setDataNascimento(String novaData)
	{
		dataNascimento = new DataModelo(novaData);
	}
	
	public String toString()
	{
		String str = "Dados do Cadaver no Modelo\n\n";
		
		str += "Nome: " + getNome() + "\n";
		
		return str;
	}
	
	public long sizeof()
	{
		return 296;
	}
	
	public void write(RandomAccessFile stream)
	{
		try
		{
			stream.writeInt(id);
			nomePaciente.write(stream);
			nacionalidade.write(stream);
			genero.write(stream);
			provincia.write(stream);
			municipio.write(stream);
			comuna.write(stream);
			nomeResponsavel.write(stream);
			dataNascimento.write(stream);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	public void read(RandomAccessFile stream)
	{
		try
		{
			id = stream.readInt();
			nomePaciente.read(stream);
			nacionalidade.read(stream);
			genero.read(stream);
			provincia.read(stream);
			municipio.read(stream);
			comuna.read(stream);
			nomeResponsavel.read(stream);
			dataNascimento.read(stream);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
    
}
