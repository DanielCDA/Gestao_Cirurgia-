/******************************************
Projecto de Fundamentos de Programacao III
Tema: Gestao de Bloco Operatório
Nome: Daniel Agostinho, N. 29321
File Name: Analise.java
Data: 28.01.2025
*******************************************/

/*
1. Objectivo
Fazer um sistema para registar a operções em uma área 
específica ddo hospital(Bloco opretório).

2. GUI - Graphic User Interface
	
	ApresentacaoVisao
	LoginVisao
	MenuPrincipalVisao
	cirugiaVisao
	EntradaVisao
	SaidaVisao
	
3. Entidades
	CirugiaModelo
		int id;
		Paciente paciente;
    	Medico medico;
		String tipoCirugia;
    	tring data, hora, sala;
	
	PacienteModelo
		String nomePaciente, bi, nacionalidade, genero, 
			provincia, muncipio, comuna;
		int idade;
		float peso;
		Date dataNascimento;
	
	MedicoModelo
		int idCirugia, telefone;
		String especialidade, nomeMedico;
		Date dataEntrada, dataMorte;
		
	GestaoBloco
		List<Paciente> pacientes;
    	List<Medico> medicos;
    	List<Cirurgia> cirurgias;

4. Persistencia de Dados
4.1 - Tabelas de Apoio /auxiliares
	Provincias.tab
	Municipios.tab
	Comunas.tab
	Cirugia.tab
	Nacionalidades.tab
	
4.2 - Ficheiros de Dados
	paciente.DAT
	cirugia.DAT

5. Implementacao

	Linguagem de Programacao: Java Swing 
	IDE: NotePad++
*/
